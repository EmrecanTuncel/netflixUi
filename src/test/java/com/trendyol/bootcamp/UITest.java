package com.trendyol.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.crypto.KeySelector;
import java.util.ArrayList;

public class UITest {

    /**
     * 1 brovser aç
     * 2 www.trendyol.com a git
     * pop up kapat
     * searchbar'a telefon yazdım
     * enter a bastım
     * sayfanın en üst kısmında telefon yazdığını kontrol ettim
     *
     *
     *
     *
     *
     * click
     * input
     * scroll
     * url'e gider
     * hover yapabilir
     * surukle bırak(click)
     * speech recognition
     * read getText()
     */
    @Test
    public void shouldSearch() throws InterruptedException {



        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver =new ChromeDriver(options);



        webDriver.get("https:/www.trendyol.com");
        WebElement closeButton =  webDriver.findElement(By.className("fancybox-close"));
        closeButton.click();


        webDriver.findElement(By.className("search-box")).sendKeys("ornitorenk");
        webDriver.findElement(By.className("search-box")).sendKeys(Keys.ENTER);


        String resultText = webDriver.findElement(By.cssSelector(".dscrptn>h1")).getText();
        Assert.assertEquals(resultText, "ornitorenk");


        webDriver.findElement(By.xpath("(//div[@class='p-card-img-wr'])[2]")).click();

        ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs2.get(1));


        WebElement addBasket =  webDriver.findElement(By.className("add-to-bs-tx"));

        addBasket.click();

       // WebDriverWait wait = new WebDriverWait(webDriver, 20);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".add-to-bs.success")));


        Boolean isSuccess = webDriver.findElement(By.cssSelector(".add-to-bs.success")).isDisplayed();
        Assert.assertEquals(isSuccess, Boolean.TRUE);


        System.out.println("");





        webDriver.quit();








    }
}
