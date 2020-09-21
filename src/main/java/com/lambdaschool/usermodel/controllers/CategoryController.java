package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.models.Category;
import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.models.Role;
import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.services.CategoryService;
import com.lambdaschool.usermodel.services.RoleService;
import com.lambdaschool.usermodel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
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
     * @see CategoryService#findAll() CategoryService.findAll()
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
     * Returns a single category based off a user id number
     * <br>Example: https://eschoolinthecloud.herokuapp.com/users/user/7
     *
     * @param categoryId The primary key of the user you seek
     * @return JSON object of the category you seek
     * @see CategoryService#findCategoryById(categoryId) CategoryService.findCategoryrById(long)
     */
    @GetMapping(value = "/category/{categoryId}",
        produces = "application/json")
    public ResponseEntity<?> getCategoryById(
        @PathVariable
            Long categoryId)
    {
        Category c = categoryService.findCategoryById(categoryId);
        return new ResponseEntity<>(c,
            HttpStatus.OK);
    }

    /**
     * The Role with the given name
     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/roles/role/name/data">https://eschoolinthecloud.herokuapp.com/roles/role/name/data</a>
     *
     * @param name The name of the role category seek
     * @return JSON object of the category you seek
     * @see CategoryService#findCategoryByName(String) RoleService.findByName(String)
     */
    @GetMapping(value = "/category/name/{name}",
        produces = "application/json")
    public ResponseEntity<?> getCategoryByName(
        @PathVariable
            String name)
    {
        Category c = categoryService.findCategoryByName(name);
        return new ResponseEntity<>(c,
            HttpStatus.OK);
    }

    /**
     * Given a complete Role object, create a new Role record
     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/events/category">https://eschoolinthecloud.herokuapp.com/events/category</a>
     *
     * @param newCategory A complete new Category object
     * @return A location header with the URI to the newly created role and a status of CREATED
     * @see CategoryService#save(Category) CategoryService.save(Category)
     */
    @PostMapping(value = "/category",
        consumes = "application/json")
    public ResponseEntity<?> addNewCategory(
        @Valid
        @RequestBody
            Category newCategory)
    {
        // ids are not recognized by the Post method
        newCategory.setCategoryid(0);
        newCategory = categoryService.save(newCategory);

        // set the location header for the newly created resource
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newRoleURI = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{roleid}")
            .buildAndExpand(newCategory.getCategoryid())
            .toUri();
        responseHeaders.setLocation(newRoleURI);

        return new ResponseEntity<>(null,
            responseHeaders,
            HttpStatus.CREATED);
    }

    /**
     * The process allows you to update a role name only!
     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/roles/role/3">https://eschoolinthecloud.herokuapp.com/roles/role/3</a>
     *
     * @param categoryid  The primary key (long) of the role you wish to update
     * @param newCategory The new name (String) for the role
     * @return Status of OK
     */
    @PutMapping(value = "/category/{categoryid}",
        consumes = {"application/json"})
    public ResponseEntity<?> putUpdateRole(
        @PathVariable
            long categoryid,
        @Valid
        @RequestBody
            Category newCategory)
    {
        newCategory = categoryService.update(categoryid,
            newCategory);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
