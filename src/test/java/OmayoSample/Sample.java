package OmayoSample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	@Test
// Arrange, Act and Assert
	public void GetCurrentURL() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		Boolean displayed = driver.findElement(By.id("link1")).isDisplayed();

		System.out.println(displayed);;

		Assert.assertTrue(displayed);

		if (displayed) {

			driver.findElement(By.linkText("compendiumdev")).click();

			String currentURL = driver.getCurrentUrl();

			System.out.println(currentURL);
		}

	}

}
