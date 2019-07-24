package com.stepdefination;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.objectRepository.Base;
import com.objectRepository.NamashiLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginNamashi extends Base{
	
	@Given("The user should be namashi home page")
	public void the_user_should_be_namashi_home_page() {
		System.out.println("given--------");
		Hooks.driver.get("https://en-global.namshi.com");
		Hooks.driver.manage().window().maximize();
	    
	}

	@When("The user provide valid account details")
	public void the_user_provide_valid_account_details(io.cucumber.datatable.DataTable log) {
	    List<Map<String, String>> nl = log.asMaps(String.class, String.class);
	    System.out.println("when-------");
	    NamashiLogin l = new NamashiLogin();
	    btnClick(l.getAccount());
	    Set<String> all = Hooks.driver.getWindowHandles();
	    for (String k : all) {
			Hooks.driver.switchTo().window(k);
		}
	    Hooks.driver.switchTo().frame(l.getFrame());
	    type(l.getLoginUName(), nl.get(0).get("uname"));
	    type(l.getLoginPass(), nl.get(0).get("pwd"));
	    btnClick(l.getLogin());
	}

	@Then("The user login validate customer or not")
	public void the_user_login_validate_customer_or_not() {
	    System.out.println("then---------");
	    System.out.println("valid user login");
	}

}
