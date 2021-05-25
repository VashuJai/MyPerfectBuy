package com.qa.MyPerfectBuy;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;

public class LoginPage extends TestBase{

	void LoginPageSetup() {
		driver.findElement(By.xpath("//nav[@aria-label='Desktop navigation']//a[normalize-space()='Login']")).click();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();	
	}
	
	@Test(priority=1)
	public void CheckLoginPageWithValidValuesTest() throws InterruptedException {
		LoginPageSetup();
		driver.findElement(By.xpath("//input[@id='customer_email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@id='customer_password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void CheckLoginPageWithNoValuesTest() throws InterruptedException {
		LoginPageSetup();
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void CheckLoginPageForgotPasswordOpenTest() throws InterruptedException {
		LoginPageSetup();
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void CheckLoginPageForgotPasswordInvalidEmailTest() throws InterruptedException {
		LoginPageSetup();
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@id='customer_recovery_email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
