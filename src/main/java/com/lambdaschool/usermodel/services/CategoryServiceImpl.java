package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.exceptions.ResourceFoundException;
import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;
import com.lambdaschool.usermodel.models.Category;
import com.lambdaschool.usermodel.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "categoryService")
public class CategoryServiceImpl implements CategoryService
{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll()
    {
        List<Category> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        categoryRepository.findAll()
            .iterator()
            .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Category findCategoryById(long id)
    {
        return categoryRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Category ID: " + id + " not found!"));
    }

    @Transactional
    @Override
    public Category save(Category category)
    {
        if (category.getEvents()
            .size() > 0)
        {
            throw new ResourceFoundException("Events are not added through categories");
        }

        Category newCategory = new Category();

        newCategory.setName(category.getName());

        return categoryRepository.save(newCategory);
    }
}
