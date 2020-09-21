package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.models.Category;

import com.lambdaschool.usermodel.models.Datee;
import com.lambdaschool.usermodel.models.TOS;
import com.lambdaschool.usermodel.services.CategoryService;

import com.lambdaschool.usermodel.services.DateeService;
import com.lambdaschool.usermodel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/events")
public class DateeController
{
    @Autowired
    private DateeService dateeService;

    /**
     * Returns a list of terms of service
     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/terms/terms">https://eschoolinthecloud.herokuapp.com/terms/terms</a>
     *
     * @return A JSON list of users you seek
     * @see UserService#findAll() tosServic.findAll()
     */
    @GetMapping(value = "/dates",
        produces = "application/json")
    public ResponseEntity<?> findAll()
    {
        List<Datee> eventdates = dateeService.findAll();
        return new ResponseEntity<>(eventdates,
            HttpStatus.OK);
    }

    /**
     * Returns a single user based off a user id number
     * <br>Example: https://eschoolinthecloud.herokuapp.com/users/user/7
     *
     * @param dateeId The primary key of the user you seek
     * @return JSON object of the user you seek
     * @see DateeService#finddateeById(long) (long) dateeService.finddateeById(long)
     */
    @GetMapping(value = "/date/{dateeId}",
        produces = "application/json")
    public ResponseEntity<?> getUserById(
        @PathVariable
            Long dateeId)
    {
        Datee e = dateeService.finddateeById(dateeId);
        return new ResponseEntity<>(e,
            HttpStatus.OK);
    }
}
