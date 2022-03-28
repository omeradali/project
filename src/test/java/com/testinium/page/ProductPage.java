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
        Assert.assertTrue(methods.isElementVisible(By.className("swal2-title ky-swal-title-single")));
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[6]")).click(); //sectiğim kitaplar fav'a atılacak.
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.className("swal2-title ky-swal-title-single")));
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[7]")).click();
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.className("swal2-title ky-swal-title-single")));
        methods.findElement(By.xpath(" (//*[@class='fa fa-heart'])[8]")).click();
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.className("swal2-title ky-swal-title-single")));
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
        methods.click(By.xpath("//*[@class='right']/a"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//*[@class='htabs alt']/a[2]"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-firstname-companyname"),"Omer");
        methods.sendKeys(By.id("address-lastname-title"),"Adali");
        methods.click(By.xpath("//*[@id='address-zone-id']"));
        methods.click(By.xpath("//*[@id='address-zone-id']/option[3]"));
        methods.click(By.xpath("//*[@id='address-county-id']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id='address-county-id']/option[2]"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id='address-address-text']"),"Ankara");
        methods.sendKeys(By.xpath("//*[@id='address-mobile-telephone']"),"5424170982");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id='button-checkout-continue']"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id='credit-card-owner']"),"Omerr adali");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id='credit_card_number_1']"),"4522");
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("//*[@id='credit_card_number_2']"),"5026");
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("//*[@id='credit_card_number_3']"),"4031");
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("//*[@id='credit_card_number_4']"),"2006");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id='credit-card-expire-date-month']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id='credit-card-expire-date-month']/option[4]"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//*[@id='credit-card-security-code']"),"345");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id='credit-card-expire-date-year']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id='credit-card-expire-date-year']/option[4]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id='button-checkout-continue']"));
        methods.waitBySeconds(5);
        methods.click(By.className("checkout-logo"));
        methods.waitBySeconds(4);
        methods.hoverElement(By.className("menu top login"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[contains(@href, 'https://www.kitapyurdu.com/index.php?route=account/logout')]"));
        methods.waitBySeconds(4);







    }



    }


