/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg.etheria.chronicles;

/**
 *
 * @author LyahMX8
 */
public class Enemy extends Character {
    private final String enemyType;
    private final AIBehavior behavior;

    public Enemy(String name, int health, int attack, int defense, int level, String enemyType, AIBehavior behavior) {
        super(name, health, attack, defense, level);
        this.enemyType = enemyType;
        this.behavior = behavior;

        abilities.add(new Attack("Zarpaso", 8, 0.1));
        abilities.add(new Attack("Mordida", 10, 0.15));
        abilities.add(new Attack("Golpe rápido", 10, 0.15));
    }

    public AIBehavior getBehavior() {
        return behavior;
    }
}