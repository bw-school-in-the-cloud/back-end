package com.lambdaschool.usermodel.models;

import java.io.Serializable;

public class EventDateId implements Serializable
{
    private long event;
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
