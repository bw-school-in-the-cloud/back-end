package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.exceptions.ResourceNotFoundException;
import com.lambdaschool.usermodel.models.Category;
import com.lambdaschool.usermodel.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "categoryService")
public class CategoryServiceImpl implements CategoryService
{
    @Autowired
    private CategoryRepository categoryRepository;

//    @Override
//    public Category save(Category category)
//    {
//        Category category1 = new Category();
//
//        if (category.getCategoryid() != 0)
//        {
//            categoryRepository.findById(category.getCategoryid())
//                .orElseThrow(() -> new ResourceNotFoundException("Category with ID: " + category.getCategoryid() + " could not be found!"));
//        }
//    }
}
