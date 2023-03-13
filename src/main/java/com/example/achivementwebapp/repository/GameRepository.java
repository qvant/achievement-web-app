package com.example.achivementwebapp.repository;

import com.example.achivementwebapp.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
