package dev.johkakka.randomcocktailmaker;

import org.springframework.stereotype.Repository;

@Repository
public interface CocktailRepository {
    public String get(int i);
}
