/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.introduction.threadcreation.remake;

import com.github.redscarf.distributedsystems.introduction.threadcreation.remake.helpers.MyThreadFactory;
import com.github.redscarf.distributedsystems.introduction.threadcreation.remake.helpers.impls.ClassThreadFactoryImpl;
import com.github.redscarf.distributedsystems.introduction.threadcreation.remake.helpers.impls.RunnableThreadFactoryImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Pavlo
 */
public final class ThreadCreationApp {

    private static final Logger logger = LogManager.getLogger(ThreadCreationApp.class);

    public static void main(String[] args) throws InterruptedException {
        // Setting up the values of range
        int start = 0, end = 10;
        MyThreadFactory threadFactory = new RunnableThreadFactoryImpl();
        Thread runnableThread = threadFactory.create(start, end);
        logger.info("Created a thread \"{}\" (ID: {})", runnableThread.getName(), runnableThread.getId());

        // Changing values
        start = 90;
        end = 100;
        threadFactory = new ClassThreadFactoryImpl();
        Thread classyThread = threadFactory.create(start, end);
        logger.info("Created a thread \"{}\" (ID: {})", classyThread.getName(), classyThread.getId());

        // Make them work
        classyThread.start();
        // classyThread.join();
        runnableThread.start();
    }

}
