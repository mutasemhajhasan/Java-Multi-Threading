/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasemhajhasan.threading.example1;



/**
 *
 * @author Mutasem
 */
public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("counter befor thread 1 start: " + MyThread.counter);
        MyThread t1 = new MyThread();
        t1.start();
        Thread.sleep(200);;
        //t1.join();
        System.out.println("counter befor thread 2 start: " + MyThread.counter);
        MyThread t2 = new MyThread();
        t2.start();
        Thread.sleep(200);
        System.out.println("counter after thread 2 start " + MyThread.counter);
        //t2.join();
        Thread.sleep(2000);
        System.out.println("counter at the end of main " + MyThread.counter);

    }
}
