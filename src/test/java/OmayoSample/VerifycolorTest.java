package OmayoSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifycolorTest {
WebDriver driver;
	@Test
	public void VerifyTheColorOfTheElement() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("http://tutorialsninja.com/demo/");

		driver.manage().window().maximize();

		String colorOfTheElement = driver
				.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"))
				.getCssValue("color");

		System.out.println(colorOfTheElement);
		
		Assert.assertEquals(colorOfTheElement, "rgba(255, 255, 255, 1)");

		driver.close();

	}
	
	@Test
	
	public void GetContactText()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.get("http://tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			String ActualText = driver.findElement(By.xpath("//*[text()='123456789']")).getText();
		
		System.out.println(ActualText);
		 
		 Assert.assertEquals(ActualText, 123456789);
		 
		 
		 
		 
		 
		 
		 
	}

}
