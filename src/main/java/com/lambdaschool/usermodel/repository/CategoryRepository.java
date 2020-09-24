package com.lambdaschool.usermodel.repository;

import com.lambdaschool.usermodel.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long>
{
    Category findByNameIgnoreCase(String name);

}
