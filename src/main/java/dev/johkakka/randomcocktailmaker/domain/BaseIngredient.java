package dev.johkakka.randomcocktailmaker.domain;

public enum BaseIngredient{
    GIN("ジン", "ジン", "gin"),
    WHISKY("ウィスキー", "ウィスキー", "whisky"),
    RUM("ラム", "ラム", "rum"),
    VODKA("ウォッカ", "ウォッカ", "vodka"),
    TEQUILA("テキーラ", "テキーラ", "tequila"),
    CASSIS("カシスリキュール", "カシス", "cassis"),
    CAMPARI("カンパリ", "カンパリ", "campari"),
    BEER("ビール", "ビア", "beer");

    private String name;
    private String shortName;
    private String query;

    BaseIngredient(String name, String shortName, String query) {
        this.name = name;
        this.shortName = shortName;
        this.query = query;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getQuery() {
        return query;
    }
}
