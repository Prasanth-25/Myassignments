package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver drop = new ChromeDriver();
		drop.get("https://www.facebook.com/ ");
		drop.manage().window().maximize();
		drop.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		drop.findElement(By.id("pass")).sendKeys("Tuna@321");
		drop.findElement(By.name("login")).click();
		drop.findElement(By.linkText("Find your account and log in.")).click();
		System.out.println(drop.getTitle());

	}

}
