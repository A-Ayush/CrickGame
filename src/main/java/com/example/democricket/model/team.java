package com.example.democricket.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="team")
public class team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long teamId;

    @Column(name = "tname")
    private String tname;

    @OneToMany(mappedBy = "t")
    private Set<Player> player;



}
