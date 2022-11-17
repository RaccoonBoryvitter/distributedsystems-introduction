/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.introduction.threadcreation.remake.threads;

import com.github.redscarf.distributedsystems.introduction.threadcreation.remake.helpers.AdvancedPrinter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Pavlo
 */
public final class ClassThread extends Thread {

    private static final Logger logger = LogManager.getLogger(ClassThread.class);
    private final int startNumber;
    private final int endNumber;
    private final AdvancedPrinter printer;

    public ClassThread(int startNumber, int endNumber, AdvancedPrinter printer) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.printer = printer;
    }

    @Override
    public void run() {
        logger.info("Starting counting inside Class thread from {} to {}",
                startNumber, endNumber);

        printer.print(startNumber, endNumber);

        logger.info("Finishing the countdown inside Class thread from {} to {}",
                startNumber, endNumber);
    }
}
