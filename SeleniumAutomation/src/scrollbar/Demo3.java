package scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demoapp.skillrary.com/login.php?type=login");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollBy(0,5000)");
	     Thread.sleep(3000);
	     js.executeScript("window.scrollBy(0,-5000)");
	     driver.close();

	}

	
}
