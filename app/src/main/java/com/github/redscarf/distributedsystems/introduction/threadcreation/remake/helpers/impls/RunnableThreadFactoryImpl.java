/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.redscarf.distributedsystems.introduction.threadcreation.remake.helpers.impls;

import com.github.redscarf.distributedsystems.introduction.threadcreation.remake.helpers.MyThreadFactory;
import com.github.redscarf.distributedsystems.introduction.threadcreation.remake.threads.RunnableThread;

/**
 *
 * @author Pavlo
 */
public class RunnableThreadFactoryImpl implements MyThreadFactory {
    
    @Override
    public Thread create(int start, int end) {
        return new Thread(new RunnableThread(start, end, new AdvancedPrinterImpl()));
    }
    
}
