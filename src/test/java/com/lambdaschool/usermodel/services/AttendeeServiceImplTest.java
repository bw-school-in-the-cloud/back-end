package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.UserModelApplication;
import com.lambdaschool.usermodel.models.Attendee;
import com.lambdaschool.usermodel.models.Category;
import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.models.User;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserModelApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AttendeeServiceImplTest
{
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private AttendeeService attendeeService;

    @Autowired
    private UserService userService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private EventService eventService;

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
    public void save()
    {
        Category c5 = new Category("TEST");
        c5 = categoryService.save(c5);
        Event event = new Event("Seventh", "Test Event", 3.5, c5);
        event = eventService.save(event);

        User user = new User("test", "testpass", "em@d.c");
        user = userService.save(user);

        Attendee newAttend = new Attendee(event, user);

        attendeeService.save(newAttend);
    }

    @Test
    public void testSave()
    {
        Category c5 = new Category("TESTTWO");
        c5 = categoryService.save(c5);
        Event event = new Event("Eight", "Test Event", 3.5, c5);
        event = eventService.save(event);

        User user = new User("testtttttttt", "testpass", "eeem@deeeee.c");
        user = userService.save(user);

        Attendee newAttend = new Attendee(event, user);

        attendeeService.save(newAttend);
    }

    @Test
    public void testSave1()
    {
        Category c5 = new Category("TESTTWO");
        c5 = categoryService.save(c5);
        Event event = new Event("Eight", "Test Event", 3.5, c5);
        event = eventService.save(event);

        User user = new User("testttttt", "testpass", "ee@deeeee.c");
        user = userService.save(user);
        User currentUSer = userService.findByPrimaryemail("ee@deeeee.c");

        Attendee newAttend = new Attendee(event, currentUSer);

        attendeeService.save(newAttend);
    }

    @Test
    public void findAll()
    {
        assertEquals(5, attendeeService.findAll().size());
    }
}