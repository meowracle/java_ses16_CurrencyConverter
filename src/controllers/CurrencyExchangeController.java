package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyExchangeController {
    @GetMapping("/index")
    public String conversion(){
        return "index";
    }

    @GetMapping("/result")
    public String conversion(@RequestParam float rate, float usd, Model model) {
        float vnd = rate * usd;
        model.addAttribute("vnd", vnd);
        return "index";
    }
}
