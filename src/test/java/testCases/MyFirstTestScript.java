package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zoho.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("dashuchoudhari@gmail.com");
		
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dashu2103");
		
		driver.findElement(By.xpath("//body/div[5]/div[2]/div[3]/div[2]/form[1]/button[1]/span[1]")).click();
		
		

	}

}
