package com.lambdaschool.usermodel.services;


import com.lambdaschool.usermodel.models.Datee;
import com.lambdaschool.usermodel.models.Event;
import com.lambdaschool.usermodel.models.TOS;

import java.util.List;

public interface DateeService
{
    Datee save(Datee datee);

    List<Datee> findAll();

    Datee finddateeById(long id);
}
