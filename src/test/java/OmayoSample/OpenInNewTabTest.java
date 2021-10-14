package OmayoSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenInNewTabTest {

	@SuppressWarnings("deprecation")
	@Test
	public void NewTab() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// WebDriverWait wait=new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Checkout']/*[text()='Checkout']")));

		 String control = Keys.chord(Keys.CONTROL, Keys.RETURN);

		// System.out.println(tab);

		driver.findElement(By.xpath("//a[@title='Checkout']/*[text()='Checkout']")).sendKeys(control);

		//driver.findElement(By.xpath("//a[@title='Checkout']/*[text()='Checkout']")).click();

	}

}
