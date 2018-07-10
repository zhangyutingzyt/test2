package com.assertx.testng.multiThread;

import org.testng.annotations.Test;

public class MultyThreadOnXml {

    @Test()
    public void test1(){
        System.out.println("lalala");
        System.out.printf("Thread Id:  %S%n",Thread.currentThread());

    }
    @Test()
    public void test2(){
        System.out.println("lalala");
        System.out.printf("Thread Id:  %S%n",Thread.currentThread());

    }
    @Test()
    public void test3(){
        System.out.println("lalala");
        System.out.printf("Thread Id:  %S%n",Thread.currentThread());

    }
}
