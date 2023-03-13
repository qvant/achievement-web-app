package com.example.achivementwebapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "companies", schema = "achievements_hunt")
@Getter
@Setter
public class Company {
    @Id
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="platform_id")
    private Platform platform;
    @Column(name = "name")
    private String name;
}
