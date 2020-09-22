package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.ProfileInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "profileService")
public class ProfileInfoServiceImpl implements ProfileInfoService
{
    @Override
    public ProfileInfo save(ProfileInfo pf1)
    {
        return null;
    }
}
