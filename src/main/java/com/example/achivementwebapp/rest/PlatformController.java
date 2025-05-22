package com.example.achivementwebapp.rest;

import com.example.achivementwebapp.domain.Platform;
import com.example.achivementwebapp.dto.PlatformDto;
import com.example.achivementwebapp.dto.PlayerDto;
import com.example.achivementwebapp.service.PlatformService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequiredArgsConstructor
public class PlatformController {
    private final PlatformService service;
    @GetMapping("/api/platforms")
    public List<PlatformDto> findPlatforms() {
        return service.findAll().stream().map(PlatformDto::toDto).collect(Collectors.toList());
    }
}
