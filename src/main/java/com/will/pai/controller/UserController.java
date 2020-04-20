package com.will.pai.controller;

import com.alibaba.fastjson.JSON;
import com.will.pai.entity.User;
import com.will.pai.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("add")
    public void add(@RequestBody User user){
        userRepository.saveUser(user);
    }

    @GetMapping(value = "/{id}")
    public String find(@PathVariable("id") String id){
        return JSON.toJSONString(userRepository.findUserById(id));
    }

    @GetMapping("list")
    public String list(){
        return JSON.toJSONString(userRepository.listAllUser());
    }
}
