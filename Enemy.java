/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RPGEtheriaChronicles;

/**
 *
 * @author LyahMX8
 */
public class Enemy extends Character {
    String enemyType;
    private AIBehavior behavior;

    public Enemy(String name, int health, int attack, int defense, int level, String enemyType, AIBehavior behavior) {
        super(name, health, attack, defense, level);
        this.enemyType = enemyType;
        this.behavior = behavior;

        abilities.add(new Attack(
            "Zarpaso",
            8,
            0.1,
            "ataca con precisión!"
        ));

        abilities.add(new Attack(
            "Mordida",
            10,
            0.6,
            "ataca ferozmente!"
        ));

        abilities.add(new Attack(
            "Golpe rápido",
            6,
            0.20,
            "se lanza hacia adelante!"
        ));            
    }

    public AIBehavior getBehavior() {
        return behavior;
    }
}