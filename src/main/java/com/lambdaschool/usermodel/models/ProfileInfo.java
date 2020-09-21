//package com.lambdaschool.usermodel.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table(name = "profileinfos")
//public class ProfileInfo extends Auditable
//{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long profileinfoid;
//
//    private String comments;
//
//    @OneToMany(mappedBy = "user",
//        cascade = CascadeType.ALL,
//        orphanRemoval = true)
//    @JsonIgnoreProperties(value = "profileinfo", allowSetters = true)
//    private Set<UserSessionInfo> sessioninfos = new HashSet<>();
//
//    public ProfileInfo()
//    {
//    }
//
//    public long getProfileinfoid()
//    {
//        return profileinfoid;
//    }
//
//    public void setProfileinfoid(long profileinfoid)
//    {
//        this.profileinfoid = profileinfoid;
//    }
//
//    public Set<UserSessionInfo> getSessioninfos()
//    {
//        return sessioninfos;
//    }
//
//    public void setSessioninfos(Set<UserSessionInfo> sessioninfos)
//    {
//        this.sessioninfos = sessioninfos;
//    }
//}
