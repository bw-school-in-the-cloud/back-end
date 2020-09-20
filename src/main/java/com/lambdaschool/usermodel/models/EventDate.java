package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "eventdate")
@IdClass(EventDateId.class)
public class EventDate implements Serializable
{
    @Id
    @ManyToOne
    @JoinColumn(name = "eventid")
    @JsonIgnoreProperties(value = "eventdates")
    private Event event;

    @Id
    @ManyToOne
    @JoinColumn(name = "edateid")
    @JsonIgnoreProperties(value = "eventdates")
    private EDate edate;

    private String eventinfo;
    private String eventdateday;

    public EventDate()
    {
    }

    public EventDate(
        Event event,
        EDate edate)
    {
        this.event = event;
        this.edate = edate;
    }

    public EventDate(
        EDate edate,
        Event event)
    {
        this.edate = edate;
        this.event = event;
    }

    public Event getEvent()
    {
        return event;
    }

    public void setEvent(Event event)
    {
        this.event = event;
    }

    public EDate getEdate()
    {
        return edate;
    }

    public void setEdate(EDate edate)
    {
        this.edate = edate;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof EventDate))
        {
            return false;
        }
        EventDate that = (EventDate) obj;
        return ((event == null) ? 0 : event.getEventid()) == ((that.event == null) ? 0 : that.event.getEventid()) &&
            ((edate == null) ? 0 : edate.getEventdateid()) == ((that.edate == null)? 0 : that.edate.getEventdateid());

    }

    @Override
    public int hashCode()
    {
        return 34;
    }
}
