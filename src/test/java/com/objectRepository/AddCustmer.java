package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefination.Hooks;

public class AddCustmer {
	
	public AddCustmer() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCust;
	@FindBy(xpath="//label[@for='done']")
	private WebElement radioDone;
	@FindBy(id="fname")
	private WebElement firstName;
	@FindBy(id="lname")
	private WebElement lastNmae;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(name="addr")
	private WebElement address;
	@FindBy(name="telephoneno")
	private WebElement phNumber;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btn;
	@FindBy(xpath="//h1[text()='Access Details to Guru99 Telecom']")
	private WebElement txt;
	public WebElement gettxt() {
		return txt;
	}
	
	
	public WebElement getAddCust() {
		return addCust;
	}
	public WebElement getRadioDone() {
		return radioDone;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastNmae() {
		return lastNmae;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getPhNumber() {
		return phNumber;
	}
	public WebElement getBtn() {
		return btn;
	}

}


