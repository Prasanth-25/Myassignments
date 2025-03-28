package marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BookTicket {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.pvrcinemas.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //Click on Cinema under Quick Book
        driver.findElement(By.xpath("//span[text()='Cinema']")).click();
        //Select Your Cinema
        driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
        driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
        //Select Your Date as Tomorrow
        driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
        driver.findElement(By.xpath("(//span[text()='EMPURAAN (LUCIFER-2)'])[2]")).click();
        //Select Your Show Time
        driver.findElement(By.xpath("//span[text()='04:00 PM']")).click();
        //Click on Book Button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Click Accept on Term and Condition
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        //Click any one available seat
        driver.findElement(By.xpath("(//span[text()='15'])[7]")).click();
        //Click Proceed Button
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        //Print the Seat info under book summary
        String text = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
        System.out.println("The seat number is: "+text);
        String text1 = driver.findElement(By.xpath("//p[text()='SILVER']")).getText();
        System.out.println("The seat info is: "+text1);
        //Print the grand total under book summary
        String text2 = driver.findElement(By.xpath("(//span[text()='221.27'])[2]")).getText();
        System.out.println("Grand total : "+text2);
        //Click Proceed Button
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        //Close the popup
        driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
        driver.close();


    }
}
