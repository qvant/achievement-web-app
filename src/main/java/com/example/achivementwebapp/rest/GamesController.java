package com.example.achivementwebapp.rest;

import com.example.achivementwebapp.domain.Game;
import com.example.achivementwebapp.dto.GameDto;
import com.example.achivementwebapp.service.GamesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@RestController
public class GamesController {
private final GamesService gamesService;
@GetMapping("/api/games")
    public List<GameDto> findGames(){
    return gamesService.findAll().stream().map(GameDto::toDto).collect(Collectors.toList());
}

    @GetMapping("/api/game")
    public GameDto findGames(@RequestParam(name = "game_id") Long gameId, @RequestParam(name = "platform_id") Long platformId){
        return GameDto.toDto(gamesService.findByIdAndPlatformId(gameId, platformId));
    }

}
