package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefination.Hooks;

public class Register extends Base{
	public Register() {
		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement accountBtn;
	@FindBy(id = "userAuthIframe")
	private WebElement frameName;
	@FindBy(xpath = "//a[text()=' Register']")
	private WebElement regist;
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement fName;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lName;
	@FindBy(xpath = "(//input[@placeholder='Email'])[1]")
	private WebElement mail;
	@FindBy(xpath = "(//input[@placeholder='Password'])[1]")
	private WebElement password;
	@FindBy(xpath = "//input[@placeholder='Repeat Password']")
	private WebElement rPassword;
	@FindBy(name = "gender")
	private WebElement dropDown;
	@FindBy(name = "newsletter")
	private WebElement check;
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement registAct;
	
	
	public WebElement getAccountBtn() {
		return accountBtn;
	}
	public WebElement getFrameName() {
		return frameName;
	}
	public WebElement getRegist() {
		return regist;
	}
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getrPassword() {
		return rPassword;
	}
	public WebElement getDropDown() {
		return dropDown;
	}
	public WebElement getCheck() {
		return check;
	}
	public WebElement getRegistAct() {
		return registAct;
	}

}
