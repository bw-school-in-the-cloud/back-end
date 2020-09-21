//package com.lambdaschool.usermodel.models;
//
//import javax.persistence.Embeddable;
//import java.io.Serializable;
//
//@Embeddable
//public class UserSessionInfoId implements Serializable
//{
//    private long user;
//
//    private long sessioninfo;
//
//    public UserSessionInfoId()
//    {
//    }
//
//    public long getUser()
//    {
//        return user;
//    }
//
//    public void setUser(long user)
//    {
//        this.user = user;
//    }
//
//    public long getSessioninfo()
//    {
//        return sessioninfo;
//    }
//
//    public void setSessioninfo(long sessioninfo)
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
//        if (o == null || getClass() != o.getClass())
//        {
//            return false;
//        }
//        UserSessionInfoId that = (UserSessionInfoId) o;
//        return user == that.user &&
//            sessioninfo == that.sessioninfo;
//    }
//}
