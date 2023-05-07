package dev.johkakka.randomcocktailmaker;

import dev.johkakka.randomcocktailmaker.domain.BaseIngredient;
import dev.johkakka.randomcocktailmaker.domain.Cocktail;
import dev.johkakka.randomcocktailmaker.domain.OtherIngredient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        Random random = new Random();
        int baseIndex = random.nextInt(0, BaseIngredient.values().length);
        int otherIndex = random.nextInt(0, OtherIngredient.values().length);

        Cocktail cocktail = new Cocktail();

        List<BaseIngredient> baseIngredientList = new ArrayList<>();
        baseIngredientList.add(BaseIngredient.values()[baseIndex]);
        cocktail.setBaseIngredients(baseIngredientList);

        List<OtherIngredient> otherIngredientList = new ArrayList<>();
        otherIngredientList.add(OtherIngredient.values()[otherIndex]);
        cocktail.setOtherIngredients(otherIngredientList);

        return cocktail;
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
