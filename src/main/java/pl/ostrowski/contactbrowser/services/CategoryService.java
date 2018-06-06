package pl.ostrowski.contactbrowser.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pl.ostrowski.contactbrowser.entities.Category;
import pl.ostrowski.contactbrowser.repositories.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Cacheable("categories")
    public List<Category> getTreeOfCategories() {
        List<Category> allCategories = categoryRepository.findAll();
        List<Category> parents = allCategories.stream().filter(c -> c.getParentID() == null).collect(Collectors.toList());
        allCategories.removeAll(parents);
        findSubCategories(parents, allCategories);
        return parents;
    }

    private void findSubCategories(List<Category> parents,  List<Category> allCategories) {
        if(parents == null || parents.isEmpty()) {
            return;
        }
        for(Category parent : parents) {
            List<Category> subCategories = allCategories.stream().filter(c -> c.getParentID().equals(parent.getID())).collect(Collectors.toList());
            parent.setSubCategories(subCategories);
            findSubCategories(subCategories, allCategories);
        }
    }
}