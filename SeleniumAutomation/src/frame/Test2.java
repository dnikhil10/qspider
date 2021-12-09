package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.makemytrip.com/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    WebElement ele = driver.findElement(By.xpath("(//span[@class='false chNavText darkGreyText'])[3]"));
    
    Actions a1=new Actions(driver);
    a1.moveToElement(ele).perform();
    Thread.sleep(3000);
    driver.close();
    
    
	}

}
