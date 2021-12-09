package NavagationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{ WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.in/b?node=14605651031");
	//back
	driver.navigate().back();
	//forward
	driver.navigate().forward();
	//refresh
	driver.navigate().refresh();
	//close
	driver.close();
	
}

}
