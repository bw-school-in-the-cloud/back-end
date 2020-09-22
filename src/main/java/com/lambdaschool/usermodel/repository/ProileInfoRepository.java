package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.ProfileInfo;
import org.springframework.data.repository.CrudRepository;

public interface ProileInfoRepository extends CrudRepository<ProfileInfo, Long>
{
}
