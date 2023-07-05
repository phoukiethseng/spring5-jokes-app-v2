package com.kiethseng.springjokes.service;


import com.kiethseng.springjokes.model.Quote;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"chuck-norris", "default"})
public class ChuckNorrisQuoteService implements QuoteService {

    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
    private final String AUTHOR = "Chuck Norris";

    @Override
    public Quote getRandomQuote() {
        return new Quote(chuckNorrisQuotes.getRandomQuote(), AUTHOR);
    }
}
