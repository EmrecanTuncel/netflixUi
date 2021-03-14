package com.trendyol.bootcamp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertTrue;

public class SelenideWithGoogle {
    @Test
    public void checkGrapg() throws InterruptedException {
//      TODO
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 10000;

//      Go to Netflix
        open("https://netflix.com");
        Thread.sleep(1000);

//      Check the position
        Boolean checkLogo = $("#netflix-logo").isDisplayed();
        assertTrue("", checkLogo);

//      Scroll To Location
        $("li[data-uia-faq='what_is_netflix']").scrollTo();



//      Read and Print Faq Texts
       // $$(".faq-list-item").stream().forEach(a->a.click());

        for(SelenideElement element:  $$(".faq-list-item")){
            element.click();
            assert element.find(".svg-icon-thin-x.svg-open").isDisplayed();

        }
        $(".faq-list-item").click();
        String text = $(".faq-answer.open").getText();
        assert text.equalsIgnoreCase(Constants.netfliz_text);



       /* for (int i=1; i<=5;  i++)
        {
            String selector = "div[class$='our-story-card-text']>ul>li:nth-of-type(" + i + ")";
            $(selector).click();
        }
        */

/*
        while (true){
            int i=1;
            i++;
            String selector = "div[class$='our-story-card-text']>ul>li:nth-of-type(" + i + ")";
            $(selector).click();
            String s = "div[class$='our-story-card-text']>ul>*:last-of-type";
             assertNotSame(selector, s);
        }*/
//      Close Faq Texts

        $("li[data-uia-faq='what_to_watch_nft']").click();

       // Thread.sleep(5000);
        closeWindow();


    }
}
