package com.lambdaschool.usermodel.models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

@Entity
@Table(name = "eventdates")
public class EventDate
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eventdateid;

    @Column(nullable = false)
    @Max(59)
    private int eventminutes;

    @Column(nullable = false)
    private int eventhours;

    @Column(nullable = false)
    @Min(1)
    @Max(12)
    private int eventmonth;

    private String eventmonthname;

    @Column(nullable = false)
    @Min(1)
    @Max(31)
    private int eventday;

    @Column(nullable = false)
    private int eventyear;

    public EventDate()
    {
    }

    public EventDate(
        @Max(59) int eventminutes,
        int eventhours,
        @Min(1) @Max(12) int eventmonth,
        @Min(1) @Max(31) int eventday,
        int eventyear)
    {
        this.eventminutes = eventminutes;
        this.eventhours = eventhours;
        this.eventmonth = eventmonth;
        this.eventday = eventday;
        this.eventyear = eventyear;
    }

    public long getEventdateid()
    {
        return eventdateid;
    }

    public void setEventdateid(long eventdateid)
    {
        this.eventdateid = eventdateid;
    }

    public int getEventminutes()
    {
        return eventminutes;
    }

    public void setEventminutes(int eventminutes)
    {
        this.eventminutes = eventminutes;
    }

    public int getEventhours()
    {
        return eventhours;
    }

    public void setEventhours(int eventhours)
    {
        this.eventhours = eventhours;
    }

    public int getEventmonth()
    {
        return eventmonth;
    }

    public void setEventmonth(int eventmonth)
    {
        this.eventmonth = eventmonth;
    }

    public String getEventmonthname()
    {
        return eventmonthname;
    }

    public void setEventmonthname(String eventmonthname)
    {
        this.eventmonthname = eventmonthname;
    }

    public int getEventday()
    {
        return eventday;
    }

    public void setEventday(int eventday)
    {
        this.eventday = eventday;
    }

    public int getEventyear()
    {
        return eventyear;
    }

    public void setEventyear(int eventyear)
    {
        this.eventyear = eventyear;
    }

    @Override
    public String toString()
    {
        return eventmonth + "/" + eventday + "/" + eventyear + " @" + eventhours + ":" + eventminutes;
    }
}
