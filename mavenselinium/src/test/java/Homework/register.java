package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			WebDriverManager.chromedriver().setup();

			WebDriver driver=new ChromeDriver();
			driver.get("https://c2ta.co.in/register/");
			//driver.findElement(By.id("username")).sendKeys("shilpa");
			//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
		//	driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
		}
	}


