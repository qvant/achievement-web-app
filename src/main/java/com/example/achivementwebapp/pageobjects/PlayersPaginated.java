package com.example.achivementwebapp.pageobjects;

import com.example.achivementwebapp.domain.Player;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PlayersPaginated {
    private long count;
    private List<Player> players;
}
