package com.blog.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Tag implements Serializable {
    private int id;
    private String name;
}
