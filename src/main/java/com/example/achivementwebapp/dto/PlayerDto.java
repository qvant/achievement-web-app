package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Achievement;
import com.example.achivementwebapp.domain.Platform;
import com.example.achivementwebapp.domain.Player;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PlayerDto {
    private long id;
    private PlatformDto platform ;
    private String name;

    private String extId;

    private LocalDate dtCreate;

    private LocalDate dtUpdate;

    private String avatarUrl;

    public static PlayerDto toDto(Player player){
        if (player != null) {
            return new PlayerDto(player.getId(), PlatformDto.toDto(player.getPlatform()), player.getName(), player.getExtId(), player.getDtCreate(), player.getDtUpdate(), player.getAvatarUrl());
        }
        return new PlayerDto();
    }
}
