package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*public class Add {
	static WebDriver driver;
	@Given("The user should be telecom home page and click the add customer")
	public void the_user_should_be_telecom_home_page_and_click_the_add_customer() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Koye\\eclipse-workspace\\New folder\\TestProject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The user provide valid details")
	public void the_user_provide_valid_details() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys("Bharath");
	    driver.findElement(By.id("lname")).sendKeys("Kumar");
	    driver.findElement(By.id("email")).sendKeys("koyi.bharath@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("Chennai");
	    driver.findElement(By.name("telephoneno")).sendKeys("7013635423");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("The user validate customer id is generated")
	public void the_user_validate_customer_id_is_generated() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Access Details to Guru99 Telecom']")).isDisplayed());
	}

}
*/