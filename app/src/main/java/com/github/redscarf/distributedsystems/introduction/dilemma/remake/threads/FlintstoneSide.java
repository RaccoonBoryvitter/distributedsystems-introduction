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
public class FlintstoneSide extends ThreadWrapper {
    
    private static final Logger logger = LogManager.getLogger(FlintstoneSide.class);

    @Override
    public void run() {
        logger.info("Starting the argument from flintstone side...");
        for (int i = 0; i < 5; i++) {
            this.trySleep(1000);
            System.out.println("Flintstone!");
        }
        logger.info("Ending the argument from flintstone side...");
    }
    
}
