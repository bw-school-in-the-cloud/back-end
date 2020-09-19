package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.TOS;

import java.util.List;

public interface TOSService
{
    TOS save(long tosid, String paragraph);

    List<TOS> findAll();
}
