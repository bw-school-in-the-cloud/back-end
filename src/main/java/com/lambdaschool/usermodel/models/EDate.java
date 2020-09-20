package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.*;

@Entity
@Table(name = "edates")
public class EDate
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eventdateid;

    @Column(nullable = false)
    @Max(59)
    private int eventminute;

    @Column(nullable = false)
    private int eventhour;

    private int timelatin;
    private String timelatinprefix;

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

    @OneToMany(mappedBy = "edate",
        cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "edate",
        allowSetters = true)
    private Set<EventDate> events = new HashSet<>();

    public EDate()
    {
    }

    public EDate(
        @Max(59) int eventminute,
        int eventhour,
        @Min(1) @Max(12) int eventmonth,
        @Min(1) @Max(31) int eventday,
        int eventyear)
    {
        this.eventminute = eventminute;
        this.eventhour = eventhour;
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

    public int getTimelatin()
    {
        return timelatin;
    }

    public void setTimelatin(int timelatin)
    {
        this.timelatin = timelatin;
    }

    public String getTimelatinprefix()
    {
        return timelatinprefix;
    }

    public void setTimelatinprefix(String timelatinprefix)
    {
            this.timelatinprefix = timelatinprefix;
    }

    public int getEventminute()
    {
        return eventminute;
    }

    public void setEventminute(int eventminute)
    {
        this.eventminute = eventminute;
    }

    public int getEventhour()
    {
        return eventhour;
    }

    public void setEventhour(int eventhour)
    {
        this.eventhour = eventhour;
    }

    public Set<EventDate> getEvents()
    {
        return events;
    }

    public void setEvents(Set<EventDate> events)
    {
        this.events = events;
    }

    @Override
    public String toString()
    {
        return eventmonth + "/" + eventday + "/" + eventyear + " @" + timelatin + ":" + eventminute + " " + timelatinprefix;
    }
}
