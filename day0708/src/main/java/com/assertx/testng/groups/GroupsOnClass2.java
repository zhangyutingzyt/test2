package com.assertx.testng.groups;

import org.testng.annotations.Test;

@Test(groups="stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("groupsOnClass2中的stu1运行");
    }
    public void stu2(){
        System.out.println("groupsOnClass2中的stu22运行");
    }
}
