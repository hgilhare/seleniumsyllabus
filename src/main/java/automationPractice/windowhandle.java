package automationPractice;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement nwbtn = driver.findElement(By.cssSelector("button#newTabBtn"));
		nwbtn.click();
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		Set<String> allwindow = driver.getWindowHandles();
		for (String s : allwindow) {
			if (!parentid.equals(s)) {
				driver.switchTo().window(s);
			}
		}
		WebElement alrtbx = driver.findElement(By.cssSelector("button#promptBox"));
		alrtbx.click();
		Alert a = driver.switchTo().alert();

		a.sendKeys("Himanshu");

		a.accept();
		
	}

}
