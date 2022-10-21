package com.obsqura.Assignments;

public class BrowserCommands extends SiteLogin {
	String actualTitle,actualURL;
	public void basicCommands() {
		actualTitle=driver.getTitle();
		System.out.println(actualTitle);//To get Actual title
		actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);//to get actual URL
	}

	public static void main(String[] args) {
		BrowserCommands obj=new BrowserCommands();
		obj.openBrowser();
		obj.basicCommands();
		obj.browserClose();

	}

}
