/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasemhajhasan.threading.example1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutasem
 */
public class MyThread extends Thread {

    public static int counter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("Counter " + counter);
    }

}
