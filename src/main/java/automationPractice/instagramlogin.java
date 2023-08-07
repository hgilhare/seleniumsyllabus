package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class instagramlogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
	WebElement	usrnm=driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']"));
		
		usrnm.sendKeys("himanshu_gilhare");
		
		WebElement	pwd=driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pwd.sendKeys("Himanshu@1999");
		
		WebElement	sve=driver.findElement(By.xpath("//div[@class='_aahg']"));
		sve.click();
	WebElement loginbutton=driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
  
	loginbutton.click();
	
	}

}
