package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) 
	{ 
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
	
	driver.findElement(By.name("username")).sendKeys("dnikhil10");
	driver.findElement(By.name("username")).sendKeys("8971008303n")

	}

}
