/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg.etheria.chronicles;

import java.util.Random;

/**
 *
 * @author LyahMX8
 */

public class Attack extends Ability {
    private int damage;
    private double criticalChance;

    private Random random = new Random();

    private String[] attackMessages = {
            "ataca ferozmente!",
            "se lanza hacia adelante!",
            "le pega suavemente!",
            "ataca con precisión!",
            "lanza un ataque brutal!"
    };

    public Attack(String name, int damage, double criticalChance) {
        this.name = name;
        this.damage = damage;
        this.criticalChance = criticalChance;
    }

    @Override
    public void execute(Character user, Character target) {

        int variance = random.nextInt(5) - 2;
        int finalDamage = damage + user.attack + variance;

        boolean critical = random.nextDouble() < criticalChance;

        String message = attackMessages[random.nextInt(attackMessages.length)];

        System.out.println("\n======= // ====== // =======");
        System.out.println(user.name + " " + message);
        System.out.println(user.name + " usa " + name + "!");

        if (critical) {
            finalDamage *= 2;
            System.out.println("💥 GOLPE CRÍTICO!");
        }

        target.takeDamage(finalDamage);
    }
}