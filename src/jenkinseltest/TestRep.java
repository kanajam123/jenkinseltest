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
	driver.findElement(By.name("username")).sendKeys("itcinfotech\\5614");
	driver.findElement(By.name("password")).sendKeys("one@12345");
	driver.findElement(By.xpath(".//div[@onclick='clkLgn()'] ")).click();
	
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	Thread.sleep(300);
	File DestFile = new File("C:\\Users\\chravitejareddy\\Documents\\images\\image.png");
	FileUtils.copyFile(SrcFile, DestFile);
	driver.findElement(By.xpath(".//div[@onclick='clkLgn()'] ")).click();
	
	TakesScreenshot scrShot1 =((TakesScreenshot)driver);
	File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
	Thread.sleep(300);
	File DestFile1 = new File("C:\\Users\\chravitejareddy\\Documents\\images\\image1.png");
	FileUtils.copyFile(SrcFile1, DestFile1);

}
}
