package com.example.achivementwebapp.rest;

import com.example.achivementwebapp.dto.GameDto;
import com.example.achivementwebapp.dto.PlayerDto;
import com.example.achivementwebapp.dto.PlayerGameDto;
import com.example.achivementwebapp.service.PlayerGamesService;
import com.example.achivementwebapp.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;
    private final PlayerGamesService playerGamesService;

    @GetMapping("/api/players")
    public List<PlayerDto> findPlayers(){
        return playerService.findAll().stream().map(PlayerDto::toDto).collect(Collectors.toList());
    }

    @GetMapping("/api/platform/{platform_id}/player/{player_id}/")
    public PlayerDto findGames(@PathVariable(name = "platform_id") Long platformId, @PathVariable(name = "player_id") Long playerId){
        return PlayerDto.toDto(playerService.findByIdAndPlatformId(playerId, platformId));
    }

    @GetMapping("/api/platform/{platform_id}/player/{player_id}/games")
    public List<PlayerGameDto> findPlayerGames(@PathVariable(name = "platform_id") long platformId, @PathVariable(name="player_id") long playerId){
        return playerGamesService.findByPlayerIdAndPlatformId(platformId, playerId).stream().map(PlayerGameDto::toDto).collect(Collectors.toList());
    }
}
