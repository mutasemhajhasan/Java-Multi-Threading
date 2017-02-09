/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasemhajhasan.threading.example;

/**
 *
 * @author Mutasem
 */
public class MyThread extends Thread {

    public static int counter;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter++;
        }
       
    }

}
