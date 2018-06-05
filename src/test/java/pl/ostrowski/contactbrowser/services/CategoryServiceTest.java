package pl.ostrowski.contactbrowser.services;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.ostrowski.contactbrowser.entities.Category;
import pl.ostrowski.contactbrowser.repositories.CategoryRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CategoryServiceTest {

    private CategoryService categoryService;

    private CategoryRepository categoryRepository;

    private List<Category> categories;

    @Before
    public void init() {
        categories = new ArrayList<Category>(Arrays.asList(
                new Category(1L, "Main_1", null, null),
                new Category(2L, "Main_2", null, null),
                new Category(3L, "Main_3", null, null),
                new Category(4L, "Sub_Main_1_1", 1L, null),
                new Category(5L, "Sub_Main_1_2", 1L, null),
                new Category(6L, "Sub_Main_1_3", 1L, null),
                new Category(7L, "Sub_Main_2_1", 2L, null),
                new Category(8L, "Sub_Main_2_2", 2L, null),
                new Category(9L, "Sub_Main_2_3", 2L, null),
                new Category(10L, "Sub_Main_3_1", 3L, null),
                new Category(11L, "Sub_Main_3_2", 3L, null),
                new Category(12L, "Sub_Main_3_3", 3L, null),
                new Category(13L, "Sub_Main_3_4", 3L, null),
                new Category(14L, "Sub_Main_3_5", 3L, null),
                new Category(15L, "Sub_Main_1_1_Sub_Main_4_1", 4L, null),
                new Category(16L, "Sub_Main_1_1_Sub_Main_4_2", 4L, null),
                new Category(17L, "Sub_Main_2_1_Sub_Main_7_1", 7L, null),
                new Category(18L, "Sub_Main_2_1_Sub_Main_7_2", 7L, null),
                new Category(19L, "Sub_Main_3_3_Sub_Main_12_1", 12L, null),
                new Category(20L, "Sub_Main_3_3_Sub_Main_12_2", 12L, null),
                new Category(21L, "Sub_Main_3_3_Sub_Main_12_3", 12L, null),
                new Category(22L, "Sub_Main_3_3_Sub_Main_12_4", 12L, null),
                new Category(23L, "Sub_Main_2_4", 2L, null),
                new Category(24L, "Sub_Main_2_5", 2L, null),
                new Category(25L, "Sub_Main_3_3_Sub_Main_12_2_Sub_Main_20_1", 20L, null),
                new Category(26L, "Sub_Main_3_3_Sub_Main_12_2_Sub_Main_20_2", 20L, null),
                new Category(27L, "Sub_Main_3_3_Sub_Main_12_2_Sub_Main_20_3", 20L, null),
                new Category(28L, "Sub_Main_3_3_Sub_Main_12_2_Sub_Main_20_1_Sub_Main_25_1", 25L, null),
                new Category(29L, "Sub_Main_3_3_Sub_Main_12_2_Sub_Main_20_1_Sub_Main_25_2", 25L, null),
                new Category(30L, "Sub_Main_3_3_Sub_Main_12_2_Sub_Main_20_1_Sub_Main_25_3", 25L, null)
        ));
        categoryRepository = mock(CategoryRepository.class);
        when(categoryRepository.findAll()).thenReturn(categories);
        categoryService = new CategoryService(categoryRepository);
    }


    @Test
    public void getAllCategories() {
        List<Category> categories = categoryService.getAllCategories();
        assertEquals(categories.size(), 30);
    }

    @Test
    public void get_all_parents() {
        List<Category> treeOfCategories = categoryService.getTreeOfCategories();
        assertEquals(treeOfCategories.size(), 3);
    }

    @Test
    public void get_first_level_children() {
        List<Category> treeOfCategories = categoryService.getTreeOfCategories();
        assertEquals(treeOfCategories.get(0).getSubCategories().size(), 3);
        assertEquals(treeOfCategories.get(1).getSubCategories().size(), 5);
        assertEquals(treeOfCategories.get(2).getSubCategories().size(), 5);
    }

    @Test
    public void get_second_level_children() {
        List<Category> treeOfCategories = categoryService.getTreeOfCategories();
        assertEquals(treeOfCategories.get(0).getSubCategories().get(0).getSubCategories().size(), 2);
        assertEquals(treeOfCategories.get(1).getSubCategories().get(0).getSubCategories().size(), 2);
        assertEquals(treeOfCategories.get(2).getSubCategories().get(2).getSubCategories().size(), 4);
    }

    @Test
    public void get_third_level_children() {
        List<Category> treeOfCategories = categoryService.getTreeOfCategories();
        assertEquals(treeOfCategories.get(2).getSubCategories().get(2).getSubCategories().get(1).getSubCategories().size(), 3);
    }


    @Test
    public void get_fourth_level_children() {
        List<Category> treeOfCategories = categoryService.getTreeOfCategories();
        assertEquals(treeOfCategories.get(2).getSubCategories().get(2).getSubCategories().get(1).getSubCategories().get(0).getSubCategories().size(), 3);
    }
}