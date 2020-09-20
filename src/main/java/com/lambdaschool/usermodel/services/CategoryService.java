package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Category;

import java.util.List;

public interface CategoryService
{
    Category save(Category category);

    List<Category> findAll();

    Category findCategoryById(long id);


    Category update(
        long categoryid,
        Category newCategory);

    Category findCategoryByName(String name);
}
