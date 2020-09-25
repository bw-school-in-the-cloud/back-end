package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.UserModelApplication;
import com.lambdaschool.usermodel.models.Role;
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
public class RoleServiceImplTest
{
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private RoleService roleService;

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
        assertEquals(3, roleService.findAll().size());
    }

    @Test
    public void b_findRoleById()
    {
        assertEquals("admin", roleService.findRoleById(1).getName().toLowerCase());
    }

    @Test
    public void c_findByName()
    {
        assertEquals("ADMIN", roleService.findByName("ADMIN").getName());
    }

    @Test
    public void d_save()
    {
        Role save = new Role("test");
        save = roleService.save(save);

        assertEquals("test", save.getName().toLowerCase());
    }

    @Test
    public void f_deleteAll()
    {
        roleService.deleteAll();
    }

    @Test
    public void e_update()
    {
        Role test2 = new Role("testtwo");
        roleService.update(3, test2);

        assertEquals("testtwo", roleService.findRoleById(3).getName().toLowerCase());
    }
}