package com.dj.downloadfile;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFile {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\My Data\\Selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		//Find the element
		
		//driver.findElement(By.id("cee_closeBtn")).click();
		
		//Click to enter
		/*
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		//click on download free java software
		
		driver.findElement(By.linkText("Download Free Java Software")).click();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']/a/span")).click();*/
		
	}
	

}
