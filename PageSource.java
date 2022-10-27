package com.obsqura.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {
	public WebDriver driver;
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Assignments\\src\\main\\java\\Resourse\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		return driver;
	}
	public void pageSourceGet() {
		if(driver.getPageSource().isEmpty()) {
		System.out.println("Page Source Is Not Found");
		}
		else {
			System.out.println("Page Source Is Found");
		}
		
		
	}
	public void browserClose() {
		driver.quit();
	}

}
