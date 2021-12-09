package Locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) 
{
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.facebook.com/login.php");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  driver.findElement(By.linkText("Forgotten account?")).click();
  driver.findElement(By.id("identify_email")).sendKeys("8971008303");
  driver.findElement(By.id("did_submit")).click();
  driver.findElement(By.name("go_back")).click();
}
}
