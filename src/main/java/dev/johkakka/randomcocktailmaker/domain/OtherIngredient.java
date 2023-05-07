package dev.johkakka.randomcocktailmaker.domain;

public enum OtherIngredient {
    SODA("炭酸水", "ソーダ", "soda"),
    TONIC_WATER("トニックウォーター", "トニック", "tonic_water"),
    GINGER_ALE("ジンジャーエール", "バック", "ginger_ale"),
    ORANGE_JUICE("オレンジジュース", "オレンジ", "orange"),
    CRANBERRY_JUICE("クランベリージュース", "クランベリー", "cranberry"),
    GRAPEFRUIT_JUICE("グレープフルーツジュース", "グレープフルーツ", "grapefruit"),
    PINEAPPLE_JUICE("パイナップルジュース", "パイン", "pineapple"),
    COKE("コーラ", "コーク", "coke");

    private String name;
    private String shortName;
    private String query;

    OtherIngredient(String name, String shortName, String query) {
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
