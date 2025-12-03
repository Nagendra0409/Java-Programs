package com.javaprograms;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link : links) {
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
	}

}
