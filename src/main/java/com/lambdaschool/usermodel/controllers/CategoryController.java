package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.models.Category;
import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.services.CategoryService;
import com.lambdaschool.usermodel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping(value = "/events")
public class CategoryController
{
    @Autowired
    private CategoryService categoryService;

    /**
     * Returns a list of all events
     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/events/events">https://eschoolinthecloud.herokuapp.com/events/events</a>
     *
     * @return A JSON list of users you seek
     * @see UserService#findAll() tosServic.findAll()
     */
    @GetMapping(value = "/categories",
        produces = "application/json")
    public ResponseEntity<?> findAll()
    {
        List<Category> events = categoryService.findAll();
        return new ResponseEntity<>(events,
            HttpStatus.OK);
    }

    /**
     * Returns a single user based off a user id number
     * <br>Example: https://eschoolinthecloud.herokuapp.com/users/user/7
     *
     * @param categoryId The primary key of the user you seek
     * @return JSON object of the user you seek
     * @see CategoryService#findCategoryById(long) CategoryService.findCategoryrById(long)
     */
    @GetMapping(value = "/category/{categoryId}",
        produces = "application/json")
    public ResponseEntity<?> getUserById(
        @PathVariable
            Long categoryId)
    {
        Category c = categoryService.findCategoryById(categoryId);
        return new ResponseEntity<>(c,
            HttpStatus.OK);
    }
}
