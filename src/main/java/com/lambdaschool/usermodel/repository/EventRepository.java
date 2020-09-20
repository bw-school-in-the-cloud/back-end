package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long>
{
}
