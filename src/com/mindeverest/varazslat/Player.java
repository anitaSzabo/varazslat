package com.mindeverest.varazslat;

import java.util.Scanner;

public class Player {
    private int id;
    private int health;
    private String name;
    private static int generateId = 1;

    public Player(String name) {
        this.name = name;
        this.id = generateId;
        this.health = 100;
        generateId++;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if(health < 0) {
            health = 0;
        }
    }

    public Spell attack(Player player) {
        System.out.println("Enter spell: ");
        Scanner scanner = new Scanner(System.in);
        String spellChar = scanner.nextLine().toUpperCase();
        Spell spell = Spell.valueOf(spellChar);
        return spell;

    }
}
