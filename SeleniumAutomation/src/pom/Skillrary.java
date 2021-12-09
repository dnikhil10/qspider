package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary 
{
 @FindBy(xpath="//a[text()='Login']" )
 private WebElement loginbt;
 
 @FindBy (id="email")
 private WebElement ustb;
 
 @FindBy (id="password")
 private WebElement pstb;

 public Skillrary(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void loginbutton()
 {
	 loginbt.click();
 }
 public void username(String us)
 {
	 ustb.sendKeys(us);
 }
 public void password(String pass)
 {
	 pstb.sendKeys(pass);
 }
}
