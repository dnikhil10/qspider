package data.driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws IOException {
	Properties p1=new Properties();
	FileInputStream fls=new FileInputStream("./data1.properties");
    p1.load(fls);
    
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(p1.getProperty("url"));
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys(p1.getProperty("searchtb"));
    driver.findElement(By.xpath("//li[text()='DressBerry']")).click();
	}

}
