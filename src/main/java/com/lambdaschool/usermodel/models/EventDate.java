package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "eventdate")
@IdClass(EventDateId.class)
//@JsonIgnoreProperties("event")
public class EventDate implements Serializable
{
    @Id
    @ManyToOne
    @JoinColumn(name = "eventid")
    @JsonIgnoreProperties(value = "eventdates")
    private Event event;

    @Id
    @ManyToOne
    @JoinColumn(name = "dateeid")
    @JsonIgnoreProperties(value = "events")
    private Datee datee;

    private String eventinfo;
    private String eventdateday;

    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties(value = "event", allowSetters = true)
    private User hostedby;

    public EventDate()
    {
    }

    public EventDate(
        String eventinfo,
        String eventdateday)
    {
        this.eventinfo = eventinfo;
        this.eventdateday = eventdateday;
    }

    public EventDate(
        Event event, Datee datee)
    {
        this.event = event;
        this.datee = datee;
    }

    public EventDate(
        Datee datee,
        Event event)
    {
        this.datee = datee;
        this.event = event;
    }

    public EventDate(
        User hostedby,
        Event event
        )
    {
        this.event = event;
        this.hostedby = hostedby;
    }

    public EventDate(
        Event event,
        Datee datee,
        User hostedby)
    {
        this.event = event;
        this.datee = datee;
        this.hostedby = hostedby;
    }

    public EventDate(
        Datee datee,
        Event event,
        User hostedby)
    {
        this.datee = datee;
        this.event = event;
        this.hostedby = hostedby;
    }

    public String getEventinfo()
    {
        return eventinfo;
    }

    public void setEventinfo(String eventinfo)
    {
        this.eventinfo = eventinfo;
    }

    public String getEventdateday()
    {
        return eventdateday;
    }

    public void setEventdateday(String eventdateday)
    {
        this.eventdateday = eventdateday;
    }

    public Event getEvent()
    {
        return event;
    }

    public void setEvent(Event event)
    {
        this.event = event;
    }

    public Datee getdatee()
    {
        return datee;
    }

    public void setdatee(Datee datee)
    {
        this.datee = datee;
    }

    public User getUser()
    {
        return hostedby;
    }

    public void setUser(User hostedby)
    {
        this.hostedby = hostedby;
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
            ((datee == null) ? 0 : datee.getEventdateid()) == ((that.datee == null)? 0 : that.datee.getEventdateid());
    }

    @Override
    public int hashCode()
    {
        return 34;
    }
}
