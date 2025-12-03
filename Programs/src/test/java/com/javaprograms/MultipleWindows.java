package com.javaprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		String parent = driver.getWindowHandle();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.tagName("button")).click();
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!handle.equals(parent)) {
				driver.switchTo().window(handle);
				System.out.println("Child Window Title: " + driver.getTitle());
			}
		}
		driver.switchTo().window(parent);
	}

}
