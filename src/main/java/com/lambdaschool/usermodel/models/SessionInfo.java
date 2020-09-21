//package com.lambdaschool.usermodel.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table(name = "sessioninfo")
//public class SessionInfo extends Auditable
//{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "sessioninfoid")
//    private long sessioninfoid;
//
//    @Column(nullable = false)
//    private String sessioninfoname;
//    @Column(nullable = false)
//    private String sessioninfoabbr;
//    private int offset;
//
//    @OneToMany(mappedBy = "sessioninfo",
//        cascade = CascadeType.ALL,
//        orphanRemoval = true)
//    @JsonIgnoreProperties(value = "sessioninfo",
//        allowSetters = true)
//    private Set<UserSessionInfo> profileinfos = new HashSet<>();
//
//    public SessionInfo()
//    {
//    }
//
//    public SessionInfo(
//        String sessioninfoname,
//        String sessioninfoabbr
//    )
//    {
//        this.sessioninfoname = sessioninfoname;
//        this.sessioninfoabbr = sessioninfoabbr;;
//    }
//
//    public long getSessioninfoid()
//    {
//        return sessioninfoid;
//    }
//
//    public void setSessioninfoid(long sessioninfoid)
//    {
//        this.sessioninfoid = sessioninfoid;
//    }
//
//    public String getSessioninfoname()
//    {
//        return sessioninfoname;
//    }
//
//    public void setSessioninfoname(String sessioninfoname)
//    {
//        this.sessioninfoname = sessioninfoname;
//    }
//
//    public String getSessioninfoabbr()
//    {
//        return sessioninfoabbr;
//    }
//
//    public void setSessioninfoabbr(String sessioninfoabbr)
//    {
//        this.sessioninfoabbr = sessioninfoabbr;
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
//    public Set<UserSessionInfo> getProfileinfos()
//    {
//        return profileinfos;
//    }
//
//    public void setProfileinfos(Set<UserSessionInfo> profileinfos)
//    {
//        this.profileinfos = profileinfos;
//    }
//}
