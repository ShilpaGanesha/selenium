package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c2taregister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://c2ta.co.in/register/");
		
	driver.findElement(By.id("reg_username")).sendKeys("shilpa");
		
		driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("shilpa@yahoo.com");
		
		driver.findElement(By.name("reg_password")).sendKeys("1234");
		driver.findElement(By.id("//*[@id=\"post-306\"]/div/div/div/div/div/form/p/button")).click();
		
	}

}
