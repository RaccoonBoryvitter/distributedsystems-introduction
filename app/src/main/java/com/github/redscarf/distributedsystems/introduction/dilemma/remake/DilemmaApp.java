/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.introduction.dilemma.remake;

import com.github.redscarf.distributedsystems.introduction.dilemma.remake.threads.FireSide;
import com.github.redscarf.distributedsystems.introduction.dilemma.remake.threads.FlintstoneSide;

/**
 *
 * @author Pavlo
 */
public final class DilemmaApp {
    
    private static final FlintstoneSide _flintstoneSide = new FlintstoneSide();
    private static final FireSide _fireSide = new FireSide(_flintstoneSide);
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting the argument!");
        _fireSide.start();
        _flintstoneSide.start();

        if (!_flintstoneSide.isAlive() && !_fireSide.isAlive()) {
            System.out.println("Ending the argument...");
        }
    }
}
