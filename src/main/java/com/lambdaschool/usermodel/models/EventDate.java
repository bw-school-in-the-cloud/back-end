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
    @JsonIgnoreProperties(value = "eventdates")
    private Datee datee;

    private String eventinfo;
    private String eventdateday;

    public EventDate()
    {
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
