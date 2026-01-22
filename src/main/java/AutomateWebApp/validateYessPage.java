package AutomateWebApp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class validateYessPage {

//	package = collection of classes
//	class = colletion of data members and member function 
	
	int i =20;
	
//	int - datatype , i = variable, = assignment operator, 20 = value

//	member function = it is logical block define once and use to run multiple time
public void addtion() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}

public void multiplication() {
	
}

// main method = it is program execution point  used to run our program
@Test
public  void validateAboutPage() throws InterruptedException {
	WebDriver driver = new EdgeDriver();
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
	
	driver.close();
	
}



}
