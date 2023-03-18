package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Game;
import com.example.achivementwebapp.domain.Player;

import java.util.List;

public interface PlayerService {
    List<Player> findAll();
    Player findByIdAndPlatformId(Long id, Long platformId);
}
