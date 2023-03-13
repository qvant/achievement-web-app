package com.example.achivementwebapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "platforms", schema="achievements_hunt")
@RequiredArgsConstructor
@Getter
public class Platform {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
}
