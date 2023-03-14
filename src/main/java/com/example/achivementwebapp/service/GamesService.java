package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Game;

import java.util.List;
import java.util.Optional;

public interface GamesService {
    List<Game> findAll();
    Game findByIdAndPlatformId(Long id, Long platformId);
}
