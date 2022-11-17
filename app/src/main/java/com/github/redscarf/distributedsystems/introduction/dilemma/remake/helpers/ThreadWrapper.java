/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.introduction.dilemma.remake.helpers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Pavlo
 */
public abstract class ThreadWrapper extends Thread {

    protected static final Logger logger = LogManager.getLogger(ThreadWrapper.class);

    protected void trySleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            logger.error("The error occurred while trying to pause a thread!");
            logger.error("Exception is thrown - {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
