package javaPrograms0611;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabbutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement currentElement = driver.findElement(By.cssSelector("span.cart-qty"));
		while (!currentElement.getAttribute("xpath").equals("//a[@class='ico-register']")) {
		    currentElement.sendKeys(Keys.TAB);
		    currentElement = driver.switchTo().activeElement();
		}

	        // Perform actions with the target element
	        currentElement.click();
	}
}
