package com.trendyol.trendyol.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Comment {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
