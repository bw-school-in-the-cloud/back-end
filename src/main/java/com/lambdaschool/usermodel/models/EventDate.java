package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "eventdates")
@IdClass(EventDateId.class)
public class EventDate extends Auditable implements Serializable
{
    @Id
    @ManyToOne
    @JoinColumn(name = "eventid")
    @JsonIgnoreProperties(value = "edate")
    private Event event;

    @Id
    @ManyToOne
    @JoinColumn(name = "eventdateid")
    @JsonIgnoreProperties(value = "events")
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
