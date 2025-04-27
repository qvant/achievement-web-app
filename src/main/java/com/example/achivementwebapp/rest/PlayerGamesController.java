package com.example.achivementwebapp.rest;

import com.example.achivementwebapp.dto.PlayerGameDto;
import com.example.achivementwebapp.service.PlayerGamesService;
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
public class PlayerGamesController {
    private final PlayerGamesService playerGamesService;


    @GetMapping("/api/platform/{platform_id}/player/{player_id}/games")
    public List<PlayerGameDto> findPlayerGames(@PathVariable(name = "platform_id") long platformId, @PathVariable(name="player_id") long playerId){
        return playerGamesService.findByPlayerIdAndPlatformId(platformId, playerId).stream().map(PlayerGameDto::toDto).collect(Collectors.toList());
    }
}
