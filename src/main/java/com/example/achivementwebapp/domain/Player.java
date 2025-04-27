package com.example.achivementwebapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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
    private LocalDateTime dtUpdate;
    @Column(name = "avatar_url")
    private String avatarUrl;
    @Transient
    private List<PlayerAchievement> lastAchievements;
    @Transient
    private List<PlayerAchievement> rarestAchievements;
    @Transient
    private PlayerSummary playerSummary;
}
