package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Platform;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PlatformDto {
    long id;
    String name;

    public static PlatformDto toDto(Platform platform){
        return new PlatformDto(platform.getId(), platform.getName());
    }
}
