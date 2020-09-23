package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Attendee;
import com.lambdaschool.usermodel.models.Category;
import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.repository.AttendeeRepository;
import com.lambdaschool.usermodel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "attendeeService")
public class AttendeeServiceImpl implements AttendeeService
{
    @Autowired
    private AttendeeRepository attendeeRepository;

    @Autowired
    private UserRepository userrepos;

    @Transactional
    @Override
    public Attendee save(
        Event event,
        User user)
    {
        Attendee newAttend = new Attendee(event, user);

        return attendeeRepository.save(newAttend);
    }

    @Transactional
    @Override
    public Attendee save(Event event)
    {
        Authentication authentication = SecurityContextHolder
            .getContext()
            .getAuthentication();
        String primaryEmail = authentication.getName();

        User currentUSer = userrepos.findByPrimaryemail(primaryEmail);

        Attendee newAttend = new Attendee(event, currentUSer);

        return attendeeRepository.save(newAttend);
    }

    @Override
    public List<Attendee> findAll()
    {
        List<Attendee> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        attendeeRepository.findAll()
            .iterator()
            .forEachRemaining(list::add);
        return list;
    }
}
