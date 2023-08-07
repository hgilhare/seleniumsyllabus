package automationPractice;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class actionevent {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		Actions a=new Actions(driver);
		
		WebElement srch = driver.findElement(By.cssSelector("[aria-label='Search']"));
		srch.click();
		WebElement type = driver.findElement(By.cssSelector("[type='Search']"));
		type.sendKeys("himanshu");
		a.sendKeys(Keys.ENTER);
		
	}

}
