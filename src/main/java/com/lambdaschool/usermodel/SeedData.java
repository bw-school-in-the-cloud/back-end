package com.lambdaschool.usermodel;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import com.lambdaschool.usermodel.models.*;
import com.lambdaschool.usermodel.services.RoleService;
import com.lambdaschool.usermodel.services.TOSService;
import com.lambdaschool.usermodel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;

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
        String t1Text = "All changes are intended to describe, in plain English, the nature and scope of the corresponding source code.";

        long t2Id = 1001;
        String t2Text = "Internet or similar exemptions of copyright (separated by comma, not as a whole which is a work based on (or derived from) the Work and, in such a way for the licensee would be to refrain entirely from distribution";

        long t3Id = 1002;
        String t3text = "Hereinafter in this Agreement. Article 5 (Governing Law) 1. IPA may publish new versions (including revisions) of this License either on the Internet using the software, and you want it, that you receive from any Contributor.";

        tosService.save(t1Id, t1Text);
        tosService.save(t2Id, t2Text);
        tosService.save(t3Id, t3text);

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