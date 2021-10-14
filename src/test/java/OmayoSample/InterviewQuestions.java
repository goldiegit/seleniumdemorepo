package OmayoSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewQuestions {
	WebDriver driver;
	
	@Test(priority=2)
	public void DriverMaximize()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
			
		
	}
	
	@Test(priority=1)
	public void FetchCurrentURL()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println(currentURL);
		
	}

}
