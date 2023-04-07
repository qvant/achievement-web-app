package com.example.achivementwebapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "achievements", schema="achievements_hunt")
public class Achievement {
    @Id
    long id;
    @Column(name = "name")
    String name;
    @Column(name = "ext_id")
    String extId;
    @Column(name = "description")
    String description;
    @Column(name = "num_owners")
    long numOwners;
    @Column(name = "percent_owners")
    double percentOwners;
    @Column(name = "icon_url")
    String iconUrl;
    @Column(name = "locked_icon_url")
    String lockedIconUrl;
    @Column(name = "is_hidden")
    boolean hidden;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "game_id", nullable = false)
    Game game;
}
