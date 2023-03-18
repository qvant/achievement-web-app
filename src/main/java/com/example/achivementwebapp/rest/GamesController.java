package com.example.achivementwebapp.rest;

import com.example.achivementwebapp.dto.GameDto;
import com.example.achivementwebapp.service.GameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@RestController
public class GamesController {
private final GameService gameService;
@GetMapping("/api/games")
    public List<GameDto> findGames(){
    return gameService.findAll().stream().map(GameDto::toDtoLight).collect(Collectors.toList());
}

    @GetMapping("/api/platform/{platform_id}/game/{game_id}/")
    public GameDto findGames(@PathVariable(name = "platform_id") Long platformId, @PathVariable(name = "game_id") Long gameId){
        return GameDto.toDto(gameService.findByIdAndPlatformId(gameId, platformId));
    }

}
