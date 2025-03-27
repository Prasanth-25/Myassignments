package week2.day2;

import org.apache.xmlbeans.GDuration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Checkboxes {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://leafground.com/checkbox.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //driver.findElement(By.xpath("//input[@id = 'j_idt87:j_idt89_input']")).click();

    }
}
