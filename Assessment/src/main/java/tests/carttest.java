package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.cart;
import pages.home;
import stepdef.hooks;

import java.util.concurrent.TimeUnit;

public class carttest extends hooks {
    helpers help=new helpers();
    home Home=new home();
    cart cart=new cart();
    @Test
    public void addItem(){
        help.loginsuccess();
        help.press();
        help.Clickcart(Home.addcartbuttonit1());
        help.Clickcart(Home.cart());
        Assert.assertTrue(cart.product1().isDisplayed());

    }
    @Test
    public void removeItem(){
        help.loginsuccess();
        help.press();
        help.Clickcart(Home.addcartbuttonit1());
        help.Clickcart(Home.cart());
        help.Clickcart(cart.remproduct1());
        help.Clickcart(cart.contShopp());
        String expected="Add to cart";
        String actual=Home.addcartbuttonit1().getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void logout(){
        help.loginsuccess();
        help.press();
        help.Clickcart(Home.cart());
        help.Clickcart(Home.sidepanel());
        help.wait(Home.logoutbtn());
        help.Clickcart(Home.logoutbtn());
        String expected="https://www.saucedemo.com/";
        String actual=hooks.driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
    }
}
