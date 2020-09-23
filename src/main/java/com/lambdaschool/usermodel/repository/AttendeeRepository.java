package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.Attendee;
import org.springframework.data.repository.CrudRepository;

public interface AttendeeRepository extends CrudRepository<Attendee, Long>
{
}
