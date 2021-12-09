package practice.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	String url = driver.getCurrentUrl();
    System.out.println(url);
    
    String title = driver.getTitle();
    System.out.println(title);
    
    Thread.sleep(3000);
    driver.close();
	}
}
