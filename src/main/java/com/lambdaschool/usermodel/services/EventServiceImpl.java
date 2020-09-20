package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;
import com.lambdaschool.usermodel.models.EDate;
import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "eventService")
public class EventServiceImpl implements EventService
{
    @Autowired
    EventRepository eventRepository;

    @Override
    public List<Event> findAll()
    {
        List<Event> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        eventRepository.findAll()
            .iterator()
            .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Event save(Event event)
    {
        Event addEvent = new Event();

        if (event.getEventid() != 0)
        {
            eventRepository.findById(event.getEventid())
                .orElseThrow(() -> new ResourceNotFoundException("Event with ID: " + event.getEventid() + " could not be found!"));
            addEvent.setEventid(event.getEventid());
        }
        addEvent.setTitle(event.getTitle());
        addEvent.setDescription(event.getDescription());
        addEvent.setLength(event.getLength());

        if (event.getLength() == 0.5)
        {
            addEvent.setLengthdesc("30 Minutes");
        }else if (event.getLength() == 1.0)
        {
            addEvent.setLengthdesc("One Hour");
        }else if (event.getLength() == 1.5)
        {
            addEvent.setLengthdesc("One and a Half Hours");
        }else if (event.getLength() == 2.0)
        {
            addEvent.setLengthdesc("Two Hours");
        }else if (event.getLength() == 2.5)
        {
            addEvent.setLengthdesc("Two and a Half Hours");
        }else if (event.getLength() == 3.0)
        {
            addEvent.setLengthdesc("Three Hours");
        }else if (event.getLength() == 3.5)
        {
            addEvent.setLengthdesc("Three and a Half Hours");
        }else if (event.getLength() == 4.0)
        {
            addEvent.setLengthdesc("Four Hours");
        }else if (event.getLength() == 4.5)
        {
            addEvent.setLengthdesc("Four and a Half Hours");
        }else if (event.getLength() == 5.0)
        {
            addEvent.setLengthdesc("Five Hours");
        }else if (event.getLength() == 5.5)
        {
            addEvent.setLengthdesc("Five and a Half Hours");
        }else if (event.getLength() == 6.0)
        {
            addEvent.setLengthdesc("Six Hours");
        }else if (event.getLength() == 6.5)
        {
            addEvent.setLengthdesc("Six and a Half Hours");
        }else if (event.getLength() == 7.0)
        {
            addEvent.setLengthdesc("Seven Hours");
        }else if (event.getLength() == 7.5)
        {
            addEvent.setLengthdesc("Seven and a Half Hours");
        }else if (event.getLength() == 8.0)
        {
            addEvent.setLengthdesc("Eight Hours");
        }else if (event.getLength() == 8.5)
        {
            addEvent.setLengthdesc("Eight and a Half Hours");
        }else if (event.getLength() == 9.0)
        {
            addEvent.setLengthdesc("Nine Hours");
        }else if (event.getLength() == 9.5)
        {
            addEvent.setLengthdesc("Nine and a Half Hours");
        }else if (event.getLength() == 10.0)
        {
            addEvent.setLengthdesc("Ten Hours");
        }else if (event.getLength() == 10.5)
        {
            addEvent.setLengthdesc("Ten and a Half Hours");
        }else if (event.getLength() == 11.0)
        {
            addEvent.setLengthdesc("Eleven Hours");
        }else if (event.getLength() == 11.5)
        {
            addEvent.setLengthdesc("Eleven and a Half Hours");
        }else if (event.getLength() == 12.0)
        {
            addEvent.setLengthdesc("Twelve Hours");
        }else if (event.getLength() == 12.5)
        {
            addEvent.setLengthdesc("Twelve and a Half Hours");
        }else if (event.getLength() == 13.0)
        {
            addEvent.setLengthdesc("One and a Half Hours");
        }

        return eventRepository.save(addEvent);
    }
}
