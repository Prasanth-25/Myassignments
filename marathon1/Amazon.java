package marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Amazon {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        //to refresh the page
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("Bags for boys");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //Print the total number of results (like 50000)
        String message = driver.findElement(By.xpath("(//div[@class='sg-col-inner']//span)[1]")).getText();
        System.out.println("Total number of results: "+message);
        //Select the first 2 brands in the left menu
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
        //Choose New Arrivals (Sort)
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        driver.findElement(By.linkText("Newest Arrivals")).click();
        //Print the first resulting bag info (name, discounted price)
        String message2 = driver.findElement(By.xpath("//span[text()='Charm 02 Coral School Backpack']")).getText();
        System.out.println("The name of the bag is: "+message2);
        String title = driver.getTitle();
        System.out.println(title);

    }
}
