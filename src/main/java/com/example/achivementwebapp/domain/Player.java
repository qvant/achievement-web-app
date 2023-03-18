package com.example.achivementwebapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "players", schema = "achievements_hunt")
public class Player {
    @Id
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "platform_id", nullable = false)
    private Platform platform;
    @Column(name = "name")
    private String name;
    @Column(name = "ext_id")
    private String extId;
    @Column(name = "dt_create")
    private LocalDate dtCreate;
    @Column(name = "dt_update")
    private LocalDate dtUpdate;
    @Column(name = "avatar_url")
    private String avatarUrl;
}
