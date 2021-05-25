package com.qa.MyPerfectBuy;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;

public class RegistrationPage extends TestBase {

	void RegistrationPageSetup() {
		driver.findElement(By.xpath("//nav[@aria-label='Desktop navigation']//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Create account']")).click();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();	
	}
	
	@Test
	public void RegistrationOpenTest() throws InterruptedException {
		RegistrationPageSetup();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void CheckRegistrationWithValidValuesTest() throws InterruptedException {
		RegistrationPageSetup();
		driver.findElement(By.xpath("//input[@id='register_first_name']")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath("//input[@id='register_last_name']")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath("//input[@id='register_email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@id='register_password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void CheckRegistrationWithoutValuesTest() throws InterruptedException {
		RegistrationPageSetup();
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void CheckRegistrationSignInOpenTest() throws InterruptedException {
		RegistrationPageSetup();
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
