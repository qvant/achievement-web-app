package com.example.achivementwebapp.rest;

import com.example.achivementwebapp.dto.AchievementDto;
import com.example.achivementwebapp.dto.PlayerAchievementDto;
import com.example.achivementwebapp.dto.PlayerDto;
import com.example.achivementwebapp.service.AchievementsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ActivityFeedController {
    private final AchievementsService achievementsService;
    @GetMapping("/api/get_last_achievements/")
    public List<PlayerAchievementDto> findLastAchievements (){
        return achievementsService.getLastAchievements().stream().map(PlayerAchievementDto::toDto).collect(Collectors.toList());
    }
}
