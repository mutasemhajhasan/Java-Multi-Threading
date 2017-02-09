/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasemhajhasan.threading.example2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mutasem
 */
public class MyThread extends Thread {

    Counter c;

    public MyThread(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            c.increment();
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
