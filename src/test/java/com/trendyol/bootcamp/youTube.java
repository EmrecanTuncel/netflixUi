package com.trendyol.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class youTube {

    /**
     * 1- Browser aç
     * 2- https://www.youtube.com/'a gir
     * 3- Oturum Aç'a bas
     * 4- mail adresi yaz.(Enter)
     * 5- şifre yaz(Enter)
     * 6- Onayla Butonuna bas
     * 7- Search box'a sendKeys + click
     * 8- Scroll
     * 9- What is Selenium? Tutorial for Beginners videosunu seç
     * 10- Videoyu beğen
     * 11- quit
     */
    @Test
    public void shouldSearch() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver(options);

        webDriver.get("https://www.youtube.com");

        webDriver.findElement(By.id("search")).sendKeys("What is Selenium? Tutorial for Beginners");
        webDriver.findElement(By.id("search")).sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(webDriver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='video-title']//*[text()='What is Selenium? Tutorial for Beginners']"))).click();
        // 20 saniye boyunca path i bekliyor




        //WebElement signInButton = driver.findElement(By.cssSelector("#buttons a.ytd-button-renderer"));

        //webDriver.findElement(By.xpath("//ytd-button-renderer[@class= 'style-scope ytd-masthead style-suggestive size-small']")).click();

        //webDriver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @type='email']")).sendKeys("emrecantuncel@gmail.com");

      //  webDriver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @type='email']")).sendKeys(Keys.ENTER);




        //webDriver.close();
    }
}
//input[@class='whsOnd zHQkBf' and @type='email']
