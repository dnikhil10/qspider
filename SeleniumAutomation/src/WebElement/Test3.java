package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login.php");
	driver.manage().window().maximize();
	WebElement lgtb = driver.findElement(By.id("email"));
    Dimension s = lgtb.getSize();
    int height = s.getHeight();
    System.out.println(height);
    
    int width=s.getWidth();
    System.out.println(width);
    driver.close();
	}

}
