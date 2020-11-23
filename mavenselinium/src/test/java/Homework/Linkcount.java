package Homework;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/search?q=testig&oq=&aqs=chrome.0.35i39i362l8...8.438601370j0j15&sourceid=chrome&ie=UTF-8");
	  List<WebElement> links = driver.findElements(By.tagName("a"));
  int linkcount=links.size();
	 System.out.println(linkcount); 
	 
        
	}

}