package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.models.*;
import com.lambdaschool.usermodel.repository.AttendeeRepository;
import com.lambdaschool.usermodel.repository.UserRepository;
import com.lambdaschool.usermodel.services.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/events/dates/users")
public class AttendeeController
{

    @Autowired
    private AttendeeService attendeeService;


    @GetMapping(value = "/events",
        produces = "application/json")
    public ResponseEntity<?> findAll()
    {
        List<Attendee> attendeeList = attendeeService.findAll();
        return new ResponseEntity<>(attendeeList,
            HttpStatus.OK);
    }

    @PostMapping(value = "/attendee",
        consumes = "application/json")
    public ResponseEntity<?> addNewAttendee(
        @Valid
        @RequestBody
            Attendee attendee)
    {

        // ids are not recognized by the Post method
        Attendee newAttend = new Attendee(attendee.getEvent(), attendee.getUser());

        newAttend = attendeeService.save(newAttend);

        // set the location header for the newly created resource
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newRoleURI = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{attendeeid}")
            .buildAndExpand(newAttend.getUser().getUserid())
            .toUri();
        responseHeaders.setLocation(newRoleURI);

        return new ResponseEntity<>(null,
            responseHeaders,
            HttpStatus.CREATED);
    }
}
