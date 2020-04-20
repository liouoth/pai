package com.will.pai.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
@Data
public class Category {
    @Id
    private String id;
    private String projectId;
    private String name;
}
