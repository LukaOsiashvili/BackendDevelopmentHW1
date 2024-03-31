package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @SequenceGenerator(name = "lang_lang_id_seq", sequenceName = "lang_lang_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lang_lang_id_seq")
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
