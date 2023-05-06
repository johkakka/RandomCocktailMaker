package dev.johkakka.randomcocktailmaker.domain;

public enum BaseIngredient{
    GIN("ジン"),
    WHISKY("ウィスキー"),
    RUM("ラム"),
    VODKA("ウォッカ"),
    TEQUILA("テキーラ"),
    CASSIS("カシス"),
    CAMPARI("カンパリ"),
    BEER("ビール");

    private String name;
    BaseIngredient(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }
}
