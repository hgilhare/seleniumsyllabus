package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframe {
 public static void main(String[] args) {
	
	 ChromeOptions c = new ChromeOptions();
	 c.addArguments("--remote-allow-origin=*");
	 c.addArguments("--incognito");
	 WebDriver driver= new ChromeDriver(c);
	 driver.manage().window().maximize();
	 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	 driver.switchTo().frame("packageFrame");
	 // or driver.switchto().frame(1);
	WebElement abc= driver.findElement(By.cssSelector("[target='classFrame']"));
	abc.click();
	
//	driver.switchTo().defaultContent(); form back to main frame then we can switch to another frame
}
}
