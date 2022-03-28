package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class ProductPageTest extends BaseTest {

    @Test
    public void ProductPage(){

        LoginPage loginpage = new LoginPage();
        ProductPage productpage = new ProductPage();
        loginpage.login();
        productpage.selectAndScroll();



    }




}
