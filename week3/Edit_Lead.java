import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Edit_Lead {

	public static void main(String[] args) throws InterruptedException {
	
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
     
     driver.findElement(By.id("password")).sendKeys("crmsfa");
     
     driver.findElement(By.className("decorativeSubmit")).click();
     
     driver.findElement(By.linkText("CRM/SFA")).click();
     
     driver.findElement(By.linkText("Leads")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
     
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Iopex Technologies");
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemamalini");
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ganesan");
     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemamalinimahadev1523@gmail.com");
     driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8148814022");
     driver.findElement(By.name("submitButton")).click();
	
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		

	}

}
