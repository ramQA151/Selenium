package javaPrograms0111;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testriq.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        int invalidLink = 0;
        int validLink = 0;

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url != null && !url.isEmpty()) { // Check if URL is not null and not empty
                try {
                    HttpURLConnection huc = (HttpURLConnection) new URL(url).openConnection();
                    huc.setRequestMethod("HEAD");
                    huc.connect();

                    int code = huc.getResponseCode();
                    if (code >= 400) {
                        invalidLink++;
                    } else {
                        validLink++;
                    }
                } catch (MalformedURLException e) {
                    // Handle MalformedURLException
                    System.err.println("Malformed URL: " + url);
                    e.printStackTrace();
                } catch (IOException e) {
                    // Handle IOException
                    System.err.println("Error connecting to URL: " + url);
                    e.printStackTrace();
                }
            } else {
                // Handle empty or null URL
                System.out.println("Empty or null URL encountered.");
            }
        }

        System.out.println("Total valid links = " + validLink + " and Total Invalid Links = " + invalidLink);
        driver.quit();
    }
}
