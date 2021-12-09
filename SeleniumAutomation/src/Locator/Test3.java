package Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.myntra.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  //driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products, brands and more')]")).sendKeys("Mens jeans");
	driver.findElement(By.xpath("//source[@type='image/webp']")).click();
	}
}
