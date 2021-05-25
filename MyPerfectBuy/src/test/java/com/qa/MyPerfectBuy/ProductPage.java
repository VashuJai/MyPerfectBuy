package com.qa.MyPerfectBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;

public class ProductPage extends TestBase {

	void ProductPageSetup() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//a[normalize-space()='Solar Power Circuit']")).click();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();	
	}
	
	
	@Test(priority=1)
	public void CheckProductPageAddtoCartBtnTest() throws InterruptedException {
		ProductPageSetup();
		driver.findElement(By.xpath("//button[@type='submit']//span[@class='atc-button--text'][normalize-space()='Add to cart']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void CheckProductPageQtyDropDownTest() throws InterruptedException {
		ProductPageSetup();
		driver.findElement(By.xpath("//select[@aria-label='Quantity']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void CheckProductPageMainImgTest() throws InterruptedException {
		ProductPageSetup();
		Assert.assertTrue(driver.findElement(By.xpath("//img[@class='pixelzoom--image']")).isDisplayed());
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void CheckProdctPageRecommendation() throws InterruptedException {
		ProductPageSetup();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"div[class='ac-recommender-header ac-text-center']\")");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
