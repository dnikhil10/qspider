package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test7 {

	public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);

	driver.manage().window().maximize();
	driver.get("https://www.quikr.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
