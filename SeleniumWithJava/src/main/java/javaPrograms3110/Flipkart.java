package javaPrograms3110;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
                
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("span._30XB9F")).click();
        driver.manage().window().maximize();
                
        driver.findElement(By.xpath("//div[@class='_2SmNnR']/input")).sendKeys("Samsung Galaxy" + Keys.ENTER);
        driver.findElement(By.xpath("//a[@title='Mobiles']")).click();
        Thread.sleep(3000);
        
        WebElement CB = driver.findElement(By.xpath("//div[contains(text(),'4★ & above')]"));
        CB.click();
        WebElement result= driver.findElement(By.xpath("//span[@class='_10Ermr']"));
        System.out.println("\t" + result.getText() + " Products having 4 and above rating");

       

        List<WebElement> TotalItems = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        System.out.println("\nTotal Product Count on visible Page: " + TotalItems.size() + "\n");

        for (WebElement item : TotalItems) {
            String Name = item.getText();
            System.out.println( Name);
        }
    }

}
