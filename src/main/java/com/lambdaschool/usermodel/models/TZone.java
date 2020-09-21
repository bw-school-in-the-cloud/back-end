//package com.lambdaschool.usermodel.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table(name = "tzones")
//public class TZone extends Auditable
//{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long tzoneid;
//
//    private String tzonename;
//    private String tzoneabbr;
//    private int offset;
//
//    @OneToMany(mappedBy = "tzones")
//    @JsonIgnoreProperties(value = "tzone",
//        allowSetters = true)
//    private Set<User> users = new HashSet<>();
//
//    public TZone()
//    {
//    }
//
//    public long getTzoneid()
//    {
//        return tzoneid;
//    }
//
//    public void setTimezoneid(long tzoneid)
//    {
//        this.tzoneid = tzoneid;
//    }
//
//    public String getTzonename()
//    {
//        return tzonename;
//    }
//
//    public void setTzonename(String tzonename)
//    {
//        this.tzonename = tzonename;
//    }
//
//    public String getTzoneabbr()
//    {
//        return tzoneabbr;
//    }
//
//    public void setTzoneabbr(String tzoneabbr)
//    {
//        this.tzoneabbr = tzoneabbr;
//    }
//
//    public int getOffset()
//    {
//        return offset;
//    }
//
//    public void setOffset(int offset)
//    {
//        this.offset = offset;
//    }
//
//    public Set<User> getTzones()
//    {
//        return users;
//    }
//
//    public void setTzones(Set<User> tzones)
//    {
//        this.users = tzones;
//    }
//}
