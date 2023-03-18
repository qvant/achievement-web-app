package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Game;

import java.util.List;

public interface GameService {
    List<Game> findAll();
    Game findByIdAndPlatformId(Long id, Long platformId);
}
