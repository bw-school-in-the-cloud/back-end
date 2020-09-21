package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Event;

import java.util.List;

public interface EventService
{
    Event save(Event event);

    List<Event> findAll();

    Event findEventById(Long eventId);

    Event findEventByName(String eventName);

    Event update(
        Event updateEvent,
        long id);

    void delete(long id);

//    List<Event> findByNameContaining(String eventName);
}
