package com.example.achivementwebapp.repository;

import com.example.achivementwebapp.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Long> {
    Optional<Game> findByIdAndPlatformId(Long id, Long platformId);
}
