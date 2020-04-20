package com.will.pai.dao;

import com.will.pai.entity.Category;

public interface CategoryDao {
    void insert(Category category);
    Category find(String id);
    void delete(String id);
    void update(Category category);
}
