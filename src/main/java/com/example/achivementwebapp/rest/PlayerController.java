package com.example.achivementwebapp.rest;

import com.example.achivementwebapp.dto.PlayerDto;
import com.example.achivementwebapp.dto.PlayersResponseDto;
import com.example.achivementwebapp.pageobjects.PlayersPaginated;
import com.example.achivementwebapp.service.PlayerGamesService;
import com.example.achivementwebapp.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;
    private final PlayerGamesService playerGamesService;

    @GetMapping("/api/players")
    public PlayersResponseDto findPlayers(@RequestParam(name = "platform_id", required = false) Long platformId,
                                          @RequestParam(name = "player_id", required = false) Long playerId,
                                          @RequestParam(name = "player_name", required = false) String playerName,
                                          @RequestParam(name = "page_number", defaultValue = "0") Long pageNumber,
                                          @RequestParam(name = "page_size", defaultValue = "50") Long pageSize) {
        PlayersPaginated page = playerService.findByConditionsPaginated(platformId, playerId, playerName, pageNumber, pageSize);
        return PlayersResponseDto.builder().players(page.getPlayers().stream().map(PlayerDto::toDto).collect(Collectors.toList())).pages(page.getCount()/pageSize).build();
    }

    @GetMapping("/api/platform/{platform_id}/player/{player_id}/")
    public PlayerDto findGames(@PathVariable(name = "platform_id") Long platformId, @PathVariable(name = "player_id") Long playerId) {
        return PlayerDto.toDto(playerService.findByIdAndPlatformId(playerId, platformId));
    }

}
