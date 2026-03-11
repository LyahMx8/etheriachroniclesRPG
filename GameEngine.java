/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.RPGEtheriaChronicles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LyahMX8
 */

public class GameEngine {

    public static void main(String[] args) {
        GameEngine engine = new GameEngine();
        engine.startGame();
    }

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public void startGame() {

        System.out.println("=== Crónicas de Etheria ===");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("""
                           En tiempos antiguos los seres luchaban por 
                           obtener riquezas, gloria o tan solo simples recursos para sobrevivir.
                           Ellos lideraban grandes batallas día tras día ante amenazas y adversidades.""");

        Player player = chooseCharacter();
        Enemy enemy = createRandomEnemy();
        
        System.out.println("\n" + player.name + ". Inicias tu camino como un " + player.race +
                        "\nHP: " + player.health +
                        "\nDefensa: " + player.defense +
                        "\nAtaque: " + player.attack +
                        "\nNivel: " + player.level);

        Battle battle = new Battle(player, enemy);
        battle.startBattle();

        endGame();
    }

    public Player chooseCharacter() {

        System.out.print("Ingresa el nombre de tu campeón: ");
        String name = scanner.nextLine();

        System.out.println("\nElige tu raza:");
        System.out.println("1 - Elfo");
        System.out.println("2 - Orco");
        System.out.println("3 - Humano");

        int choice = scanner.nextInt();

        return switch (choice) {
            case 1 -> new Player(name, 90, 14, 8, 1, "Elfo");
            case 2 -> new Player(name, 120, 15, 6, 1, "Orco");
            default -> new Player(name, 100, 12, 10, 1, "Humano");
        };
    }

    private Enemy createRandomEnemy() {

        int type = random.nextInt(2);

        return switch (type) {
            case 0 -> new Enemy("Esqueleto", 70, 12, 6, 1, "Undead", new RandomBehavior());
            case 1 -> new Enemy("Caballero Oscuro", 120, 15, 12, 2, "Boss", new BossBehavior());
            case 2 -> new Enemy("Dragón", 160, 20, 16, 3, "Boss", new AggressiveBehavior());
            default -> new Enemy("Goblin", 80, 10, 8, 1, "Goblin", new AggressiveBehavior());
        };
    }

    public void endGame() {
        System.out.println("\n=== Esta aventura termina por hoy. Ahora descansa y recupérate. ===");
        System.out.println("\n.\n.\n.\nA lo lejos escuchas otro sonido...");
        System.exit(0);
    }
}