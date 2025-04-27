package com.example.achivementwebapp.page;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ActivityFeedPageController {

    @GetMapping("/activity_feed")
    public String listPage(Model model) {
        return "activity_feed";
    }

}
