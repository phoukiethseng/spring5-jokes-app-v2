package com.kiethseng.springjokes.controller;

import com.kiethseng.springjokes.service.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final QuoteService quoteService;

    public JokeController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/")
    public String getRandomQuotes(Model model) {
        model.addAttribute("jokeQuote", quoteService.getRandomQuote());
        model.addAttribute("jokeAuthor", quoteService.getAuthorName());
        return "index";
    }
}
