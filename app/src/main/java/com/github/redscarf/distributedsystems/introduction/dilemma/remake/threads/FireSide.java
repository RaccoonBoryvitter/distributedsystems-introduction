/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.introduction.dilemma.remake.threads;

import com.github.redscarf.distributedsystems.introduction.dilemma.remake.helpers.ThreadWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Pavlo
 */
public class FireSide extends ThreadWrapper {
    
    private static final Logger logger = LogManager.getLogger(FireSide.class);
    private final FlintstoneSide flintStoneSide;

    public FireSide(FlintstoneSide flintStoneSide) {
        this.flintStoneSide = flintStoneSide;
    }

    @Override
    public void run() {
        logger.info("Starting the argument from fire side...");
        for (int i = 0; i < 5; i++) {
            this.trySleep(1000);
            System.out.println("Fire!");
        }
        logger.info("Ending the argument from fire side...");

        if (flintStoneSide.isAlive()) {
            try {
                flintStoneSide.join();
            } catch (InterruptedException e) {
                logger.error("The error occurred while trying to join a thread! (Thread ID: {}, name: {}",
                        flintStoneSide.getId(), flintStoneSide.getName());
                logger.error("Exception is thrown - {}", e.getMessage());
                throw new RuntimeException(e);
            }

            System.out.println("So, the first was the fire!");
        } else {
            System.out.println("So, the first was the flintstone!");
        }
    }
    
}
