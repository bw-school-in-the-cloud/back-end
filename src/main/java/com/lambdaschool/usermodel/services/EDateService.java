package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.EDate;
import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.models.TOS;

import java.util.List;

public interface EDateService
{
    EDate save(EDate edate);

    List<EDate> findAll();
}
