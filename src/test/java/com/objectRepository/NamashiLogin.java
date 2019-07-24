package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefination.Hooks;

public class NamashiLogin extends Base{
	public NamashiLogin() {
		PageFactory.initElements(Hooks.driver, this);
	}
	
	
	@FindBy(xpath ="//a[@title='My Account']")
	private WebElement account;
	@FindBy(xpath ="(//input[@placeholder='Email'])[2]")
	private WebElement loginUName;
	@FindBy(xpath ="(//input[@placeholder='Password'])[2]")
	private WebElement loginPass;
	@FindBy(id ="userAuthIframe")
	private WebElement frame;
	@FindBy(xpath ="//button[text()='Log in']")
	private WebElement login;
	
	
	
	public WebElement getAccount() {
		return account;
	}
	public WebElement getLoginUName() {
		return loginUName;
	}
	public WebElement getLoginPass() {
		return loginPass;
	}
	public WebElement getFrame() {
		return frame;
	}
	public WebElement getLogin() {
		return login;
	}
	


}
