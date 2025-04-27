package com.example.achivementwebapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class PlayerSummary {
    @Id
    private long id;
    private long completedGames;
    private double avgPercent;
    private long totalGames;
    private LocalDateTime lastUpdate;
}
