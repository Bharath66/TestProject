package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.objectRepository.AddTariff;
import com.objectRepository.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariffPlan extends Base{
	@Given("The user should be telecom home page and click the tariff customer")
	public void the_user_should_be_telecom_home_page_and_click_the_tariff_customer() {
		System.out.println("Tariff ---Given");
	    Hooks.driver.get("http://demo.guru99.com/telecom/");
	    AddTariff at = new AddTariff();
	    btnClick(at.getTariffPlan());
	    //Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The user provide valid tariff details")
	public void the_user_provide_valid_tariff_details() {
		System.out.println("Tariff -----When");
		AddTariff a = new AddTariff();
		type(a.getmRental(), "400");
		type(a.getLocMint(), "200");
		type(a.getInterMint(), "150");
		type(a.getSmsPack(), "300");
		type(a.getLocMintCharge(), "2");
		type(a.getInterMintCharge(), "10");
		type(a.getSmsCharges(), "1");
	    
	}

	@Then("The user validate tariff id is generated")
	public void the_user_validate_tariff_id_is_generated() {
		System.out.println("Tariff ---Then");
	    AddTariff ad = new AddTariff();
	    Assert.assertTrue(txtDisplay(ad.gettxt()));
	}
}
