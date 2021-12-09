package autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.youtube.com/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    Thread.sleep(3000);
    WebElement ele = driver.findElement(By.id("search"));
    ele.sendKeys("indiatoday");
    
    //List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
    //System.out.println(ele1.size());
    
    driver.close();
	}

}
