package com.alibaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alibabapages {
	
	WebDriver driver;
	
	
	
	public Alibabapages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText = "Sign In")
	WebElement Signinlink;

	public WebElement getSigninlink() {
		return Signinlink;
	}

	@FindBy(id = "fm-login-id")
	WebElement emailid;

	public WebElement getEmailid() {
		return emailid;
	}
	
	

	@FindBy(id = "fm-login-password")
	WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	

	@FindBy(id = "fm-keep-login")
	WebElement checkinbtn;

	public WebElement getCheckinbtn() {
		return checkinbtn;
	}
    
	@FindBy(id="fm-login-submit")
	WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;	
	}
	
	@FindBy(className = "ui-searchbar-keyword")
	WebElement searchbox;

	public WebElement getSearchbox() {
	
		return searchbox;
	}
	@FindBy(xpath = "/html/body/div[4]/div[1]/div/div[4]/div[2]/div/div/div/div[1]/div")
	
	WebElement searchitem;
	public WebElement getSearchitem() {
		return searchitem;
	}
	
	@FindBy(linkText = "My Alibaba")
	WebElement alibaba;
	
	public WebElement getAlibaba() {
		return alibaba;
	}

	
	@FindBy(linkText = "Sign Out")
	WebElement signout;


	public WebElement getSignout() {
		return signout;
	}

	
	


	
	
	
	
	

}
