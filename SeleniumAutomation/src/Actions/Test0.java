package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {
     public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.myntra.com/");
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
     WebElement ele = driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
     
     Actions a1=new Actions(driver);
     a1.moveToElement(ele).perform();
     
     driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[1]")).click();
     
	}

}