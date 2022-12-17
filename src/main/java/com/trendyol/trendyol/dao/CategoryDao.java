package com.trendyol.trendyol.dao;

import com.trendyol.trendyol.dto.ICategoryRepository;
import com.trendyol.trendyol.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDao {

    private ICategoryRepository categoryRepository;
    public CategoryDao(ICategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public CategoryDao(){

    }

    public void create(Category category){
        categoryRepository.save(category);
    }

    public void update(Category category){
        categoryRepository.save(category);
    }


    public void destroy(Long id){
        categoryRepository.deleteById(id);
    }

    public String getCategoryById(Long id){
        return "Category Silindi";
    }

    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }


}
