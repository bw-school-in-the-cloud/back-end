//package com.lambdaschool.usermodel.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "usersessioninfo")
//@IdClass(UserSessionInfoId.class)
//public class UserSessionInfo extends Auditable implements Serializable
//{
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "profileinfoid")
//    @JsonIgnoreProperties(value = "sessioninfos", allowSetters = true)
//    private ProfileInfo user;
//
//    /**
//     * 1/2 of the primary key (long) for userroles.
//     * Also is a foreign key into the roles table
//     */
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "sessioninfo")
//    @JsonIgnoreProperties(value = "users", allowSetters = true)
//    private SessionInfo sessioninfo;
//
//    public UserSessionInfo()
//    {
//    }
//
//    public UserSessionInfo(
//        ProfileInfo user,
//        SessionInfo sessioninfo)
//    {
//        this.user = user;
//        this.sessioninfo = sessioninfo;
//    }
//
//    public ProfileInfo getUser()
//    {
//        return user;
//    }
//
//    public void setUser(ProfileInfo user)
//    {
//        this.user = user;
//    }
//
//    public SessionInfo getSessioninfo()
//    {
//        return sessioninfo;
//    }
//
//    public void setSessioninfo(SessionInfo sessioninfo)
//    {
//        this.sessioninfo = sessioninfo;
//    }
//
//    @Override
//    public int hashCode()
//    {
//        return 37;
//    }
//
//    @Override
//    public boolean equals(Object o)
//    {
//        if (this == o)
//        {
//            return true;
//        }
//        if (!(o instanceof UserSessionInfo))
//        {
//            return false;
//        }
//        UserSessionInfo that = (UserSessionInfo) o;
//        return ((user == null) ? 0 : user.getProfileinfoid()) == ((that.user == null) ? 0 : that.user.getProfileinfoid()) &&
//            ((sessioninfo == null) ? 0 : sessioninfo.getSessioninfoid()) == ((that.sessioninfo == null) ? 0 : that.sessioninfo.getSessioninfoid());
//    }
//}
