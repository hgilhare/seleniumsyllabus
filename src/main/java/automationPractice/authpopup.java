package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class authpopup {

	public static void main(String[] args) {
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--remote-allow-origin=*");
		c.addArguments("--incognito");
		WebDriver driver= new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	
}
