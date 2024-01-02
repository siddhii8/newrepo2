package com.blog.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="Posts")
public class Post {
    @Id
    private long id;
    private String title;
    private String description;
    private String body;


}
