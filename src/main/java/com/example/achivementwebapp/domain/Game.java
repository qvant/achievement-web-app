package com.example.achivementwebapp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "games", schema="achievements_hunt")
public class Game {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "ext_id")
    private String extId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "console_id")
    private Console console;
    @Column(name = "icon_url")
    private String iconUrl;
    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "num_owners")
    private Long numOwners;

    @Column(name = "has_achievements")
    private boolean hasAchievements;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "publisher_id")
    private Company publisher;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "developer_id")
    private Company developer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "platform_id", nullable = false)
    private Platform platform;


}
