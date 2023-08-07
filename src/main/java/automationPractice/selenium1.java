package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium1 {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup(); ///version
	
		WebDriver driver= new ChromeDriver(); ////chrome launch
		
		
	driver.get("https://ww4.mkvcinemas.lat/"); /////url
		
	driver.manage().window().maximize(); ///maximize
	driver.manage().window().minimize(); ///minimize
	
	}
}
