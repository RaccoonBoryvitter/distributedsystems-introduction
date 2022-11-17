/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.introduction.threadcreation.original;

/**
 *
 * @author Pavlo
 */
public class RangePrinterThreadClass extends Thread {

    private final int startFrom;
    private final int endIn;

    public static void main(String[] args) throws InterruptedException {
        RangePrinterThreadClass thread1 =  new RangePrinterThreadClass(10, 20);
        thread1.start();
        thread1.join();
        
        thread1.run();
    }

    public RangePrinterThreadClass(int startFrom, int endIn) {
        this.startFrom = startFrom;
        this.endIn = endIn;
    }

    @Override
    public void run() {
        System.out.println("\nCurrent thread: " + Thread.currentThread().getName());
        System.out.println("\nPrinting out a sequence of numbers:");
        for (int i = startFrom; i <= endIn; i++) {
            System.out.println(i);
        }
        System.out.println("");
    }
}
