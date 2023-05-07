package dev.johkakka.randomcocktailmaker.domain;

import java.util.List;

public class Cocktail {
    private String name;
    private List<BaseIngredient> baseIngredients;
    private List<OtherIngredient> otherIngredients;

    public Cocktail(String name, List<BaseIngredient> baseIngredients, List<OtherIngredient> otherIngredients) {
        this.name = name;
        this.baseIngredients = baseIngredients;
        this.otherIngredients = otherIngredients;
    }

    public String getName() {
        return name;
    }

    public List<BaseIngredient> getBaseIngredients() {
        return baseIngredients;
    }

    public List<OtherIngredient> getOtherIngredients() {
        return otherIngredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseIngredients(List<BaseIngredient> baseIngredients) {
        this.baseIngredients = baseIngredients;
    }

    public void setOtherIngredients(List<OtherIngredient> otherIngredients) {
        this.otherIngredients = otherIngredients;
    }
}
