package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long>
{
    Event findByTitle(String toLowerCase);

    List<Event> findByTitleContainingIgnoreCase(String toLowerCase);

    //    List<Event> findByNameContainingIgnoreCase(String name);
}
