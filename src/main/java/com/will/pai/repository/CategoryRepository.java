package com.will.pai.repository;

import com.will.pai.dao.CategoryDao;
import com.will.pai.dao.InterfaceDao;
import com.will.pai.entity.Category;
import com.will.pai.entity.Interface;
import com.will.pai.util.DocumentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;


@Repository
public class CategoryRepository implements CategoryDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insert(Category category) {
        mongoTemplate.insert(category);
    }

    @Override
    public Category find(String id) {
        return mongoTemplate.findOne(new Query(Criteria.where("_id").is(id)),Category.class);
    }

    @Override
    public void delete(String id) {
        mongoTemplate.findAndRemove(new Query(Criteria.where("_id").is(id)),Category.class);
    }

    @Override
    public void update(Category category) {
        mongoTemplate.findAndModify(
                new Query(Criteria.where("_id").is(category.getId())),
                Update.fromDocument(DocumentUtil.fromBean(category),"id"),
                Interface.class
        );
    }

}
