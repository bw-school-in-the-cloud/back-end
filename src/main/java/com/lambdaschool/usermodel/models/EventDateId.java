package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(value = "event")
public class EventDateId implements Serializable
{
    @JsonIgnoreProperties(value = "datee")
    private long event;

    @JsonIgnoreProperties(value = "event")
    private long datee;

    public EventDateId()
    {
    }

    public long getEvent()
    {
        return event;
    }

    public void setEvent(long event)
    {
        this.event = event;
    }

    public long getdatee()
    {
        return datee;
    }

    public void setdatee(long datee)
    {
        this.datee = datee;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        EventDateId evdi = (EventDateId) o;
        return event == evdi.event &&
            datee == evdi.datee;
    }
}
