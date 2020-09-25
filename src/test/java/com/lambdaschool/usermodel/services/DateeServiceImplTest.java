package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.UserModelApplication;
import com.lambdaschool.usermodel.models.Datee;
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
public class DateeServiceImplTest
{
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private  DateeService dateeService;

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
        assertEquals(9, dateeService.findAll().size());
    }

    @Test
    public void b_finddateeById()
    {
        assertEquals("December", dateeService.finddateeById(19).getEventmonthname());
    }

    @Test
    public void c_save()
    {
        Datee date2 = new Datee(30,12,5,30,2021);
        date2 = dateeService.save(date2);

        assertEquals(10, dateeService.findAll().size());
    }
}