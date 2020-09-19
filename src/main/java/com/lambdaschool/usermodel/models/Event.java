package com.lambdaschool.usermodel.models;

import javax.persistence.*;

@Entity
@Table(name = "events")
public class Event
    extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long eventid;

    private String title;
    private String description;
}
