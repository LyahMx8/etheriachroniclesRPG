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
public interface AIBehavior {
    Ability chooseAbility(Character enemy, Character target);
}

class AggressiveBehavior implements AIBehavior {
    @Override
    public Ability chooseAbility(Character enemy, Character target) {
        return enemy.getAbilities().get(0);
    }
}

class DefensiveBehavior implements AIBehavior {
    @Override
    public Ability chooseAbility(Character enemy, Character target) {
        return enemy.getAbilities().get(0);
    }
}

class RandomBehavior implements AIBehavior {
    private Random random = new Random();

    @Override
    public Ability chooseAbility(Character enemy, Character target) {

        int index = random.nextInt(enemy.getAbilities().size());
        return enemy.getAbilities().get(index);

    }
}

class BossBehavior implements AIBehavior {
    @Override
    public Ability chooseAbility(Character enemy, Character target) {
        return enemy.getAbilities().get(0);
    }
}

class HealerBehavior implements AIBehavior {
    @Override
    public Ability chooseAbility(Character enemy, Character target) {
        return enemy.getAbilities().get(0);
    }
}