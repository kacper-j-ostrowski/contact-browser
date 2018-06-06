package pl.ostrowski.contactbrowser.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.ostrowski.contactbrowser.entities.Category;
import pl.ostrowski.contactbrowser.services.CategoryService;

import java.util.List;

@RestController
public class CategoryRestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private CategoryService categoryService;

    @Autowired
    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public List<Category> categories() {
        return this.categoryService.getAllCategories();
    }

    @RequestMapping(value = "/category_tree", method = RequestMethod.GET)
    public List<Category> categoryTree() {
        return this.categoryService.getTreeOfCategories();
    }
}
