package waitInSelenium_44;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Utility;

public class WaitsInSelenium {
	
	public class WaitsInSelenium {
		
		public static void main(String[] args) {
			
			WebDriver driver=Utility.startBrowser("Chrome","https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
			driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));// exception TimeOut Exception
			WebElement element =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='WebDriver']")));
			//WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
			
			//System.out.println(element.isDisplayed());
			driver.quit();
			
			
			
		}
	
	}

	public static void main(String[] args) {
		
		WebDriver driver=Utility.startBrowser("Chrome","https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));// exception TimeOut Exception
		WebElement element =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='WebDriver']")));
		//WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		//System.out.println(element.isDisplayed());
		driver.quit();
		
		
		
	}

}
