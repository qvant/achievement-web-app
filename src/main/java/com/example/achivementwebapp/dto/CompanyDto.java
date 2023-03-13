package com.example.achivementwebapp.dto;

import com.example.achivementwebapp.domain.Company;
import com.example.achivementwebapp.domain.Console;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CompanyDto {
    long id;
    String name;
    PlatformDto platform;

    public static CompanyDto toDto(Company company){
        if (company != null) {
            return new CompanyDto(company.getId(), company.getName(), PlatformDto.toDto(company.getPlatform()));
        }
        return new CompanyDto();
    }
}
