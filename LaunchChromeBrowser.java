package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
public static void main(String[] args) {
	ChromeDriver drive=new ChromeDriver();
    drive.get("http://leaftaps.com/opentaps/control/main");
    drive.manage().window().maximize();
    
   drive.findElement(By.id("username")).sendKeys("DemoCsr");
   drive.findElement(By.id("password")).sendKeys("crmsfa");
   drive.findElement(By.className("decorativeSubmit")).click();
   drive.findElement(By.linkText("CRM/SFA")).click();
   drive.findElement(By.linkText("Leads")).click();
   drive.findElement(By.partialLinkText("Create")).click();
   drive.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
   drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Baskar");
   drive.findElement(By.id("createLeadForm_lastName")).sendKeys("Sedhupathi");
   drive.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Baskar");
   drive.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Sedhupathi");
   drive.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
   drive.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
   drive.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
   drive.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3Lakhs");
   drive.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("3");
   drive.findElement(By.id("createLeadForm_sicCode")).sendKeys("ABC123");
   drive.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
   drive.findElement(By.id("createLeadForm_description")).sendKeys("Fresher");
   drive.findElement(By.id("createLeadForm_importantNote")).sendKeys("Skilled Tester");
   drive.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
   drive.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0427");
   drive.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9080556404");
   drive.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("9080");
   drive.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Captain");
   drive.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bsedhupathi@gmail.com");
   drive.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.csk.com");
   drive.findElement(By.id("createLeadForm_generalToName")).sendKeys("Baskarasedhupathi");
   drive.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Bas");
   drive.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("34/789");
   drive.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Palavanthangal");
   drive.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
   drive.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600026");
   drive.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600");
   drive.findElement(By.className("smallSubmit")).click();   
      
}
}
