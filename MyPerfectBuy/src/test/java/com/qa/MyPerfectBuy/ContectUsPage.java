package com.qa.MyPerfectBuy;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;

public class ContectUsPage extends TestBase {

	void ContectUsPageSetup() {
		driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();	
	}
	
	@Test(priority=1)
	public void CheckContectUsWithValidValuesTest() throws InterruptedException {
		ContectUsPageSetup();
		driver.findElement(By.xpath("//input[@id='contact_name']")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath("//input[@id='contact_email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys(prop.getProperty("number"));
		driver.findElement(By.xpath("//textarea[@id='contact_message']")).sendKeys(prop.getProperty("message"));
		driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void CheckContectUsWithNoValuesTest() throws InterruptedException {
		ContectUsPageSetup();
		driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
		Thread.sleep(2000);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
