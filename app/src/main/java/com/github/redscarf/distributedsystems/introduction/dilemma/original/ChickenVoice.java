/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.introduction.dilemma.original;

/**
 *
 * @author Pavlo
 */
public class ChickenVoice {

    private static EggVoice anotherOpinion;

    public static void main(String[] args) {
        anotherOpinion = new EggVoice();

        System.out.println("Starting the argument...");
        anotherOpinion.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Chicken!");
        }
        if (anotherOpinion.isAlive()) {
            try {
                anotherOpinion.join();
            } catch (InterruptedException e) {
            }
            System.out.println("First was the chicken!");
        } else {
            System.out.println("First was the egg!");
        }
        
        System.out.println("End of the argument!");
    }
}
