package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.*;

@Entity
@Table(name = "datee")
public class Datee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnoreProperties("dateeid")
    private long dateeid;

    @Column(nullable = false)
    @Max(59)
    private int timeminute;

    @Column(nullable = false)
    @Min(0)
    @Max(24)
    private int timedigital;

    private int timeimperial;
    private String timeimperialsuffix;
    private String timezone;

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

    @OneToMany(mappedBy = "datee",
        cascade = CascadeType.ALL,
        orphanRemoval = true)
    @JsonIgnoreProperties(value = "datee",
        allowSetters = true)
    private Set<EventDate> events = new HashSet<>();

    public Datee()
    {
    }

    public Datee(
        @Max(59) int timeminute,
        int timedigital,
        @Min(1) @Max(12) int eventmonth,
        @Min(1) @Max(31) int eventday,
        int eventyear)
    {
        this.timeminute = timeminute;
        this.timedigital = timedigital;
        this.eventmonth = eventmonth;
        this.eventday = eventday;
        this.eventyear = eventyear;
    }

    public long getEventdateid()
    {
        return dateeid;
    }

    public void setEventdateid(long eventdateid)
    {
        this.dateeid = eventdateid;
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

    public int getTimeimperial()
    {
        return timeimperial;
    }

    public void setTimeimperial(int timelatin)
    {
        this.timeimperial = timelatin;
    }

    public String getTimeimperialsuffix()
    {
        return timeimperialsuffix;
    }

    public void setTimeimperialsuffix(String timelatinprefix)
    {
            this.timeimperialsuffix = timelatinprefix;
    }

    public int getTimeminute()
    {
        return timeminute;
    }

    public void setTimeminute(int eventminute)
    {
        this.timeminute = eventminute;
    }

    public int getTimedigital()
    {
        return timedigital;
    }

    public void setTimedigital(int eventhour)
    {
        this.timedigital = eventhour;
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
        return eventmonth + "/" + eventday + "/" + eventyear + " @" + timeimperial + ":" + timeminute + " " + timeimperialsuffix;
    }
}
