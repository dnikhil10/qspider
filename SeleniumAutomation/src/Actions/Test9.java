package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement ele = driver.findElement(By.id("course"));
	
	Actions a1=new Actions(driver);
	a1.moveToElement(ele).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
	
	WebElement ele1 = driver.findElement(By.id("add"));
	a1.doubleClick(ele1).perform();
	}
}
