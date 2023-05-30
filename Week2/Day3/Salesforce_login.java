package Week2.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Salesforce_login {

	public static void main(String[] args) {
		EdgeOptions ch = new EdgeOptions();
		ch.addArguments("--disable-notifications");
		EdgeDriver driver = new EdgeDriver(ch);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[contains(@id,'word')]")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@class=\"button r4 wide primary\"]")).click();
		
		driver.close();
		
		

	}




	}


