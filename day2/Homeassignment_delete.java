import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.lt.Ir.Irs;

public class Homeassignment_delete {

public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        driver.findElement(By.linkText("Leads")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.linkText("Find Leads")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("phoneCountryCode")).clear();
     
        driver.findElement(By.name("phoneNumber")).sendKeys("8148814022");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//        String s = driver.findElement(By.xpath("//a[contains(text(),'15824')]")).getText();
//        System.out.println("s");
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[text()='15824']")).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[text()='Delete']")).click();
        Thread.sleep(1000);
        WebElement firstResultingLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        String leadID = firstResultingLead.getText();
        firstResultingLead.click();
//        String text = driver.findElement(By.xpath("//a[contains(text(),'15824')]")).getText();
    System.out.println(leadID);
	    
//    driver.findElement(By.xpath("//a[contains(text(),'15824')]")).click();
    
    driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	    
    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String actualMessage=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(actualMessage);
	    
        
        
}
}
