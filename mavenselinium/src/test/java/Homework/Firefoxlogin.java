package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefoxlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.firefoxdriver().setup();
       WebDriver driver= new FirefoxDriver();
       driver.get("https://www.google.com/search?channel=tus2&client=firefox-b-1-d&q=google");




	}

}
