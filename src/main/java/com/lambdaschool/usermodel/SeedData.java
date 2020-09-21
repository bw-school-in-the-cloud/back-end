package com.lambdaschool.usermodel;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import com.lambdaschool.usermodel.models.*;
import com.lambdaschool.usermodel.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * SeedData puts both known and random data into the database. It implements CommandLineRunner.
 * <p>
 * CoomandLineRunner: Spring Boot automatically runs the run method once and only once
 * after the application context has been loaded.
 */
@Transactional
@Component
public class SeedData
        implements CommandLineRunner
{
    /**
     * Connects the Role Service to this process
     */
    @Autowired
    RoleService roleService;

    /**
     * Connects the user service to this process
     */
    @Autowired
    UserService userService;

    /**
     * Connects the TOS service to this process
     */
    @Autowired
    TOSService tosService;

    /**
     * Connects the datee service to this process
     */
    @Autowired
    DateeService dateeService;

    /**
     * Connects the event service to this process
     */
    @Autowired
    EventService eventService;

    /**
     * Connects the category service to this process
     */
    @Autowired
    CategoryService categoryService;

    /**
     * Generates test, seed data for our application
     * First a set of known data is seeded into our database.
     * Second a random set of data using Java Faker is seeded into our database.
     * Note this process does not remove data from the database. So if data exists in the database
     * prior to running this process, that data remains in the database.
     *
     * @param args The parameter is required by the parent interface but is not used in this process.
     */
    @Transactional
    @Override
    public void run(String[] args) throws
            Exception
    {
        userService.deleteAll();
        roleService.deleteAll();

        Role r1 = new Role("admin");
        Role r2 = new Role("student");
        Role r3 = new Role("volunteer");

        r1 = roleService.save(r1);
        r2 = roleService.save(r2);
        r3 = roleService.save(r3);

        // admin, data, user
        User u1 = new User("admin",
                           "admin",
                           "admin@lambdaschool.local");
        u1.getRoles()
                .add(new UserRoles(u1, r1));
        u1.getRoles()
                .add(new UserRoles(u1, r2));
        u1.getRoles()
                .add(new UserRoles(u1, r3));
        u1.getUseremails()
                .add(new Useremail(u1,
                                   "admin@email.local"));
        u1.getUseremails()
                .add(new Useremail(u1,
                                   "admin@mymail.local"));

        userService.save(u1);

        // data, user
        User u2 = new User("student",
                           "student",
                           "student@lambdaschool.local");
        u2.getRoles()
                .add(new UserRoles(u2, r2));
        u2.getUseremails()
                .add(new Useremail(u2,
                                   "student@mymail.local"));
        userService.save(u2);

        // user
        User u3 = new User("volunteer",
                           "volunteer",
                           "volunteer@lambdaschool.local");
        u3.getRoles()
                .add(new UserRoles(u3, r3));
        u3.getUseremails()
                .add(new Useremail(u3,
                                   "volunteer@email.local"));
        userService.save(u3);

        long t1Id = 1000;
        String t1Text = "You agree that by accessing the Site, you have read, understood, and agree to be bound by all of these Terms and Conditions.";

        long t2Id = 1001;
        String t2Text = "If you do not agree with all of these Terms and Conditions, then you are expressly prohibited from using the Site and you must discontinue use immediately.\n";

        long t3Id = 1002;
        String t3Text = "Supplemental terms and conditions or documents that may be posted on the Site from time to time are hereby expressly incorporated herein by reference.";

        long t4Id = 1003;
        String t4Text = "We reserve the right, in our sole discretion, to make changes or modifications to these Terms and Conditions at any time and for any reason.\n";

        long t5Id = 1004;
        String t5Text = "We will alert you about any changes by updating the “Last updated” date of these Terms and Conditions, and you waive any right to receive specific notice of each such change.";

        tosService.save(t1Id, t1Text);
        tosService.save(t2Id, t2Text);
        tosService.save(t3Id, t3Text);
        tosService.save(t4Id, t4Text);
        tosService.save(t5Id, t5Text);


        Datee date2 = new Datee(0,2,6,24,2021);
        Datee date3 = new Datee(30,18,10,24,2020);
        Datee date4 = new Datee(30,20,12,4,2020);
        Datee date5 = new Datee(0,11,12,14,2020);
        Datee date6 = new Datee(0,19,11,24,2020);
        Datee date7 = new Datee(30,24,9,30,2020);
        Datee date8 = new Datee(30,2,6,11,2021);
        Datee date9 = new Datee(0,1,2,28,2021);
        Datee date10 = new Datee(30,0,3,19,2021);

        date2 = dateeService.save(date2);
        date3 = dateeService.save(date3);
        date4 = dateeService.save(date4);
        date5 = dateeService.save(date5);
        date6 = dateeService.save(date6);
        date7 = dateeService.save(date7);
        date8 = dateeService.save(date8);
        date9 = dateeService.save(date9);
        date10 = dateeService.save(date10);

        Category c1 = new Category("Uncategorized");
        Category c2 = new Category("Tech");
        Category c3 = new Category("Science");
        Category c4 = new Category("Literature");
        Category c5 = new Category("Gaming");
        Category c6 = new Category("Entertainment");

        c1 = categoryService.save(c1);
        c2 = categoryService.save(c2);
        c3 = categoryService.save(c3);
        c4 = categoryService.save(c4);
        c5 = categoryService.save(c5);
        c6 = categoryService.save(c6);

        Event e1 = new Event("First", "Test Event", 1.5, c1);
        e1.getEventdates().add(new EventDate(date2, new Event()));
        e1.getEventdates().add(new EventDate(date5, new Event()));

        Event e2 = new Event("Second", "Test Event", 3.0, c1);
        e2.getEventdates().add(new EventDate(date2, new Event()));
        e2.getEventdates().add(new EventDate(date6, new Event()));
        e2.getEventdates().add(new EventDate(date5, new Event()));

        Event e3 = new Event("Third", "Test Event", 0.5, c1);
        e3.getEventdates().add(new EventDate(date7, new Event()));

        Event e4 = new Event("Fourth", "Test Event", 5.0, c4);
        e3.getEventdates().add(new EventDate(date7, new Event()));
        e3.getEventdates().add(new EventDate(date9, new Event()));

        Event e5 = new Event("Fifth", "Test Event", 3.5, c5);

        Event e6 = new Event("Sixth Event", "Test Event", 2.5, c6);
        e6.getEventdates().add(new EventDate(date2, new Event()));
        e6.getEventdates().add(new EventDate(date4, new Event()));
        e6.getEventdates().add(new EventDate(date5, new Event()));
        e6.getEventdates().add(new EventDate(date7, new Event()));

        e1 = eventService.save(e1);
        e2 = eventService.save(e2);
        e3 = eventService.save(e3);
        e4 = eventService.save(e4);
        e5 = eventService.save(e5);
        e6 = eventService.save(e6);

//        SessionInfo tz1 = new SessionInfo("Eastern Standard", "EST");

//        ProfileInfo pf1 = new ProfileInfo();


        if (false)
        {
            // using JavaFaker create a bunch of regular users
            // https://www.baeldung.com/java-faker
            // https://www.baeldung.com/regular-expressions-java

            FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-US"),
                                                                        new RandomService());
            Faker nameFaker = new Faker(new Locale("en-US"));

            for (int i = 0; i < 25; i++)
            {
                new User();
                User fakeUser;

                fakeUser = new User(nameFaker.name()
                                            .username(),
                                    "password",
                                    nameFaker.internet()
                                            .emailAddress());
                fakeUser.getRoles()
                        .add(new UserRoles(fakeUser, r2));
                fakeUser.getUseremails()
                        .add(new Useremail(fakeUser,
                                           fakeValuesService.bothify("????##@gmail.com")));
                userService.save(fakeUser);
            }
        }
    }
}