package dev.johkakka.randomcocktailmaker;

import dev.johkakka.randomcocktailmaker.domain.Cocktail;
import org.springframework.stereotype.Service;

@Service
public class CocktailServiceImpl implements CocktailService{

    private CocktailRepository repository;

    public CocktailServiceImpl(CocktailRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cocktail get() {
        return null;
    }
}
