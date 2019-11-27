package com.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Comment implements Serializable {
    private int id;
    private int userId;
    private int articleId;
    private Date datetime;
    private String content;
}
