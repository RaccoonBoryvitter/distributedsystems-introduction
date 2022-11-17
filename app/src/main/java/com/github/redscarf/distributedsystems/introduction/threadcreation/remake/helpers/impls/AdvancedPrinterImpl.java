/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.introduction.threadcreation.remake.helpers.impls;

import com.github.redscarf.distributedsystems.introduction.threadcreation.remake.helpers.AdvancedPrinter;
import java.util.stream.IntStream;

/**
 *
 * @author Pavlo
 */
public class AdvancedPrinterImpl implements AdvancedPrinter {
    
    @Override
    public void print(int start, int end) {
        System.out.println("\nPrinting out a sequence of numbers:");
        IntStream.rangeClosed(start, end)
                 .forEachOrdered(System.out::println);
        System.out.println("Ended a printing out the sequence. Exiting printer...");
    }
    
}
