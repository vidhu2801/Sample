package org.greens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {

	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhy\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver (1).exe");
		
		WebDriver grn = new ChromeDriver();
		
		grn.get("http://www.greenstechnologys.com/");
		
		WebElement btnEnter = grn.findElement(By.xpath("//a[@href='contact.php']"));
		   btnEnter.click();
		   
		 //input[@placeholder='Name']

		   WebElement txtBox1 = grn.findElement(By.xpath(" //input[@placeholder='Name']"));
		   txtBox1.sendKeys("vidhya");   
		   
		
		
		   WebElement txtBox5 = grn.findElement(By.xpath(" //input[@id='InputEmail1']"));
		   txtBox5.sendKeys("vidhu@gmail.com");   
		
		   WebElement txtBox2 = grn.findElement(By.xpath(" //input[@id='InputSubject']"));
		   txtBox2.sendKeys("9865894565");    
		   
		 //select[@name='courses']
		   WebElement txtBox3 = grn.findElement(By.xpath(" //select[@name='courses'] "));
		   txtBox3.sendKeys("core java");     
		   
		 //select[@name='branch']
		   WebElement btnBox4 = grn.findElement(By.xpath(" //select[@name='branch']"));
		   btnBox4.click();
		 //select[@name='time']
		   
		   WebElement txtBox4 = grn.findElement(By.xpath(" //select[@name='time']"));
		   txtBox4.sendKeys("2.00");   
		   
		 //textarea[@class='form-control input-message']
		   
		   WebElement txtBox7 = grn.findElement(By.xpath(" //textarea[@class='form-control input-message']"));
		   txtBox7.sendKeys("GREAT COACHING"); 
		   
		 //button[@id='submit']
		   
		   WebElement btnBox2 = grn.findElement(By.xpath(" //button[@id='submit']" ));
		   btnBox2.click();
		   
		   
	}   
	
}
