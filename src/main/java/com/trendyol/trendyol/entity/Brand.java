package com.trendyol.trendyol.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "brands")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;

    @OneToMany(mappedBy = "brand",cascade = CascadeType.ALL)
    private Set<Product> productList;

    // Getters and setters for the fields go here
}
