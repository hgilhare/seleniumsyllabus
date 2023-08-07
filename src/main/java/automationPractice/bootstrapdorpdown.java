package automationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootstrapdorpdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		WebElement drpdwnbtn = driver.findElement(By.cssSelector("button#menu1"));
		drpdwnbtn.click();
		List<WebElement> drpdwnlist = driver.findElements(By.cssSelector("ul.dropdown-menu li a"));

		for (WebElement ele : drpdwnlist) {
			String value = ele.getText();
			if (value.equals("JavaScript")) {
				ele.click();
				break;
			}
		}
	}

}
