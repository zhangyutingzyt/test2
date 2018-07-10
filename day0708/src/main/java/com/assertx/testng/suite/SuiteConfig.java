package com.assertx.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("bufore suite运行拉");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行拉");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("bufore Test运行拉");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after Test运行拉");
    }
}
