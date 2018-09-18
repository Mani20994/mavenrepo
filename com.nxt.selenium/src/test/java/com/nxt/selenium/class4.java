package com.nxt.selenium;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	public class class4 {
		@Test
	    public void start() throws IOException, InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			
			/*Get Title*/
			String actualtitle=driver.getTitle();
			System.out.println("The title of the page is:"+actualtitle);
			driver.close();
		

		}
	}



