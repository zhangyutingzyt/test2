package com.assertx.testng;

import org.testng.annotations.Test;

/**
 * 依赖：
 * test1先执行，然后再执行test2
 * 如果test1失败了，就不执行test2
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods =  {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
