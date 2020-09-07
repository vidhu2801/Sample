package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver (1).exe");
		
		WebDriver dem = new ChromeDriver();
		
		dem.get("https://demoqa.com/automation-practice-form");
		
		WebElement txtUserName = dem.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtUserName.sendKeys("vidhya");
		
		WebElement txtLastName = dem.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("subramaniam");
		
		
		WebElement txtMail = dem.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		txtMail.sendKeys("vidhuchml@gmail.com");
		
		WebElement btnbox = dem.findElement(By.xpath("//label[@ for ='gender-radio-2']"));
		btnbox.click();
		
		WebElement txtPhn = dem.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		txtPhn.sendKeys("9865321457");
		
		
		WebElement btnEnter = dem.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	   btnEnter.click();
		
		WebElement btn = dem.findElement(By.xpath("//label[@  for ='hobbies-checkbox-3']"));
		btn.click();
		
		
		WebElement rdoBox = dem.findElement(By.xpath("//textarea[@class='form-control']"));
		rdoBox.sendKeys("Erode , Tamilnadu");
		
	}
}
