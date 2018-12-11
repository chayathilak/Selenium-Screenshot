package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class lTest1 {

	static ChromeDriver driver ;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriverchrome.driver", "driver\\Chromedriver.exe");		

		driver = new ChromeDriver();
		
		driver.get("https://www.findmyfare.com/account/register");
		
		driver.manage().window().maximize();
	
		takeScreenShot("Findmyfare");
		
		driver.get("https://login.salesforce.com/?locale=eu");
		
		takeScreenShot("Salesforce");
		
	}
	
	public static void takeScreenShot (String fileName) throws IOException {
		
		//Take screenshot and store in file format
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//copy file to the desired location using copy file method
		FileUtils.copyFile(file, new File("C:/Users/Gihan/Downloads/SeleniumDemo2-master/src/Screenshots/"+fileName+".jpg"));

	}
	

}
