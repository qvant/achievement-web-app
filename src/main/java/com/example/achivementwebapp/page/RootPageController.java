package com.example.achivementwebapp.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootPageController {

    @GetMapping("/")
    public String showRoot() {
        return "root";
    }
}
