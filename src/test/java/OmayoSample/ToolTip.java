package OmayoSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	@Test
	public void CaptureToolTipText() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/tooltip/");

		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		WebElement inputbox = driver.findElement(By.id("age"));

		String toolTipText = inputbox.getAttribute("title");
		
		System.out.println("hello world ");

		Assert.assertEquals(toolTipText, "We ask for your age only for statistical purposes.");

	}

}
