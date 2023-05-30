import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//form[@id='reg']//input[@name='firstname']")).sendKeys("Hemamalini");
	  driver.findElement(By.xpath("//i[@class='_5dbc img sp_98fCI7IVTTz sx_54513f']/following::input")).sendKeys("Ganesan");
	  Thread.sleep(1000);
     driver.findElement(By.xpath("//form[@name='reg']//input[@name='reg_email__']")).sendKeys("9941471750");
     Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@id='password_field']//input")).sendKeys("Malini@1523"); 
	   Thread.sleep(1000);
	   Select drpDate = new Select(driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[@id='day']")));
	   drpDate.selectByValue("26");
	   Select drpMonth= new Select(driver.findElement(By.xpath("//select[@id='month']")));
	   drpMonth.selectByIndex(4);
	   Select drpYear = new Select(driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[@id='year']")));
	   drpYear.selectByVisibleText("1994");
	   driver.findElement(By.xpath("//input[@name='sex']/preceding-sibling::label")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//img[@class='img']/preceding::button[1]")).click();
	   driver.close();

	
	  
	}

}


