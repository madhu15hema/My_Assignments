package Week2.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectStatements {


	public static void main(String[] args) throws InterruptedException {
		

        EdgeDriver driver= new EdgeDriver();
        
        //to max screen
        
        driver.manage().window().maximize();
        
       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        driver.findElement(By.linkText("Leads")).click();
        
        driver.findElement(By.linkText("Create Lead")).click();
        
     
       
       Select s1=new Select(driver.findElement(By.id("createLeadForm_industryEnumId")));
       s1.selectByVisibleText("Computer Software");
       
       Thread.sleep(2000);
       Select s2= new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
       s2.selectByIndex(3);
       
       Thread.sleep(2000);
       Select s3= new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
       s3.selectByValue("AZ");
       
       
        
        
        
        
		


		
	}

}
