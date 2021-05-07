package com.alibaba;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {

	WebDriver driver;

	Alibabapages alibaba;
	Actions action;

	@BeforeClass
	@Parameters({ "Url" })
	public void setUp(String Url) {
		System.setProperty("webdriver.chrome.driver", "F:\\virtusa softwares\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
		alibaba = new Alibabapages(driver);
		driver.get(Url);

	}
	/*
	 * @AfterClass public void tearDown() { driver.close(); }
	 */

}
