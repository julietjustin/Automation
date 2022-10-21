package com.obsqura.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroceryPageLogin {
	public WebDriver driver;
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Assignments\\src\\main\\java\\Resourse\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		return driver;
        }

	public static void main(String[] args) {
		GroceryPageLogin obj=new GroceryPageLogin();
		obj.openBrowser();

	}

}
