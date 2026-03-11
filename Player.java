/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg.etheria.chronicles;

import java.util.Scanner;

/**
 *
 * @author LyahMX8
 */

public class Player extends Character {
    private String race;
    private int experience;

    private Scanner scanner = new Scanner(System.in);

    public Player(String name, int health, int attack, int defense, int level, String race) {
        super(name, health, attack, defense, level);
        this.race = race;

        abilities.add(new Attack("Esquivada y defensa", 3, 0.2));
        abilities.add(new Attack("Golpe fuerte", 15, 0.1));
        abilities.add(new Attack("Golpe rápido", 6, 0.35));
    }

    public void levelUp() {
        level++;
        attack += 2;
        defense += 2;
        health += 10;
    }

    public Ability chooseAbility() {

        System.out.println("\nCual será tu siguiente ataque:");

        for (int i = 0; i < abilities.size(); i++) {
            System.out.println((i + 1) + " - " + abilities.get(i).name);
        }

        int choice = scanner.nextInt();
        
        if(choice > abilities.size()) {
            System.out.println("\nAún no has aprendido este ataque, elige otro!");
            return chooseAbility();
        } else {
            return abilities.get(choice - 1);
        }
    }
}
