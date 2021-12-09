package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
    public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit,SECONDS);
	
    
	}

}
