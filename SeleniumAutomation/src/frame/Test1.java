package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.snapdeal.com/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    WebElement ele = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-user']"));
    
    Actions a1=new Actions(driver);
    a1.moveToElement(ele).perform();
    
    Thread.sleep(3000);
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
    
    
    driver.findElement(By.id("userName")).sendKeys("8971008303");
    Thread.sleep(3000);
    driver.close();
	}

}
