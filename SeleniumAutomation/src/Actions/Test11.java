package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com/");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     WebElement ele = driver.findElement(By.xpath("//a[text()='Login']"));
	     Actions a=new Actions(driver);
	     a.moveToElement(ele).perform();
	     Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8971008303");
	    driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("8971008303n");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}

}
