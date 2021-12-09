package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=61665929249&hvpone=&hvptwo=&hvadid=486445347800&hvpos=&hvnetw=g&hvrand=7976117617008912747&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-298441375321&hydadcr=5621_2175698&gclid=EAIaIQobChMIoKrSqvyg9AIVVTErCh1nvgbdEAAYASAAEgKibPD_BwE");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	Point loc = ele.getLocation();
	int x = loc.getX();
	System.out.println("x coordinates="+x);
	
	int y = loc.getY();
	System.out.println(y);
	driver.close();
	}

}
