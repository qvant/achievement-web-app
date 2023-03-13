package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class GameDto {
    public GameDto(long id, String name, String extId) {
        this.id = id;
        this.name = name;
        this.extId = extId;
    }

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
        return new GameDto(game.getId(), game.getName(), game.getExtId(), ConsoleDto.toDto(game.getConsole()), game.getNumOwners(),
                game.getReleaseDate(), game.isHasAchievements(), CompanyDto.toDto(game.getPublisher()), CompanyDto.toDto(game.getDeveloper()),
                game.getIconUrl(), PlatformDto.toDto(game.getPlatform()));
    }
}
