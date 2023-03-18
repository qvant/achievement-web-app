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
@Table(name = "player_games", schema = "achievements_hunt")
public class PlayerGame {
    @Id
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;
    @Column (name = "percent_complete")
    private double percentComplete;
    @Column (name = "is_perfect")
    private boolean perfect;
    @Column (name = "dt_last_perfected")
    private LocalDate LastPerfected;

}
