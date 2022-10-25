package com.obsqura.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBase {
	public WebDriver driver;
	public WebDriver naviagateCommands() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Assignments\\src\\main\\java\\Resourse\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		driver.manage().window().maximize();
		return driver;
		
	}

}
