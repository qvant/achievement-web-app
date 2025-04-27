package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PlayerDto {
    private long id;

    private PlatformDto platform;
    private String name;

    private String extId;

    private LocalDate dtCreate;

    private LocalDateTime dtUpdate;

    private String avatarUrl;

    private List<PlayerAchievementDto> lastAchievements;
    private List<PlayerAchievementDto> rarestAchievements;
    private PlayerSummaryDto playerSummary;

    public PlayerDto(long id, PlatformDto platform, String name, String extId, LocalDate dtCreate, LocalDateTime dtUpdate, String avatarUrl) {
        this.id = id;
        this.platform = platform;
        this.name = name;
        this.extId = extId;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
        this.avatarUrl = avatarUrl;
    }

    public static PlayerDto toDto(Player player) {
        if (player != null) {
            var playerDto = new PlayerDto(player.getId(), PlatformDto.toDto(player.getPlatform()), player.getName(), player.getExtId(), player.getDtCreate(), player.getDtUpdate().truncatedTo(ChronoUnit.SECONDS), player.getAvatarUrl());
            if (player.getLastAchievements() != null) {
                playerDto.lastAchievements = player.getLastAchievements().stream().map(PlayerAchievementDto::toDto).collect(Collectors.toList());
            }
            if (player.getRarestAchievements() != null) {
                playerDto.rarestAchievements = player.getRarestAchievements().stream().map(PlayerAchievementDto::toDto).collect(Collectors.toList());
            }
            if (player.getPlayerSummary() != null) {
                playerDto.playerSummary = PlayerSummaryDto.toDto(player.getPlayerSummary());
            }
            return playerDto;
        }
        return new PlayerDto();
    }
    public static PlayerDto toDtoNoChilds(Player player) {
        if (player != null) {
            return new PlayerDto(player.getId(), PlatformDto.toDto(player.getPlatform()), player.getName(), player.getExtId(), player.getDtCreate(), player.getDtUpdate().truncatedTo(ChronoUnit.SECONDS), player.getAvatarUrl());
        }
        return new PlayerDto();
    }
}
