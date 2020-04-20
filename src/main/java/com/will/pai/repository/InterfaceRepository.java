package com.will.pai.repository;

import com.mongodb.client.model.Updates;
import com.will.pai.dao.InterfaceDao;
import com.will.pai.entity.Interface;
import com.will.pai.entity.User;
import com.will.pai.util.DocumentUtil;
import org.bson.Document;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class InterfaceRepository implements InterfaceDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insert(Interface inf) {
        mongoTemplate.insert(inf);
    }

    @Override
    public Interface find(String id) {
        return mongoTemplate.findOne(new Query(Criteria.where("_id").is(id)),Interface.class);
    }

    @Override
    public void delete(String id) {
        mongoTemplate.findAndRemove(new Query(Criteria.where("_id").is(id)),Interface.class);
    }

    @Override
    public void update(Interface inf) {
        mongoTemplate.findAndModify(
                new Query(Criteria.where("_id").is(inf.getId())),
                Update.fromDocument(DocumentUtil.fromBean(inf),"id"),
                Interface.class
        );
    }

}
