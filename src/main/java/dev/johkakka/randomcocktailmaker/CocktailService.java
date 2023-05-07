package dev.johkakka.randomcocktailmaker;

import dev.johkakka.randomcocktailmaker.domain.BaseIngredient;
import dev.johkakka.randomcocktailmaker.domain.Cocktail;
import dev.johkakka.randomcocktailmaker.domain.OtherIngredient;

public interface CocktailService {
    Cocktail get();
    void keyBaseIngredient(BaseIngredient ingredient);
    void keyOtherIngredient(OtherIngredient ingredient);
}
