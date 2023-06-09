package com.example.achivementwebapp.page;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class GamesPageController {

    @GetMapping("/games")
    public String listPage(Model model) {
        return "gamesList";
    }

    @GetMapping("/gameShow")
    public String showPage() {
        return "game";
    }

}
