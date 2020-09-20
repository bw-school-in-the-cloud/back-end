package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Event;

import java.util.List;

public interface EventService
{
    Event save(Event event);

    List<Event> findAll();
}
