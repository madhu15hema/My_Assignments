package Week2.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Salesforceadvancedxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//div[@id='username_container']/input']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//input[@class=\"button r4 wide primary\"]")).click();
		
		driver.close();

	}

}
