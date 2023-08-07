package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium4newlookcreateaccount {
	
	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.newlook.com/row/register");
		driver.manage().window().maximize();
WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
           Email.sendKeys("monu08@gmail.com");
           Thread.sleep(1500);
WebElement	password=driver.findElement(By.xpath("//input[@id='pwd']"));
            password.sendKeys("monu12345");
            Thread.sleep(1500);
WebElement  dropdown=driver.findElement(By.xpath("//select[@id='titleCode']"));
            Select s= new Select(dropdown);
            s.selectByVisibleText("Mrs.");
            
WebElement	frstname=driver.findElement(By.xpath("//input[@id='firstName']"));
            frstname.sendKeys("monu");
            Thread.sleep(1500);
WebElement	lstname=driver.findElement(By.xpath("//input[@id='lastName']"));
            lstname.sendKeys("puranve");
            Thread.sleep(1500);
WebElement	Ageconfirm=driver.findElement(By.xpath("//input[@id='ageConfirmation']"));
            JavascriptExecutor js= (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click(0)", Ageconfirm);
WebElement	createdbutton=driver.findElement(By.xpath("//button[@class='button button--primary button--full-width button-green button--mouse-up']"));
            js.executeScript("arguments[0].click0()", createdbutton);
	}

}
