package com.will.pai.dao;

import com.will.pai.entity.Interface;

public interface InterfaceDao {
    void insert(Interface inf);
    Interface find(String id);
    void delete(String id);
    void update(Interface inf);
}
