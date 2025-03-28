package week2.day2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class EditLead {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("demosalesmanager");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
        driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
        driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("demomangar");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("mangar");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("1.0");
        driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("create new account");
        driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("computer science");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("demomanager1@gmail.com");
        WebElement create = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select stateProvince = new Select(create);
        stateProvince.selectByVisibleText("New York");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        driver.findElement(By.xpath("//a[text() ='Edit']")).click();
        driver.findElement(By.xpath("//textarea[text()='create new account']")).clear();
        driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Updated note");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        System.out.println(driver.getTitle());
        ChromeDriver driver1 = driver;
        driver1.quit();
        driver.close();

    }
}
