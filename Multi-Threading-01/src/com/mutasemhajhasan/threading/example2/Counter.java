/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasemhajhasan.threading.example2;

/**
 *
 * @author Mutasem
 */
public class Counter {

    private int count;

    public synchronized int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public synchronized void increment() throws InterruptedException {
        System.out.println("Count bfore loop: " + count);
        for (int i = 0; i < 10; i++) {
            count++;
            Thread.sleep(100);
        }
        System.out.println("Count after loop: " + count);
    }

}
