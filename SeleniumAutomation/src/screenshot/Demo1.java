package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.com/");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     TakesScreenshot ts=(TakesScreenshot)driver;
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     File dest=new File("./Photo/amazon.png");
	     FileUtils.copyFile(src, dest);
	     driver.close();
	}

	
}
