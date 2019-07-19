package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Koye\\eclipse-workspace\\New folder\\TestProject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    return driver;
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void type(WebElement element, String name) {
		element.sendKeys(name);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static boolean txtDisplay(WebElement element) {
		return element.isDisplayed();
	}
	public void quitBrowser() {
		driver.quit();
	}

}
