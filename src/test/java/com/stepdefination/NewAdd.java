package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectRepository.AddCustmer;
import com.objectRepository.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAdd extends Base{
	//public static WebDriver driver;
	@Given("The user should be telecom home page and click the add customer")
	public void the_user_should_be_telecom_home_page_and_click_the_add_customer() {
	    System.out.println("---Given----");
	    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath Koye\\eclipse-workspace\\New folder\\TestProject\\Drivers\\chromedriver.exe");
	    //driver = new ChromeDriver();
	    //loadUrl("http://demo.guru99.com/telecom/");
	    Hooks.driver.get("http://demo.guru99.com/telecom/");
	    AddCustmer c = new AddCustmer();
	    btnClick(c.getAddCust());
	    //Hooks.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The user provide valid details")
	public void the_user_provide_valid_details() {
		System.out.println("----when-----");
		AddCustmer custmer = new AddCustmer();
		btnClick(custmer.getRadioDone());
		type(custmer.getFirstName(), "Bharath");
		type(custmer.getLastNmae(), "Kumar");
		type(custmer.getEmail(), "koyi.bharath@gmail.com");
		type(custmer.getAddress(), "Chennai");
		type(custmer.getPhNumber(), "7013635423");
		btnClick(custmer.getBtn());
		
	}

	@Then("The user validate customer id is generated")
	public void the_user_validate_customer_id_is_generated() {
		System.out.println("-----Then-----");
		
		AddCustmer cd = new AddCustmer();
	    
		Assert.assertTrue(txtDisplay(cd.gettxt()));
	}

}
