package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;
import com.lambdaschool.usermodel.models.Datee;
import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.models.EventDate;
import com.lambdaschool.usermodel.repository.DateeRepository;
import com.lambdaschool.usermodel.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "eventService")
public class EventServiceImpl implements EventService
{
    @Autowired
    EventRepository eventRepository;

    @Autowired
    DateeRepository dateeRepository;

    @Autowired
    CategoryService categoryService;

    @Autowired
    UserService userService;

    @Autowired
    private HelperFunctions helperFunctions;

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
    public Event findById(Long eventId)
    {
        return eventRepository.findById(eventId)
            .orElseThrow(() -> new ResourceNotFoundException("Event ID:" + eventId + " not found!"));
    }

    @Override
    public Event findEventByName(String eventName)
    {
        Event ee = eventRepository.findByTitle(eventName);
        if (ee == null)
        {
            throw new ResourceNotFoundException("Event name " + eventName + " not found!");
        }
        return ee;
    }

    @Transactional
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

        if (event.getCategory() != null)
        {
            addEvent.setCategory(categoryService.findCategoryById(event.getCategory().getCategoryid()));
        }else if (event.getCategory() == null){
            addEvent.setCategory(categoryService.findCategoryById(25));
        }

        addEvent.getEventdates().clear();
        for (EventDate e : event.getEventdates())
        {
            Datee adDate = dateeRepository.findById(e.getdatee().getEventdateid())
                .orElseThrow(() -> new ResourceNotFoundException("Event Date ID:" + e.getdatee()
                    .getEventdateid() + " could not be found!"));
            addEvent.getEventdates().add(new EventDate(addEvent, adDate));

            for (EventDate ed : addEvent.getEventdates())
            {
                String ei = ed.getEvent().getCategory().getName() + ": " + ed.getEvent().getDescription();
                String e2 = ed.getdatee().getEventmonthname() + " " + ed.getdatee().getEventday();
                ed.setDuration(ed.getEvent().getLength());
                ed.setEventdateday(e2);
                ed.setEventinfo(ei);
            }
        }
        return eventRepository.save(addEvent);
    }



    @Override
    public List<Event> findByNameContaining(String eventName)
    {
        return eventRepository.findByTitleContainingIgnoreCase(eventName.toLowerCase());
    }

    @Transactional
    @Override
    public Event update(
        Event updateEvent,
        long id)
    {
        Event currentEvent = findById(id);

        if (updateEvent.getTitle() != null)
        {
            currentEvent.setTitle(updateEvent.getTitle());
        }

        if (updateEvent.getDescription() != null)
        {
           currentEvent.setDescription(updateEvent.getDescription());
        }

        if (updateEvent.lengthchange)
        {
            currentEvent.setLength(updateEvent.getLength());

            if (updateEvent.getLength() == 0.5)
            {
                currentEvent.setLengthdesc("30 Minutes");
            }else if (updateEvent.getLength() == 1.0)
            {
                currentEvent.setLengthdesc("One Hour");
            }else if (updateEvent.getLength() == 1.5)
            {
                currentEvent.setLengthdesc("One Hour Thirty Minutes");
            }else if (updateEvent.getLength() == 2.0)
            {
                currentEvent.setLengthdesc("Two Hours");
            }else if (updateEvent.getLength() == 2.5)
            {
                currentEvent.setLengthdesc("Two Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 3.0)
            {
                currentEvent.setLengthdesc("Three Hours");
            }else if (updateEvent.getLength() == 3.5)
            {
                currentEvent.setLengthdesc("Three Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 4.0)
            {
                currentEvent.setLengthdesc("Four Hours");
            }else if (updateEvent.getLength() == 4.5)
            {
                currentEvent.setLengthdesc("Four Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 5.0)
            {
                currentEvent.setLengthdesc("Five Hours");
            }else if (updateEvent.getLength() == 5.5)
            {
                currentEvent.setLengthdesc("Five Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 6.0)
            {
                currentEvent.setLengthdesc("Six Hours");
            }else if (updateEvent.getLength() == 6.5)
            {
                currentEvent.setLengthdesc("Six Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 7.0)
            {
                currentEvent.setLengthdesc("Seven Hours");
            }else if (updateEvent.getLength() == 7.5)
            {
                currentEvent.setLengthdesc("Seven Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 8.0)
            {
                currentEvent.setLengthdesc("Eight Hours");
            }else if (updateEvent.getLength() == 8.5)
            {
                currentEvent.setLengthdesc("Eight Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 9.0)
            {
                currentEvent.setLengthdesc("Nine Hours");
            }else if (updateEvent.getLength() == 9.5)
            {
                currentEvent.setLengthdesc("Nine Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 10.0)
            {
                currentEvent.setLengthdesc("Ten Hours");
            }else if (updateEvent.getLength() == 10.5)
            {
                currentEvent.setLengthdesc("Ten Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 11.0)
            {
                currentEvent.setLengthdesc("Eleven Hours");
            }else if (updateEvent.getLength() == 11.5)
            {
                currentEvent.setLengthdesc("Eleven Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 12.0)
            {
                currentEvent.setLengthdesc("Twelve Hours");
            }else if (updateEvent.getLength() == 12.5)
            {
                currentEvent.setLengthdesc("Twelve Hours Thirty Minutes");
            }else if (updateEvent.getLength() == 13.0)
            {
                currentEvent.setLengthdesc("Thirteen Hours");
            }
        }

        if (updateEvent.getCategory() != null)
        {
            currentEvent.setCategory(categoryService.findCategoryById(updateEvent.getCategory().getCategoryid()));
        }

        currentEvent.getEventdates().clear();
        for (EventDate e : updateEvent.getEventdates())
        {
            Datee adDate = dateeRepository.findById(e.getdatee().getEventdateid())
                .orElseThrow(() -> new ResourceNotFoundException("Event Date ID:" + e.getdatee()
                    .getEventdateid() + " could not be found!"));
            currentEvent.getEventdates().add(new EventDate(currentEvent, adDate));
        }

        return eventRepository.save(currentEvent);
    }

    @Override
    public void delete(long id)
    {

    }
}
