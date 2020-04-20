package com.will.pai.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "project")
@Data
public class Project {
    @Id
    @Transient
    private String id;
    private String name;
    private List<User> members;
}
