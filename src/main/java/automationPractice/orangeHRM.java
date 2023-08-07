package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRM {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement usrnme = driver.findElement(By.cssSelector("[name='username']"));
		usrnme.sendKeys("Admin");

		WebElement psswrd = driver.findElement(By.cssSelector("[name='password']"));
		psswrd.sendKeys("admin123");
		WebElement btn = driver.findElement(By.cssSelector("[type='submit']"));
		btn.click();

		Assert.assertTrue(driver
				.findElement(By.cssSelector("[class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"))
				.isDisplayed());

	}
}
