package data.driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws IOException, InterruptedException {
	Properties p=new Properties();
	FileInputStream f1=new FileInputStream("./data2.properties");
	p.load(f1);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(p.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
	driver.findElement(By.id("password")).sendKeys(p.getProperty("password"));
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys(p.getProperty("mobileno"));
	Thread.sleep(3000);
	driver.close();
	}

}
