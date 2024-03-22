package com.bonita.recipe.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Keyword {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(name = "ord")
    private int order;

    public Keyword(String name, int order) {
        this.name = name;
        this.order = order;
    }
}
