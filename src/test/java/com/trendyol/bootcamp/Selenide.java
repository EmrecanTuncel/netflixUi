package com.trendyol.bootcamp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class Selenide {
    /**
     * 1- Chrome aç
     * 2- https://tr.tradingview.com 'a git
     * 3- Giriş Tıkla
     * -
     * 4- Search'e DOGEUSDT yaz + ENTER
     * 5- Tam özellikli grafik seç
     */

    @Test
    public void checkGrapg() throws InterruptedException {

        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 30000;

        open("http://www.tradingview.com");


        $(".tv-header__link.tv-header__link--signin.js-header__signin").click();

        $(".tv-signin-dialog__social.tv-signin-dialog__toggle-email").click();

        Thread.sleep(3000);

        $("input[id*=email-signin__user-name-input]").setValue("denemebootcamp");
        Thread.sleep(1000);

        $("input[id*=email-signin__password-input]").setValue("tarikbattalemrecan88");
        Thread.sleep(1000);

        $("span.tv-button__loader").click();

        $(By.name("query")).setValue("DOGEUSDT").pressEnter();
        Thread.sleep(1000);

        //$("a[class*=button-1iktpaT1]").click();

        Thread.sleep(1000);


        open("https://www.coinkolik.com/wp-content/uploads/2021/02/dogecoin-binance-doge.jpg");

        Thread.sleep(15000);



    }
}
