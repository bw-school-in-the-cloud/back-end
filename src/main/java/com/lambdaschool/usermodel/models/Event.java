package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "event")
public class Event
    extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eventid;

    private String title;
    private String description;
    private double length;
    private String lengthdesc;

    @ManyToOne
    @JoinColumn(name = "categoryid")
    @JsonIgnoreProperties(value = "event")
    private Category category;

    @OneToMany(mappedBy = "event",
        cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "edate", allowSetters = true)
    private Set<EventDate> eventdates = new HashSet<>();

    public Event()
    {
    }

    public Event(
        String title,
        String description,
        double length,
        Category category)
    {
        this.title = title;
        this.description = description;
        this.length = length;
        this.category = category;
    }

    public long getEventid()
    {
        return eventid;
    }

    public void setEventid(long eventid)
    {
        this.eventid = eventid;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public Set<EventDate> getEventdates()
    {
        return eventdates;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public void setEventdates(Set<EventDate> eventdates)
    {
        this.eventdates = eventdates;
    }

    public String getLengthdesc()
    {
        return lengthdesc;
    }

    public void setLengthdesc(String lengthdesc)
    {
        this.lengthdesc = lengthdesc;
    }
}
