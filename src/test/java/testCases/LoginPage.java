package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTestClass;

public class LoginPage extends BaseTestClass{
	
	@Test
	public static void loginTest() throws InterruptedException {
		
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("dashuchoudhari@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dashu2103");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		Thread.sleep(2000);
		
	}

}
