/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.RPGEtheriaChronicles;

/**
 *
 * @author LyahMX8
 */
public abstract class Ability {
    protected String name;
    protected int manaCost;
    protected double cooldown;

    public abstract void execute(Character user, Character target);
}
