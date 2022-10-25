package com.obsqura.Assignments;

public class NavigateMain extends NavigateBase {
	public void navigateToNext(){
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}
	

	public static void main(String[] args){
		NavigateMain obj=new NavigateMain();
		obj.naviagateCommands();
		obj.navigateToNext();

	}

}
