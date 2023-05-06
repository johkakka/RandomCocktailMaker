package dev.johkakka.randomcocktailmaker.domain;

public enum OtherIngredient {
    SODA("炭酸水"),
    TONIC_WATER("トニックウォーター"),
    GINGER_ALE("ジンジャーエール"),
    ORANGE_JUICE("オレンジジュース"),
    CRANBERRY_JUICE("クランベリージュース"),
    GRAPEFRUIT_JUICE("グレープフルーツジュース"),
    PINEAPPLE_JUICE("パイナップルジュース"),
    COKE("コーラ");

    private String name;

    OtherIngredient(String name) {
        this.name = name;
    }
}
