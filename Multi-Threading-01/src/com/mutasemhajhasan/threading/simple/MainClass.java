/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasemhajhasan.threading.simple;

/**
 *
 * @author Mutasem
 */
public class MainClass {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        MyRunnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
