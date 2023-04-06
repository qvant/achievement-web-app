package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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

    private LocalDate dtUpdate;

    private String avatarUrl;

    private List<PlayerAchievementDto> lastAchievements;

    public PlayerDto(long id, PlatformDto platform, String name, String extId, LocalDate dtCreate, LocalDate dtUpdate, String avatarUrl) {
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
            var playerDto = new PlayerDto(player.getId(), PlatformDto.toDto(player.getPlatform()), player.getName(), player.getExtId(), player.getDtCreate(), player.getDtUpdate(), player.getAvatarUrl());
            if (player.getLastAchievements() != null) {
                playerDto.lastAchievements = player.getLastAchievements().stream().map(PlayerAchievementDto::toDto).collect(Collectors.toList());
            }
            return playerDto;
        }
        return new PlayerDto();
    }
}
