package com.will.pai.controller;

import com.will.pai.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("console")
public class ConsoleController {
    @RequestMapping("index")
    public String index(){
       return "console";
    }

}
