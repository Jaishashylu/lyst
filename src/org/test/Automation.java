package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shylu\\eclipse-workspace\\Auto\\driver\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtFirstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFirstName.sendKeys("JAISHA");
		
		WebElement txtLastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("SHYLU");
	
		WebElement txtAddress=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtAddress.sendKeys("6/36,anbium 9,simoncolony");
		
		WebElement txtEmail=driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("shylujaisha@gmail.com");
		
//		WebElement txtNum=driver.findElement(By.xpath("//"))
		
	System.out.println("siva");
	}

} 
