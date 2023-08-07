package automationPractice;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindowhandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement btn = driver.findElement(By.cssSelector("button#newTabsBtn"));
		btn.click();
		String parentid = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String s : allwindows) {
			if (!parentid.equals(s)) {
				driver.switchTo().window(s);
				String title = driver.getTitle();
				if (title.contains("AlertsDemo")) {
					WebElement alrtbx = driver.findElement(By.cssSelector("button#alertBox"));
					alrtbx.click();
					Alert a = driver.switchTo().alert();
					a.accept();
					driver.close();
					break;

				}
			}

		}

	}
}
