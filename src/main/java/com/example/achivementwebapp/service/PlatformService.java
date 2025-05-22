package com.example.achivementwebapp.service;

import com.example.achivementwebapp.domain.Platform;
import com.example.achivementwebapp.repository.PlatformRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlatformService {
    private final PlatformRepository repository;
    public List<Platform> findAll(){
        return repository.findAll();
    }
}
