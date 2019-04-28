package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void Ignore1(){
        System.out.println("Ignore1运行");
    }
    @Test(enabled=false)
    public void Ignore2(){
        System.out.println("Ignore2运行");
    }
    @Test(enabled=true)
    public void Ignore3(){
        System.out.println("Ignore3运行");
    }
}
