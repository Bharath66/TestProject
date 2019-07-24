package com.stepdefination;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.objectRepository.Base;
import com.objectRepository.Register;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Namashi extends Base{
	
	@Given("The user should be namashi home page and click the account")
	public void the_user_should_be_namashi_home_page_and_click_the_account() {
		Hooks.driver.get("https://en-global.namshi.com");
		//loadUrl("https://en-global.namshi.com");
		Hooks.driver.manage().window().maximize();
		Register r = new Register();
		btnClick(r.getAccountBtn());
	}

	@When("The user provide valid registration details")
	public void the_user_provide_valid_registration_details(io.cucumber.datatable.DataTable reg) {
		List<Map<String, String>> onedmap= reg.asMaps(String.class, String.class);
		   System.out.println(onedmap);
		   Register nr = new Register();
		   System.out.println("When-1");
		   Set<String> allWindows = Hooks.driver.getWindowHandles();
			System.out.println(allWindows);
			for (String x : allWindows) {
				Hooks.driver.switchTo().window(x);
			}
			Hooks.driver.switchTo().frame(nr.getFrameName());
			btnClick(nr.getRegist());
			for (String v : allWindows) {
				Hooks.driver.switchTo().window(v);
			}
			Hooks.driver.switchTo().frame(nr.getFrameName());
			type(nr.getfName(), onedmap.get(0).get("fname"));
			type(nr.getlName(), onedmap.get(0).get("lname"));
			type(nr.getMail(), onedmap.get(0).get("mail"));
			type(nr.getPassword(), onedmap.get(0).get("password"));
			type(nr.getrPassword(), onedmap.get(0).get("repassword"));
			selectValue(nr.getDropDown(), onedmap.get(0).get("gender"));
			btnClick(nr.getCheck());
			
			
	}

	@Then("The user validate customer id is generated or not")
	public void the_user_validate_customer_id_is_generated_or_not() {
	  System.out.println("then-------");
	  Register nr = new Register();
	  btnClick(nr.getRegistAct());
	  System.out.println("Registration successfully");
	    
	}

}
