package dev.johkakka.randomcocktailmaker;

import dev.johkakka.randomcocktailmaker.domain.BaseIngredient;
import dev.johkakka.randomcocktailmaker.domain.Cocktail;
import dev.johkakka.randomcocktailmaker.domain.OtherIngredient;
import org.springframework.stereotype.Service;

@Service
public class CocktailServiceImpl implements CocktailService {

    private CocktailRepository repository;
    private BaseIngredient baseIngredient;
    private OtherIngredient otherIngredient;

    public CocktailServiceImpl(CocktailRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cocktail get() {
        return null;
    }

    @Override
    public void keyBaseIngredient(BaseIngredient ingredient) {
        baseIngredient = ingredient;
    }

    @Override
    public void keyOtherIngredient(OtherIngredient ingredient) {
        otherIngredient = ingredient;
    }


}
