package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.Category;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface CategoryRepository extends CrudRepository<Category, Long>
{
    Category findByNameIgnoreCase(String name);

}
