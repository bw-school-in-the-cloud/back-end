package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.services.EventService;
import com.lambdaschool.usermodel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
