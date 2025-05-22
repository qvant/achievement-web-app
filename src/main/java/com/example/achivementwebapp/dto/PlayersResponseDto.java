package com.example.achivementwebapp.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PlayersResponseDto {
    private long pages;
    private List<PlayerDto> players;
}
