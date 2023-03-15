package com.example.achivementwebapp.repository;

import com.example.achivementwebapp.domain.Game;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Override
    @EntityGraph(value = "games-platform-company")
    List<Game> findAll();

    Optional<Game> findByIdAndPlatformId(Long id, Long platformId);
}
