package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.UserModelApplication;
import com.lambdaschool.usermodel.models.Category;
import com.lambdaschool.usermodel.models.Event;
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
public class EventServiceImplTest
{
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private EventService eventService;

    @Autowired
    private  CategoryService categoryService;

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
        assertEquals(6, eventService.findAll().size());
    }

    @Test
    public void b_findEventById()
    {
        Event test = eventService.findEventByName("First");
        assertEquals("First", eventService.findById(test.getEventid()).getTitle());
    }

    @Test
    public void c_findEventByName()
    {
        assertEquals("Fifth", eventService.findEventByName("Fifth").getTitle());
    }

    @Test
    public void d_save()
    {
        Category c5 = new Category("test");
        c5 = categoryService.save(c5);

        Event e5 = new Event("Seventh", "Test Event", 3.5, c5);
        e5 = eventService.save(e5);

        assertEquals("test", e5.getCategory().getName());
    }

    @Test
    public void e_update()
    {
        Category c6 = new Category("test two");
        c6 = categoryService.save(c6);

        Event e6 = new Event("Sixth", "Test Event", 4.0, c6);
        e6 =eventService.save(e6);

        eventService.update(e6, eventService.findEventByName("Fifth").getEventid());
    }

    @Test
    public void f_delete()
    {
        eventService.delete(31);
        assertEquals(8, eventService.findAll().size());
    }
}