package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
@Test(priority=-1)
public void run()
{
	Reporter.log("running",true);
}
@Test(priority=1,invocationCount=3)
public void walk()
{
	Reporter.log("walking",true);
}
@Test(enabled=false)
public void swim()
{
	Reporter.log("swiming",true);
}
}
