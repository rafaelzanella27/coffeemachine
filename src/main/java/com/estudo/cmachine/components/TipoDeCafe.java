package com.estudo.cmachine.components;

public enum TipoDeCafe {
    FILTRADO("f"),
    EXPRESSO("e"),
    CAPPUCCINO("c");

    private String label;

    TipoDeCafe(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static TipoDeCafe fromString(String tipoCafe){
        for (TipoDeCafe tipoDeCafe : TipoDeCafe.values()){
            if (tipoDeCafe.getLabel().equalsIgnoreCase(tipoCafe)){
                return tipoDeCafe;
            }
        }
        return null;
    }
}
