package com.will.pai.repository;

import com.will.pai.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserRepository{
    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveUser(User user){
        mongoTemplate.insert(user);
    }

    public User findUserById(String id){
        return mongoTemplate.findOne(new Query(Criteria.where("_id").is(id)),User.class);
    }

    public List<User> listAllUser(){
        return mongoTemplate.findAll(User.class);
    }


}
