package com.lambdaschool.usermodel.models;

import javax.persistence.*;

@Entity
@Table(name = "profileinfos")
public class ProfileInfo extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long profileinfoid;

    private String comments;

    public ProfileInfo()
    {
    }

    public ProfileInfo(String comments)
    {
        this.comments = comments;
    }

    public long getProfileinfoid()
    {
        return profileinfoid;
    }

    public void setProfileinfoid(long profileinfoid)
    {
        this.profileinfoid = profileinfoid;
    }

//    public Set<UserSessionInfo> getSessioninfos()
//    {
//        return sessioninfos;
//    }
//
//    public void setSessioninfos(Set<UserSessionInfo> sessioninfos)
//    {
//        this.sessioninfos = sessioninfos;
//    }
}
