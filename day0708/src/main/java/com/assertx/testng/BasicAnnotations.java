package com.assertx.testng;


import org.testng.annotations.*;

public class BasicAnnotations {
    @Test
    public void testCase1(){
        System.out.println("this is a testcase 01");
    }

    @Test
    public void testCase2(){
        System.out.println("this is a testcase 02");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforemethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("aftermethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforecladd");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
}
