package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.myntra.com/");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebElement ele = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products, brands and more')]"));
	  ele.sendKeys("Dress");
	  Thread.sleep(3000);
	  
	  driver.findElements(By.)
	  

	}

}
