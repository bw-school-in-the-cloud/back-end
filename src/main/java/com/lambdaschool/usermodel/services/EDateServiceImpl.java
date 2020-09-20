package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;
import com.lambdaschool.usermodel.models.EDate;
import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.models.TOS;
import com.lambdaschool.usermodel.repository.EDateRepository;
import com.lambdaschool.usermodel.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "edateService")
public class EDateServiceImpl implements EDateService
{
    @Autowired
    private EDateRepository eDateRepository;

    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<EDate> findAll()
    {
        List<EDate> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        eDateRepository.findAll()
            .iterator()
            .forEachRemaining(list::add);
        return list;
    }

    @Override
    public EDate save(EDate edate)
    {
        EDate addDate = new EDate();

        if (edate.getEventdateid() != 0)
        {
            eDateRepository.findById(edate.getEventdateid())
                .orElseThrow(() -> new ResourceNotFoundException("Event Date ID: " + edate.getEventdateid() + " not found!"));
            addDate.setEventdateid(edate.getEventdateid());
        }

        addDate.setEventminute(edate.getEventminute());
        addDate.setEventhour(edate.getEventhour());

        if (edate.getEventhour() == 0 || edate.getEventhour() == 24)
        {
            addDate.setTimelatinprefix("AM");
            addDate.setTimelatin(12);
        }else if (edate.getEventhour() < 12)
        {
            addDate.setTimelatinprefix("AM");
            addDate.setTimelatin(edate.getEventhour());
        }else if (edate.getEventhour() > 12)
        {
            addDate.setTimelatinprefix("PM");
            addDate.setTimelatin(edate.getEventhour() - 12);
        }

        addDate.setEventmonth(edate.getEventmonth());

        if (edate.getEventmonth() == 1)
        {
            addDate.setEventmonthname("January");
        }else if (edate.getEventmonth() == 2)
        {
            addDate.setEventmonthname("February");
        }else if (edate.getEventmonth() == 3)
        {
            addDate.setEventmonthname("March");
        }else if (edate.getEventmonth() == 4)
        {
            addDate.setEventmonthname("April");
        }else if (edate.getEventmonth() == 5)
        {
            addDate.setEventmonthname("May");
        }else if (edate.getEventmonth() == 6)
        {
            addDate.setEventmonthname("June");
        }else if (edate.getEventmonth() == 7)
        {
            addDate.setEventmonthname("July");
        }else if (edate.getEventmonth() == 8)
        {
            addDate.setEventmonthname("August");
        }else if (edate.getEventmonth() == 9)
        {
            addDate.setEventmonthname("September");
        }else if (edate.getEventmonth() == 10)
        {
            addDate.setEventmonthname("October");
        }else if (edate.getEventmonth() == 11)
        {
            addDate.setEventmonthname("November");
        }else if (edate.getEventmonth() == 2)
        {
            addDate.setEventmonthname("December");
        }

        addDate.setEventday(edate.getEventday());
        addDate.setEventyear(edate.getEventyear());

        return eDateRepository.save(addDate);
    }

}
