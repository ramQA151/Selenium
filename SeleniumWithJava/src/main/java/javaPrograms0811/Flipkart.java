package javaPrograms0811;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@class='_30XB9F']")).click();
        Actions action = new Actions(driver);
        try {
             WebElement popupCloseButton  = driver.findElement(By.xpath("//img[@alt='Close Feedback']"));
             popupCloseButton.click();
        }
        catch(Exception e) {
            System.out.println("NO feedback popup");
        }
       Thread.sleep(4000);
       
        WebElement login=driver.findElement(By.cssSelector("span._1sLnDu"));
        action.moveToElement(login);
        Thread.sleep(2000);
        WebElement Ele = driver.findElement(By.xpath("(//*[contains(text(),'Electronics')])[2]"));
        action.moveToElement(Ele);
        Ele.click();
        Thread.sleep(2000);
        
        WebElement BT = driver.findElement(By.xpath("//div[@class='_3LU4EM']"));
        action.sendKeys(Keys.ENTER).perform();
        
       String ActualTitle = driver.getTitle();
        
        Assert.assertEquals(ActualTitle, "Headphones");
        
    }
}
