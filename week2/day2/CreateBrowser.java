package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class CreateBrowser {
    public static void main(String[] args){
        ChromeDriver drop = new ChromeDriver();
        drop.get("http://leaftaps.com/opentaps/.  ");
        drop.manage().window().maximize();
        drop.findElement(By.id("username")).sendKeys("demosalesmanager");
        drop.findElement(By.id("password")).sendKeys("crmsfa");
        drop.findElement(By.className("decorativeSubmit")).click();
        drop.findElement(By.partialLinkText("CRM")).click();
        drop.findElement(By.linkText("Accounts")).click();
        drop.findElement(By.linkText("Create Account")).click();
        drop.findElement(By.id("accountName")).sendKeys("demosalesmanager1");
        drop.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        WebElement create = drop.findElement(By.name("industryEnumId"));
        Select sell=new Select(create);
        sell.selectByIndex(3);
        WebElement create2 = drop.findElement(By.name("ownershipEnumId"));
        Select sell1= new Select(create2);
        sell1.selectByVisibleText("S-Corporation");
        WebElement create3 = drop.findElement(By.id("marketingCampaignId"));
        Select sell2= new Select(create3);
        sell2.selectByValue("9000");
        WebElement create4 = drop.findElement(By.id("generalStateProvinceGeoId"));
        Select sell3= new Select(create4);
        sell3.selectByValue("TX");
        drop.findElement(By.linkText("Create Account")).click();
        drop.findElement(By.linkText("demosalesmanager1")).click();
        //print the account name
        String title = drop.findElement(By.xpath("//span[text()='demosalesmanager1  (11464)']")).getText();
        System.out.println(title);
        drop.close();
        drop.quit();


    }
}
