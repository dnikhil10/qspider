package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Skillrary sk=new Skillrary(driver);
	sk.loginbutton();
	sk.username("xyz");
	sk.password("wrftsy");
	
	}

}
