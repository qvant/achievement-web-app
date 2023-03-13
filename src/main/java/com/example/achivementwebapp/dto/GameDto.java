package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Game;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Builder
public class GameDto {

    private long id;
    private String name;
    private String extId;
    private ConsoleDto console;
    private Long numOwners;
    private String releaseDate;
    private boolean hasAchievements;
    private CompanyDto publisher;
    private CompanyDto developer;
    private String iconUrl;
    private PlatformDto platform;

    public static GameDto toDto(Game game){
        var b = GameDto.builder().console(ConsoleDto.toDto(game.getConsole())).
                iconUrl(game.getIconUrl()).id(game.getId()).name(game.getName()).extId(game.getExtId()).hasAchievements(game.isHasAchievements())
                .developer(CompanyDto.toDto(game.getDeveloper())).publisher(CompanyDto.toDto(game.getPublisher())).platform(PlatformDto.toDto(game.getPlatform()))
                .numOwners(game.getNumOwners()).releaseDate(game.getReleaseDate()).build();
        return b;
    }
}
