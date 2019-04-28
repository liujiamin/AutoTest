package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("BeforeSuite运行");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite运行");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("BeforeTest运行");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest运行");
    }
}
