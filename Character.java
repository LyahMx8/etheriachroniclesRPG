/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg.etheria.chronicles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LyahMX8
 */
public abstract class Character {
    protected String name;
    protected int health;
    protected int attack;
    protected int defense;
    protected int level;

    protected List<Ability> abilities = new ArrayList<>();

    public Character(String name, int health, int attack, int defense, int level) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
    }

    public void takeDamage(int damage) {
        int finalDamage = Math.max(0, damage - defense);
        health -= finalDamage;

        System.out.println(name + " recibe " + finalDamage + " de daño! (HP: " + health + ")");
    }

    public void heal(int amount) {
        health += amount;
        System.out.println(name + " recibe " + amount);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

}
