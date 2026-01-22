package AutomateWebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ValidateAboutPage {
	@Test
	public  void validateHomePage() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yessinfotech.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		driver.findElement(By.linkText("About Us")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("About Us | yes")) {
			System.out.println("page validation done");
		}else
		{
			System.out.println("page not landing to the about us page");
		}
		
		driver.findElement(By.linkText("Home")).click();
		
		
		String homeTitle = driver.getTitle();
		
		if(homeTitle.equals("Software training classes institute in Hadapsar Pune")) {
		System.out.println("successfully validated homepage");	
		}else {
			System.out.println("please check homePage it is not matching with expectation");
		}
		
		driver.close();
	}

}
