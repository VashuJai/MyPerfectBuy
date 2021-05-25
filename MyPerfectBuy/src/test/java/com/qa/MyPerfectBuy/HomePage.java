package com.qa.MyPerfectBuy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;

public class HomePage extends TestBase {

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();	
	}
	
	@Test(priority=1)
	public void CheckHomePageLogoTest() throws InterruptedException {	
		System.out.println("1st Case");
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='myperfectbuy']")).isDisplayed());
	}
	
	@Test(priority=2)
	public void CheckHomePageTitleTest() throws InterruptedException {	
		System.out.println("2nd Case");
		String ExpectedTitle="Buy Furniture, Grocery, Toys, Fitness tools, Beauty Products Online — myperfectbuy";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle, "Title not matched");
	}
	
	@Test(priority=3)
	public void CheckCartOpenTest() {	
		System.out.println("3rd Case");
		driver.findElement(By.xpath("//a[@class='site-header-cart--button']//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")).click();
	}
	
	@Test(priority=4)
	public void CheckBannerVisibility() {	
		System.out.println("4rd Case");
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'slideshow-slide slideshow-height-original is-selected')]")).isDisplayed());
	}
	/*
	@Test(priority=5)
	public void CheckAutomotiveAndIndrustialOpenTest() throws InterruptedException {	
		System.out.println("5th Case");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='navmenu-link navmenu-link-parent navmenu-link--active navmenu-item-active navmenu-active']")).click();
	}
	
	@Test(priority=6)
	public void CheckToysAndGamesOpenTest() throws InterruptedException {	
		System.out.println("6th Case");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='navmenu-link navmenu-link-parent navmenu-link--active navmenu-item-active navmenu-active']")).click();
	}
	
	@Test(priority=7)
	public void CheckBuetyAndPersonalCareOpenTest() {
		System.out.println("7th Case");
		driver.findElement(By.xpath("//a[@class='navmenu-link navmenu-link-parent navmenu-link--active navmenu-item-active navmenu-active']")).click();
	}
	
	@Test(priority=8)
	public void CheckSportAndFitnessOpenTest() {	
		System.out.println("8th Case");
		driver.findElement(By.xpath("//a[@class='navmenu-link navmenu-link-parent navmenu-link--active navmenu-item-active']")).click();
	}
	
	@Test(priority=9)
	public void CheckHomeAndKitchenOpenTest() {	
		System.out.println("9th Case");
		driver.findElement(By.xpath("//a[@class='navmenu-link navmenu-link-parent navmenu-link--active navmenu-item-active navmenu-active']")).click();
	}
	
	@Test(priority=10)
	public void CheckGroceryAndGourmentFoodOpenTest() {	
		System.out.println("10th Case");
		driver.findElement(By.xpath("//a[@class='navmenu-link navmenu-link-parent navmenu-item-active']")).click();
	}
	
	@Test(priority=11)
	public void CheckBabyAndBabyCareOpenTest() {	
		System.out.println("11th Case");
		driver.findElement(By.xpath("//a[@class='navmenu-link navmenu-link-parent navmenu-link--active navmenu-item-active navmenu-active']")).click();
	}
	
	@Test(priority=12)
	public void CheckMedicalSuppliesOpenTest() {
		System.out.println("12th Case");
		driver.findElement(By.xpath("//a[@class='navmenu-link navmenu-link-parent navmenu-item-active']")).click();
	} */
	
	@Test(priority=13)
	public void CheckLoginOpenTest() {	
		System.out.println("13th Case");
		driver.findElement(By.xpath("//nav[@aria-label='Desktop navigation']//a[normalize-space()='Login']")).click();
	}
	
	@Test(priority=14)
	public void CheckBlazingNeedlesBannerOpenTest() {	
		System.out.println("14th Case");
		driver.findElement(By.xpath("//div[@id='shopify-section-home-promo-grid']//article[1]//a[1]")).click();
	}
	
	@Test(priority=15)
	public void CheckLessThan15$BannerOpenTest() {	
		System.out.println("15th Case");
		driver.findElement(By.xpath("//div[@id='shopify-section-home-promo-grid']//article[1]//a[1]")).click();
	}
	
	@Test(priority=16)
	public void CheckTuneOfUrLifeOpenTest() {	
		System.out.println("16th Case");
		driver.findElement(By.xpath("//div[@id='shopify-section-home-promo-grid']//article[3]//a[1]")).click();
	}
	
	@Test(priority=17)
	public void CheckPetAccessoriesOpenTest() {	
		System.out.println("17th Case");
		driver.findElement(By.xpath("//a[contains(@href,'/collections/best-pet-accessories')]")).click();
	}
	
	@Test(priority=18)
	public void CheckFlashFurnitureBrandTest() {	
		System.out.println("18th Case");
		driver.findElement(By.xpath("//a[@href='https://myperfectbuy.com/collections/flash-furniture']//img[@class='logolist--image']")).click();
	}
	
	@Test(priority=19)
	public void CheckOutStandingPerformanceTest() {	
		System.out.println("19th Case");
		driver.findElement(By.xpath("//a[contains(@href,'/collections/vizari')]")).click();
	}
	
	@Test(priority=20)
	public void CheckProductOpenTest() throws InterruptedException {	
		System.out.println("20th Case");
		driver.findElement(By.xpath("//img[contains(@alt,'First Aid Beauty Facial Radiance Polish 1 oz')]")).click();
		Thread.sleep(1000);
	}
	
	
	@Test(priority=21)
	public void CheckProductAddtoCartTest() throws InterruptedException {	
		System.out.println("21th Case");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Solar Power Circuit']"))).build().perform();
		driver.findElement(By.xpath("//article[@class='productgrid--item imagestyle--small productitem--emphasis visible']"
				+ "//span[@class='atc-button--text'][normalize-space()='Add to cart']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=22)
	public void CheckProductQuickShopTest() throws InterruptedException {	
		System.out.println("22th Case");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Solar Power Circuit']"))).build().perform();
		driver.findElement(By.xpath("//article[@class='productgrid--item imagestyle--small productitem--emphasis visible']"
				+ "//button[@type='button'][normalize-space()='Quick shop']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=23)
	public void CheckProductQuickShopBuyItNowTest() throws InterruptedException {	
		System.out.println("23th Case");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Solar Power Circuit']"))).build().perform();
		driver.findElement(By.xpath("//article[@class='productgrid--item imagestyle--small productitem--emphasis visible']"
				+ "//button[@type='button'][normalize-space()='Quick shop']")).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Buy it now']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=23)
	public void CheckProductQuickShopAddToCartTest() throws InterruptedException {	
		System.out.println("23th Case");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Solar Power Circuit']"))).build().perform();
		driver.findElement(By.xpath("//article[@class='productgrid--item imagestyle--small productitem--emphasis visible']"
				+ "//button[@type='button'][normalize-space()='Quick shop']")).click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'product-form--atc-button')]")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
}
