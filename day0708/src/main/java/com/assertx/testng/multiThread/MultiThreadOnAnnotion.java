package com.assertx.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    @Test(invocationCount =10,threadPoolSize=3)
    public void test(){
        System.out.println("lalala");
        System.out.printf("Thread Id:  %S%n",Thread.currentThread());

    }
}
