package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Attendee;
import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.models.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AttendeeService
{
    Attendee save(
        Event event,
        User user);

    Attendee save(Event event);

    Attendee save(Attendee attendee);

    List<Attendee> findAll();
}
