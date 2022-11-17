/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.introduction.threadcreation.original;

/**
 *
 * @author Pavlo
 */
public class RangePrinterThreadRunnable implements Runnable {

    private final int startFrom;
    private final int endIn;

    public static void main(String[] args) {
        new Thread(new RangePrinterThreadRunnable(90, 100)).start();
    }
    
    public RangePrinterThreadRunnable(int startFrom, int endIn) {
        this.startFrom = startFrom;
        this.endIn = endIn;
    }
    
    @Override
    public void run() {
        System.out.println("\nPrinting out a sequence of numbers:");
        for (int i = startFrom; i <= endIn; i++) {
            System.out.println(i);
        }
    }
    
}
