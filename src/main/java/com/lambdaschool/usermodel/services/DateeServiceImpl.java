package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;

import com.lambdaschool.usermodel.models.Datee;
import com.lambdaschool.usermodel.repository.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "dateeService")
public class DateeServiceImpl implements DateeService
{
    @Autowired
    private com.lambdaschool.usermodel.repository.DateeRepository dateeRepository;

    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Datee> findAll()
    {
        List<Datee> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        dateeRepository.findAll()
            .iterator()
            .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Datee finddateeById(long id)
    {
        return dateeRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Category ID: " + id + " not found!"));
    }

    @Override
    public Datee save(Datee datee)
    {
        Datee addDate = new Datee();

        if (datee.getEventdateid() != 0)
        {
            dateeRepository.findById(datee.getEventdateid())
                .orElseThrow(() -> new ResourceNotFoundException("Event Date ID: " + datee.getEventdateid() + " not found!"));
            addDate.setEventdateid(datee.getEventdateid());
        }

        addDate.setTimeminute(datee.getTimeminute());

        if (datee.getTimedigital() == 0 || datee.getTimedigital() == 24)
        {
            addDate.setTimeimperialsuffix("AM");
            addDate.setTimeimperial(12);
        }else if (datee.getTimedigital() < 12)
        {
            addDate.setTimeimperialsuffix("AM");
            addDate.setTimeimperial(datee.getTimedigital());
        }else if (datee.getTimedigital() > 12)
        {
            addDate.setTimeimperialsuffix("PM");
            addDate.setTimeimperial(datee.getTimedigital() - 12);
        }

        addDate.setTimedigital(datee.getTimedigital());
        addDate.setEventmonth(datee.getEventmonth());

        if (datee.getEventmonth() == 1)
        {
            addDate.setEventmonthname("January");
        }else if (datee.getEventmonth() == 2)
        {
            addDate.setEventmonthname("February");
        }else if (datee.getEventmonth() == 3)
        {
            addDate.setEventmonthname("March");
        }else if (datee.getEventmonth() == 4)
        {
            addDate.setEventmonthname("April");
        }else if (datee.getEventmonth() == 5)
        {
            addDate.setEventmonthname("May");
        }else if (datee.getEventmonth() == 6)
        {
            addDate.setEventmonthname("June");
        }else if (datee.getEventmonth() == 7)
        {
            addDate.setEventmonthname("July");
        }else if (datee.getEventmonth() == 8)
        {
            addDate.setEventmonthname("August");
        }else if (datee.getEventmonth() == 9)
        {
            addDate.setEventmonthname("September");
        }else if (datee.getEventmonth() == 10)
        {
            addDate.setEventmonthname("October");
        }else if (datee.getEventmonth() == 11)
        {
            addDate.setEventmonthname("November");
        }else if (datee.getEventmonth() == 12)
        {
            addDate.setEventmonthname("December");
        }

        addDate.setEventday(datee.getEventday());
        addDate.setEventyear(datee.getEventyear());

        if (datee.getTimezone() == null)
        {
            addDate.setTimezone("PDT");
        }

        String displayMin = new String();

        if (addDate.getTimeminute() < 10)
        {
            displayMin = "0" + addDate.getTimeminute();
        } else {
            displayMin = String.valueOf(addDate.getTimeminute());
        }

        addDate.setDisplay(addDate.getTimeimperial() + ":" + displayMin + " " + addDate.getTimeimperialsuffix() + " " + addDate.getEventmonthname() + " " + addDate.getEventday() + ", " + addDate.getEventyear());
        addDate.setDisplaytime(addDate.getTimeimperial() + ":" + displayMin + " " + addDate.getTimeimperialsuffix());

        return dateeRepository.save(addDate);
    }
}
