package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Fb {

		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver (1).exe");
			
			WebDriver red = new ChromeDriver();
			
			red.get("https://www.redbus.in/");
			
			WebElement btnEnter = red.findElement(By.xpath("//i[@id='i-icon-profile']"));
			   btnEnter.click();
			
			
			   WebElement btnBox = red.findElement(By.xpath("//li[@ id='signInLink']"));
			   btnBox.click();
			
			  
			   WebElement btnBox1 = red.findElement(By.xpath("//div[@id='safetyplusClick']"));
			   btnBox1.click();
			
	
			   WebElement txtBox1 = red.findElement(By.xpath("//input[@id='mobileNoInp'] "));
			   txtBox1.sendKeys("9865321478");
			   
			   red.quit();
			   
		
		}
		
		
		
		
		
}
