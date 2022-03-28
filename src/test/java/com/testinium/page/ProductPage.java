package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectAndScroll() {
        methods.waitBySeconds(10);
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(By.cssSelector("#product-table > div:nth-child(7)"));
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[5]")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[6]")).click(); //sectiğim kitaplar fav'a atılacak.
        methods.waitBySeconds(1);
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[7]")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[8]")).click();
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".logo-text>a>img"));
        methods.waitBySeconds(2);
        methods.click(By.className("lvl1catalog"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(2);
        methods.selectByText(By.cssSelector(".sort>select"), "Yüksek Oylama");
        methods.waitBySeconds(2);
        methods.hoverElement(By.xpath("(//*[contains(text(),\"Tüm Kitaplar\")])[3]"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//a[contains(@href, 'kategori/kitap-hobi/1_212.html')]")).click();
        methods.randomElement();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("#button-cart > span")).click();
        methods.waitBySeconds(2);
        methods.waitBySeconds(2);
        methods.hoverElement(By.xpath("//*[@class='menu top my-list']//li"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@class='menu top my-list']//li//li[1]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='fa fa-heart-o'])[3]"));
        methods.waitBySeconds(2);
        methods.click(By.id("sprite-cart-icon"));
        methods.waitBySeconds(2);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@name='quantity']"),"2");
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='fa fa-refresh green-icon'])[1]"));
        methods.waitBySeconds(2);
        methods.click(By.className("button-red"));
        methods.waitBySeconds(2);






    }



    }


