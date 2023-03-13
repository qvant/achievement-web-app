package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Game;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GamesServiceImpl implements GamesService {
    @Override
    public List<Game> findAll() {
        var tmp = new ArrayList<Game>();
        var g = new Game();
        g.setId(1L);
        g.setName("AAAA");
        tmp.add(g);
        return tmp;
    }
}
