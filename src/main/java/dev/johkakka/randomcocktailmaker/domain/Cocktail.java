package dev.johkakka.randomcocktailmaker.domain;

import java.util.ArrayList;
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

    public Cocktail() {
        this("Anonymous Cocktail", new ArrayList<>(), new ArrayList<>());
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

    public String getBaseNames() {
        StringBuilder s = new StringBuilder();

        for (BaseIngredient baseIngredient : this.baseIngredients) {
            s.append(baseIngredient.getName());
        }

        return s.toString();
    }

    public String getOtherNames() {
        StringBuilder s = new StringBuilder();

        for (OtherIngredient otherIngredient : this.otherIngredients) {
            s.append(otherIngredient.getName());
        }

        return s.toString();
    }


    public String getBaseSimpleNames() {
        StringBuilder s = new StringBuilder();

        for (BaseIngredient baseIngredient : this.baseIngredients) {
            s.append(baseIngredient.getShortName());
        }

        return s.toString();
    }

    public String getOtherSimpleNames() {
        StringBuilder s = new StringBuilder();

        for (OtherIngredient otherIngredient : this.otherIngredients) {
            s.append(otherIngredient.getShortName());
        }

        return s.toString();
    }


    public String getSimpleName() {
        StringBuilder s = new StringBuilder();

        s.append(getBaseSimpleNames());
        s.append(getOtherSimpleNames());

        return s.toString();
    }
}
