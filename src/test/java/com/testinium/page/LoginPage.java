package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    public LoginPage(){methods= new Methods();

    }
    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"),"omerovich301@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"),"omeromer12!");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));
    }


}
