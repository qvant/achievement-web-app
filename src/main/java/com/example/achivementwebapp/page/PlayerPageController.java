package com.example.achivementwebapp.page;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PlayerPageController {

    @GetMapping("/players")
    public String listPage(Model model) {
        return "playersList";
    }

    @GetMapping("/playerShow")
    public String showPage() {
        return "player";
    }

}
