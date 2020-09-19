package com.lambdaschool.usermodel.models;

import javax.persistence.*;

@Entity
@Table(name = "toss")
public class TOS
    extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tosid;

    private String paragraph;

    public TOS()
    {
    }

    public TOS(
        long tosid,
        String paragraph)
    {
        this.tosid = tosid;
        this.paragraph = paragraph;
    }

    public long getTosid()
    {
        return tosid;
    }

    public void setTosid(long tosid)
    {
        this.tosid = tosid;
    }

    public String getParagraph()
    {
        return paragraph;
    }

    public void setParagraph(String paragraph)
    {
        this.paragraph = paragraph;
    }
}
