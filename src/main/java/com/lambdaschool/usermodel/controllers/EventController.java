package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.services.EventService;
import com.lambdaschool.usermodel.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(value = "/events")
public class EventController
{
    @Autowired
    private EventService eventService;

    /**
     * Returns a list of all events
     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/events/events">https://eschoolinthecloud.herokuapp.com/events/events</a>
     *
     * @return A JSON list of users you seek
     * @see UserService#findAll() tosServic.findAll()
     */
    @GetMapping(value = "/events",
        produces = "application/json")
    public ResponseEntity<?> findAll()
    {
        List<Event> events = eventService.findAll();
        return new ResponseEntity<>(events,
            HttpStatus.OK);
    }

    /**
     * Returns a single user based off a user id number
     * <br>Example: https://eschoolinthecloud.herokuapp.com/users/user/7
     *
     * @param eventId The primary key of the user you seek
     * @return JSON object of the user you seek
     * @see UserService#findUserById(long) UserService.findUserById(long)
     */
    @GetMapping(value = "/event/{eventId}",
        produces = "application/json")
    public ResponseEntity<?> getEventById(
        @PathVariable
            Long eventId)
    {
        Event e = eventService.findEventById(eventId);
        return new ResponseEntity<>(e,
            HttpStatus.OK);
    }

    /**
     * Return a user object based on a given username
     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/users/user/name/cinnamon">https://eschoolinthecloud.herokuapp.com/users/user/name/cinnamon</a>
     *
     * @param eventName the name of user (String) you seek
     * @return JSON object of the user you seek
     * @see UserService#findEventByName(String) UserService.findByName(String)
     */
    @GetMapping(value = "/event/name/{eventName}",
        produces = "application/json")
    public ResponseEntity<?> getEventByName(
        @PathVariable
            String eventName)
    {
        Event e = eventService.findEventByName(eventName);
        return new ResponseEntity<>(e,
            HttpStatus.OK);
    }

//    /**
//     * Returns a list of users whose username contains the given substring
//     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/users/user/name/like/da">https://eschoolinthecloud.herokuapp.com/users/user/name/like/da</a>
//     *
//     * @param eventName Substring of the username for which you seek
//     * @return A JSON list of users you seek
//     * @see UserService#findByEventNameContaining(String) UserService.findByNameContaining(String)
//     */
//    @GetMapping(value = "/event/name/like/{eventName}",
//        produces = "application/json")
//    public ResponseEntity<?> getEventLikeName(
//        @PathVariable
//            String eventName)
//    {
//        List<Event> e = eventService.findByNameContaining(eventName);
//        return new ResponseEntity<>(e,
//            HttpStatus.OK);
//    }

    /**
     * Given a complete User Object, create a new User record and accompanying useremail records
     * and user role records.
     * <br> Example: <a href="https://eschoolinthecloud.herokuapp.com/users/user">https://eschoolinthecloud.herokuapp.com/users/user</a>
     *
     * @param newuser A complete new user to add including emails and roles.
     *                roles must already exist.
     * @return A location header with the URI to the newly created user and a status of CREATED
     * @throws URISyntaxException Exception if something does not work in creating the location header
     * @see UserService#save(User) UserService.save(User)
     */
    @PostMapping(value = "/event",
        consumes = "application/json")
    public ResponseEntity<?> addNewEvent(
        @Valid
        @RequestBody
            Event newevent) throws
                          URISyntaxException
    {
        newevent.setEventid(0);
        newevent = eventService.save(newevent);

        // set the location header for the newly created resource
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newUserURI = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{userid}")
            .buildAndExpand(newevent.getEventid())
            .toUri();
        responseHeaders.setLocation(newUserURI);

        return new ResponseEntity<>(null,
            responseHeaders,
            HttpStatus.CREATED);
    }

    /**
     * Given a complete User Object
     * Given the user id, primary key, is in the User table,
     * replace the User record and Useremail records.
     * Roles are handled through different endpoints
     * <br> Example: <a href="https://eschoolinthecloud.herokuapp.com/users/user/15">https://eschoolinthecloud.herokuapp.com/users/user/15</a>
     *
     * @param updateEvent A complete User including all emails and roles to be used to
     *                   replace the User. Roles must already exist.
     * @param eventid     The primary key of the user you wish to replace.
     * @return status of OK
     * @see UserService#save(User) UserService.save(User)
     */
    @PutMapping(value = "/event/{eventid}",
        consumes = "application/json")
    public ResponseEntity<?> updateFullEvent(
        @Valid
        @RequestBody
            Event updateEvent,
        @PathVariable
            long eventid)
    {
        updateEvent.setEventid(eventid);
        eventService.save(updateEvent);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Updates the user record associated with the given id with the provided data. Only the provided fields are affected.
     * Roles are handled through different endpoints
     * If an email list is given, it replaces the original emai list.
     * <br> Example: <a href="https://eschoolinthecloud.herokuapp.com/users/user/7">https://eschoolinthecloud.herokuapp.com/users/user/7</a>
     *
     * @param updateEvent An object containing values for just the fields that are being updated. All other fields are left NULL.
     * @param id         The primary key of the user you wish to update.
     * @return A status of OK
     * @see UserService#update(Event, long) UserService.update(User, long)
     */
    @PatchMapping(value = "/event/{id}",
        consumes = "application/json")
    public ResponseEntity<?> updateUser(
        @RequestBody
            Event updateEvent,
        @PathVariable
            long id)
    {
        eventService.update(updateEvent,
            id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Deletes a given user along with associated emails and roles
     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/users/user/14">https://eschoolinthecloud.herokuapp.com/users/user/14</a>
     *
     * @param id the primary key of the user you wish to delete
     * @return Status of OK
     */
    @DeleteMapping(value = "/user/{id}")
    public ResponseEntity<?> deleteEventById(
        @PathVariable
            long id)
    {
        eventService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
