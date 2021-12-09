package autosuggestion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
    
    Select s=new Select(dropdown);
    s.selectByIndex(1);
    Thread.sleep(3000);
    driver.close();

	}

}
