package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.UserModelApplication;
import com.lambdaschool.usermodel.models.Category;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserModelApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CategoryServiceImplTest
{
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private CategoryService categoryService;

    @Before
    public void setUp() throws Exception
    {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void a_findAll()
    {
        assertEquals(8, categoryService.findAll().size());
    }

    @Test
    public void b_findCategoryById()
    {
        assertEquals("Uncategorized", categoryService.findCategoryById(25).getName());
    }

    @Test
    public void c_update()
    {
        Category test = new Category("Technology");
        test = categoryService.update(26, test);
        assertEquals("Tech", test.getName());
    }

    @Test
    public void d_findCategoryByName()
    {
        assertEquals(25, categoryService.findCategoryByName("Uncategorized").getCategoryid());
    }

    @Test
    public void e_save()
    {
        Category testSave = new Category("Tester");
        testSave = categoryService.save(testSave);

        assertEquals(9, categoryService.findAll().size());
    }

}