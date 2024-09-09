package tests;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.home;
import stepdef.hooks;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class hometest extends hooks {
    home Home=new home();
    helpers help=new helpers();
    @Test
    public void itemAppear(){
        help.loginsuccess();
        help.press();
        Assert.assertTrue(Home.Item().isDisplayed());
    }
    @Test
    public void hoverItem(){
        help.loginsuccess();
        help.press();
        help.hover(Home.Item());
        String expected="rgba(61, 220, 145, 1)";
        String actual=Home.Item().getCssValue("color");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void colorItem(){
        help.loginsuccess();
        help.press();
        String expected="rgba(24, 88, 58, 1)";
        String actual=Home.Item().getCssValue("color");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void itemText(){
        help.loginsuccess();
        help.press();
        String expected="A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
        String actual=Home.Item1().getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addItem(){
        help.loginsuccess();
        help.press();
        help.Clickcart(Home.addcartbuttonit1());
        String expected="1";
        String actual=Home.cartnumber().getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeItem(){
        help.loginsuccess();
        help.press();
        help.Clickcart(Home.addcartbutton2());
        help.Clickcart(Home.addcartbuttonit1());
        help.Clickcart(Home.addcartbutton3());
        help.Clickcart(Home.removecartbuttonit1());
        String expected="2";
        String actual=Home.cartnumber().getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removebutton(){
        help.loginsuccess();
        help.press();
        help.Clickcart(Home.addcartbuttonit1());
        help.Clickcart(Home.removecartbuttonit1());
        String expected="Add to cart";
        String actual=Home.addcartbuttonit1().getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void filterPrice(){
        help.loginsuccess();
        help.press();
        help.Clickcart(Home.filter());
        help.select(Home.filter(),2);
        List<WebElement> filterproducts=hooks.driver.findElements(By.className("inventory_container"));
        Assert.assertTrue(Home.filterprice().getText().equals("$7.99"));

    }
    @Test
    public void logout(){
        help.loginsuccess();
        help.press();
        help.Clickcart(Home.sidepanel());
        help.wait(Home.logoutbtn());
        help.Clickcart(Home.logoutbtn());
        String expected="https://www.saucedemo.com/";
        String actual=hooks.driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
    }

}
