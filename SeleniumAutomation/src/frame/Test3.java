package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.ebay.com/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    WebElement ele = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
    Actions a1=new Actions(driver);
    a1.moveToElement(ele).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//body[@class='desktop gh-1199 gh-flex']")).click();
    //driver.close();
	}

}
