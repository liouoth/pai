package com.will.pai.entity;

import com.sun.xml.internal.ws.developer.Serialization;
import com.will.pai.entity.part.Param;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "interface")
@Data
public class Interface{
    @Id
    @Transient
    private String id;
    private String name;
    private String projectId;
    private String categoryId;
    private LocalDateTime updateTime;
    private LocalDateTime addTime;

    private Integer method;
    private String url;

    //request
    private List<Param> queryParams;
    private List<Param> headerParams;
    private Integer req_body_type;
    private String req_body;

    //response
    private Integer res_body_type;
    private String res_body;

}
