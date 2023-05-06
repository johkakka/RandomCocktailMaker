package dev.johkakka.randomcocktailmaker;

import dev.johkakka.randomcocktailmaker.domain.Cocktail;
import org.springframework.stereotype.Service;

@Service
public interface CocktailService {
    public Cocktail get();
}
