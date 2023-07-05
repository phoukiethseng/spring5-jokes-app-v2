package com.kiethseng.springjokes.service;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteService implements QuoteService {

    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }

    @Override
    public String getAuthorName() {
        return "Chuck Norris";
    }
}
