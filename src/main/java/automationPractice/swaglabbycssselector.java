package automationPractice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swaglabbycssselector {
	@Test
	public void validlogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement usrnme = driver.findElement(By.cssSelector("input#user-name"));
		usrnme.sendKeys("performance_glitch_user");
		WebElement pwd = driver.findElement(By.cssSelector("input#password"));
		pwd.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.cssSelector("input#login-button"));
		login.click();

		Assert.assertTrue(driver.findElement(By.cssSelector("span.title")).isDisplayed());

	}

}
