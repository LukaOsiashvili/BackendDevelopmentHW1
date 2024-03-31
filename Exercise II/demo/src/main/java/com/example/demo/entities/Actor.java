package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @SequenceGenerator(name = "actor_actor_id_seq", sequenceName = "actor_actor_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
