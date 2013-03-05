package com.sebprunier.devoxxfr.scalaskel;

public enum Coin {

    FOO(1), BAR(7), QIX(11), BAZ(21);

    private Coin(Integer value) {
        this.value = value;
    }

    private Integer value;

    public Integer getValue() {
        return value;
    }
}
