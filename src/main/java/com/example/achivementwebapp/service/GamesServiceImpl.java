package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Game;
import com.example.achivementwebapp.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GamesServiceImpl implements GamesService {
    private final GameRepository gameRepository;
    @Override
    public List<Game> findAll() {
        return gameRepository.findAll();
    }
}
