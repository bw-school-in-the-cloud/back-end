package com.lambdaschool.usermodel.models;

import java.io.Serializable;

public class AttendeeId implements Serializable
{
    private long event;

    private long user;

    public AttendeeId()
    {
    }

    public AttendeeId(
        long event,
        long user)
    {
        this.event = event;
        this.user = user;
    }

    public long getEvent()
    {
        return event;
    }

    public void setEvent(long event)
    {
        this.event = event;
    }

    public long getUser()
    {
        return user;
    }

    public void setUser(long user)
    {
        this.user = user;
    }

    @Override
    public int hashCode()
    {
        return 37;
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
        AttendeeId aidi = (AttendeeId) o;
        return event == aidi.event &&
            user == aidi.user;
    }
}
