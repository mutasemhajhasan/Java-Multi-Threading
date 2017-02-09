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
public class MainClass {

    public static void main(String[] args) throws InterruptedException {
         Counter c = new Counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        Thread.sleep(200);
        System.out.println("counter " + c.getCount());
        t2.start();
        Thread.sleep(200);
        System.out.println("counter " + c.getCount());
        Thread.sleep(2000);
        System.out.println("counter " + c.getCount());
        
    }
}
