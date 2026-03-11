/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg.etheria.chronicles;

/**
 *
 * @author LyahMX8
 */
public class Battle {
    private Player player;
    private Enemy enemy;

    public Battle(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void startBattle() {
        System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("\nAl emprender tu camino de repente escuchas un ruido extraño y rápidamente analizas el entorno ...");
        System.out.println("\nUn " + enemy.name + " aparece entre los árboles!");
        System.out.println(player.name + " salta hacia un lugar protegido listo para el combate!");

        while (player.isAlive() && enemy.isAlive()) {
            playerTurn();
            if (!enemy.isAlive()) break;
            
            enemyTurn();
        }

        if (player.isAlive()) {
            System.out.println(player.name + " ha ganado la batalla!");
        } else {
            System.out.println("\n\nEl " + enemy.name + " ha salido victorioso y tendra un gran festín. \n\n\n Perdiste.");
        }
    }

    private void playerTurn() {
        System.out.println("HP de " + player.name + ": " + enemy.health);
        System.out.println("\n--- Es tu turno ---");
        Ability ability = player.chooseAbility();
        ability.execute(player, enemy);
    }

    private void enemyTurn() {
        System.out.println("HP del " + enemy.name + ": " + enemy.health);
        System.out.println("\n--- El enemigo realiza un ataque ---");
        Ability ability = enemy.getBehavior().chooseAbility(enemy, player);
        ability.execute(enemy, player);
    }
}
