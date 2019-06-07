package jenkinseltest;

//import junit.framework.Test;

import org.testng.annotations.Test;
//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRep {
	
@Test
public void disp() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chravitejareddy\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.get("https://i3ljoin.itcinfotech.com/owa/");
	//driver.findElement(By.name("name")).clear();
	//driver.findElement(By.name("name")).click(); // Keep this click statement even if you are using click before clear.
	driver.findElement(By.name("username")).sendKeys("itcinfotech\\30143");
	driver.findElement(By.name("password")).sendKeys("Tej@485!@#");
	driver.findElement(By.xpath(".//div[@onclick='clkLgn()'] ")).click();
	

}
}

