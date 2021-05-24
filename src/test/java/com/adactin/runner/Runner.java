package com.adactin.runner;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
					glue = "com\\adactin\\stepdefinition")

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {

		driver = BaseClass.browserLaunch("Chrome");
	}
	
	@AfterClass
	public static void tearDown() {

		driver.quit();
	}

}
