package com.example.achivementwebapp.repository;

import com.example.achivementwebapp.domain.Platform;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlatformRepository extends JpaRepository<Platform, Long> {
    @Override
    List<Platform> findAll();
}
