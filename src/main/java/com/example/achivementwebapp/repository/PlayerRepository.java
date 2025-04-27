package com.example.achivementwebapp.repository;

import com.example.achivementwebapp.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Override
    List<Player> findAll();
    Optional<Player> findByIdAndPlatformId(Long id, Long platformId);


}
