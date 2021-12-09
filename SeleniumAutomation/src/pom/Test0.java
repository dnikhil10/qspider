package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login.php");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    Facebook fb=new Facebook(driver);
    fb.username("nikhil.doddawad");
    fb.password("8971008303n");
    fb.login();
	}

}
