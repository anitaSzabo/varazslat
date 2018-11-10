package com.mindeverest.varazslat;

public enum Spell {

    A(11),
    B(12),
    C(13),
    D(14),
    E(15);


    private int damage;

    Spell(int damage) {
        this.damage = damage;
    }

    public int getDamageValue() {
        return damage;
    }
}
