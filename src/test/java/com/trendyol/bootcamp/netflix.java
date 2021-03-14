package com.trendyol.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;


public class netflix {
    /*

    https:/www.netflix.com
    netflix logo kontrol    span > svg > g
    scroll yap
    sss kontrol et //*[@data-uia-faq='what_is_netflix']
     */
    @Test
    public void NetflixFaqContol () throws InterruptedException {
        //Chrome'u aç
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        WebDriver webDriver =new ChromeDriver(options);

        //https:/www.netflix.com
        webDriver.get("https:/www.netflix.com");

        //netflix logo kontrol
        String checkLogo= webDriver.findElement(By.cssSelector(".authLinks.redButton")).getText();
        Assert.assertEquals(checkLogo, "Oturum Aç");

        //scroll yap

        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0,2300)");

        Thread.sleep(1000);




        webDriver.findElement(By.xpath("//*[@data-uia-faq='what_is_netflix']")).click();

        String getFaqOne = webDriver.findElement(By.xpath("//div[@class='faq-answer open']/span")).getText();
        System.out.println("First Faq is :\n" + getFaqOne);

        Thread.sleep(1000);




        webDriver.findElement(By.xpath("//*[@data-uia-faq='cost']")).click();

        String getFaqTwo = webDriver.findElement(By.xpath("//*[@class='faq-answer open']")).getText();
        System.out.println("Second Faq is :\n" + getFaqTwo);

        Thread.sleep(1000);




        webDriver.findElement(By.xpath("//*[@data-uia-faq='where_to_watch']")).click();

        String getFaqThree = webDriver.findElement(By.xpath("//*[@class='faq-answer open']")).getText();
        System.out.println("Third Faq is :\n" + getFaqThree);

        Thread.sleep(1000);




        webDriver.findElement(By.xpath("//*[@data-uia-faq='cancel']")).click();

        String getFaqFour = webDriver.findElement(By.xpath("//*[@class='faq-answer open']")).getText();
        System.out.println("Fourth Faq is :\n" + getFaqFour);

        Thread.sleep(1000);




        webDriver.findElement(By.xpath("//*[@data-uia-faq='what_to_watch_nft']")).click();

        String getFaqFive = webDriver.findElement(By.xpath("//*[@class='faq-answer open']")).getText();
        System.out.println("Fifth Faq is :\n" + getFaqFive);

        Thread.sleep(1000);


        webDriver.findElement(By.xpath("//*[@data-uia-faq='what_to_watch_nft']/button")).click();

        ((JavascriptExecutor)webDriver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        webDriver.get("http://google.com");




        webDriver.quit();









    }


}
