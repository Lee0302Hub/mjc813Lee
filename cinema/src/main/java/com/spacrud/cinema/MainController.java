package com.spacrud.cinema;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/cinema")
    public String main() {
        return "/cinema/mainPage";
    }
}
