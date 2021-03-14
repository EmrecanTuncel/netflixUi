package com.trendyol.bootcamp;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Selenide1 {
    @Test
    public void checkGrapg() throws InterruptedException {

        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 30000;

        open("http://www.tradingview.com");
    }
}
