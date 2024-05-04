package week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdowns {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		WebElement industryDD=driver.findElement(By.name("industryEnumId"));
		Select sel= new Select(industryDD);
		sel.selectByIndex(3);
		WebElement ownershipDD=driver.findElement(By.name("ownershipEnumId"));
		Select selOwnership=new Select(ownershipDD);
		selOwnership.selectByVisibleText("S-Corporation");
		WebElement EmployeDD =driver.findElement(By.id("dataSourceId"));
		Select selSource=new Select(EmployeDD);
		selSource.selectByValue("LEAD_EMPLOYEE");
		WebElement CampaignDD=driver.findElement(By.id("marketingCampaignId"));
		Select selCampaign=new Select(CampaignDD);
		selCampaign.selectByIndex(6);
		WebElement StateProvinceDD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateProvice=new Select(StateProvinceDD);
		stateProvice.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		
		
		
		
		
	}

}
