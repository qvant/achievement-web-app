package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Console;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ConsoleDto {
    long id;
    String name;
    PlatformDto platform;

    public static ConsoleDto toDto(Console console){
        if (console != null) {
            return new ConsoleDto(console.getId(), console.getName(), PlatformDto.toDto(console.getPlatform()));
        }
        return new ConsoleDto();
    }
}
