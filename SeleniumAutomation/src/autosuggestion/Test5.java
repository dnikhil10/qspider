package autosuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.findElement(By.linkText("Sign up")).click();

	}

}
