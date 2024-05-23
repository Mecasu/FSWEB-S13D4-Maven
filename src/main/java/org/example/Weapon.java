package org.example;

public enum Weapon {
    SWORD(15, 1.2),
    BLADE(17, 1.1),
    GLAIVE(30,0.4),
    SPEAR(22,1.0),
    BOW(12,1.2),
    TWOHANDEDSWORD(25,0.4),
    ONEHANDEDSWORD(10,1.5),
    STAFF(22,0.6),
    ROD(7,1.6),
    HARP(5,1.7),
    SHIELD(1, 0.1),
    ;

    private final int damage;
    private final double attackSpeed;
public int getDamage(){
    return damage;
}
public double getAttackSpeed(){
    return attackSpeed;
}
    Weapon(int damage, double attackSpeed) {
        this.damage=damage;
        this.attackSpeed=attackSpeed;
    }
}
