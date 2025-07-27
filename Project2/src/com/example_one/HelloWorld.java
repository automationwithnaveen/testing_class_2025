package com.example_one;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class HelloWorld 
{
	 public static void main(String[] args)
	 {
	        WebDriver driver = new FirefoxDriver();

	        driver.get("https://www.google.com/");

	        //driver.quit();
	 }
}
