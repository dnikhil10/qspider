package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("email"));
        if (ele.isDisplayed())
        {
        	System.out.println("pass:username is displayed");
        	ele.sendKeys("nikhil.doddawad");
        }
        else
        {
        	System.out.println("fail:username not displayed");
        }
        driver.close();
	}

}
