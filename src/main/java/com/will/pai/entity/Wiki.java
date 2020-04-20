package com.will.pai.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "wiki")
@Data
public class Wiki {
    @Id
    private String id;
    private String title;
    private String content;
    private LocalDateTime addTime;
    private LocalDateTime updateTime;
}
