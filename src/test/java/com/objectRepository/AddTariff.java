package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefination.Hooks;

public class AddTariff {
	public AddTariff() {
		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement TariffPlan;
	@FindBy(id="rental1")
	private WebElement mRental;
	@FindBy(id="local_minutes")
	private WebElement locMint;
	@FindBy(id="inter_minutes")
	private WebElement interMint;
	@FindBy(id="sms_pack")
	private WebElement smsPack;
	@FindBy(id="minutes_charges")
	private WebElement locMintCharge;
	@FindBy(id="inter_charges")
	private WebElement interMintCharge;
	@FindBy(id="sms_charges")
	private WebElement smsCharges;
	@FindBy(xpath="//a[text()='Guru99 telecom']")
	private WebElement txt;
	
	public WebElement gettxt() {
		return txt;
	}
	
	public WebElement getTariffPlan() {
		return TariffPlan;
	}
	public WebElement getmRental() {
		return mRental;
	}
	public WebElement getLocMint() {
		return locMint;
	}
	public WebElement getInterMint() {
		return interMint;
	}
	public WebElement getSmsPack() {
		return smsPack;
	}
	public WebElement getLocMintCharge() {
		return locMintCharge;
	}
	public WebElement getInterMintCharge() {
		return interMintCharge;
	}
	public WebElement getSmsCharges() {
		return smsCharges;
	}


}
