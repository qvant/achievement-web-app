package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Achievement;
import com.example.achivementwebapp.domain.PlayerAchievement;
import com.example.achivementwebapp.repository.PlayerAchievementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AchievementsService {
    private final PlayerAchievementRepository playerAchievementRepository;
    public List<PlayerAchievement> getLastAchievements(){
        return playerAchievementRepository.getLastAchievements(25L);
    }
}
