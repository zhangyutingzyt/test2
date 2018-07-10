package com.assertx.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void parameterTest1(String name,int age){
        System.out.println("name = " + name);
        System.out.println("age =" +age);
    }
}
