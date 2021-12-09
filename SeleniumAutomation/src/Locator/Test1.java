package Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.partialLinkText("Return to")).click();
	driver.close();
	
}
}
