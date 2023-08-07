package automationPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium3swaglab {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.edgedriver().setup();
		 WebDriver driver= new EdgeDriver();
		 
		 
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
WebElement 	username=driver.findElement(By.xpath("//input[@id='user-name']"));
            username.sendKeys("standard_user");
            WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(username));
WebElement	password=driver.findElement(By.xpath("//input[@id='password']"));
            password.sendKeys("secret_sauce");
		 
            
WebElement	button=driver.findElement(By.xpath("//input[@id='login-button']"));
           
            Thread.sleep(3000);
            button.click();
            
       
            
         	}

}
