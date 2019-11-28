package com.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Comment implements Serializable {
    private Integer id;
    private Integer userId;
    private Integer articleId;
    private Date datetime;
    private String content;
}
