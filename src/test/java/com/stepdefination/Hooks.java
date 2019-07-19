package com.stepdefination;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectRepository.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;
	@Before
	public void method() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Koye\\eclipse-workspace\\New folder\\TestProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("----Before-----");
	}
	@After
	public void method1() {
		driver.quit();
		System.out.println("----After----");
	}

}
