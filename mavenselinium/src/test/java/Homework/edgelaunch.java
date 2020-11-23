package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class edgelaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.edgedriver().setup();
       WebDriver driver =new EdgeDriver();
       driver.get("https://www.bing.com/search?q=selinium+maven+dependencies&cvid=58a9f0c2609f4548a7d0801f15a7e1f1&pglt=515&FORM=ANNTA1&PC=ASTS");
	}

}
