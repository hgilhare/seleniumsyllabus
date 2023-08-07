package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicc1 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		WebElement frstnme=driver.findElement(By.cssSelector("input#firstName"));
		frstnme.sendKeys("himanshu");
		WebElement lstnme=driver.findElement(By.cssSelector("input#lastName"));
		lstnme.sendKeys("gilhare");
		
		WebElement malebtn=driver.findElement(By.cssSelector("input#malerb"));
		malebtn.click();
		
		WebElement engbtn=driver.findElement(By.cssSelector("input#englishchbx"));
		engbtn.click();
		
		WebElement eml=driver.findElement(By.cssSelector("input#email"));
		eml.sendKeys("himanshugilhare@gmail.com");
	
		WebElement pswrd=driver.findElement(By.cssSelector("input#password"));
		pswrd.sendKeys("abcdef");
		
		WebElement regbtn=driver.findElement(By.cssSelector("button#registerbtn"));
		
		regbtn.click();
	///	driver.findElement(By.cssSelector("label#msg")).isDisplayed() 
		
	
	}

}
