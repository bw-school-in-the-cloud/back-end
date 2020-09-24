package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "attendee")
@IdClass(AttendeeId.class)
public class Attendee implements Serializable
{
    @Id
    @ManyToOne
    @JoinColumn(name = "eventid")
    @JsonIgnoreProperties(value = "eventdates")
    private Event event;

    @Id
    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties(value = "events")
    private User user;

    public Attendee()
    {
    }

    public Attendee(
        Event event,
        User user)
    {
        this.event = event;
        this.user = user;
    }

    public Event getEvent()
    {
        return event;
    }

    public void setEvent(Event event)
    {
        this.event = event;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public int hashCode()
    {
        return 37;
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
        Attendee that = (Attendee) obj;
        return ((event == null) ? 0 : event.getEventid()) == ((that.event == null) ? 0 : that.event.getEventid()) &&
            ((user == null) ? 0 : user.getUserid()) == ((that.user == null)? 0 : that.user.getUserid());

    }
}
