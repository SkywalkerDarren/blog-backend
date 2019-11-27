package com.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Article implements Serializable {
    private int id;
    private String title;
    private Date datetime;
    private int userId;
}
