package automationPractice;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {

	public static void main(String[] args) throws ParseException {
	//	WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
	///	driver.manage().window().maximize();
	//	driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	//	WebElement ele = driver.findElement(By.cssSelector("input#first_date_picker"));
	//	ele.click();
		String targetdate= "23-jan-2022";
		SimpleDateFormat targetdateformate= new SimpleDateFormat("dd-mm-yyyy");
		Date formattargetdate=targetdateformate.parse(targetdate);
		
				

	}

}
