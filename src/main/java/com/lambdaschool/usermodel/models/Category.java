package com.lambdaschool.usermodel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
@JsonIgnoreProperties("eventdates")
public class Category
    extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoryid;

    private String name;

    @OneToMany(mappedBy = "category")
    @JsonIgnoreProperties(value = "category",
        allowSetters = true)
    private Set<Event> events = new HashSet<>();

    public Category()
    {
    }

    public Category(String name)
    {
        this.name = name;
    }

    public long getCategoryid()
    {
        return categoryid;
    }

    public void setCategoryid(long categoryid)
    {
        this.categoryid = categoryid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Set<Event> getEvents()
    {
        return events;
    }

    public void setEvents(Set<Event> events)
    {
        this.events = events;
    }
}
