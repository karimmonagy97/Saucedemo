package tests;



import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.login;
import stepdef.hooks;

import java.util.concurrent.TimeUnit;


public class logintest extends hooks {
    login log=new login();
    helpers help=new helpers();
    //login with successfully users
    @Test
    public void isSuccess(){
        help.loginsuccess();
        help.press();
        Assert.assertEquals(hooks.driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");

    }
    //login with invalid user and password make sure error is displayed
    @Test
    public void isfail(){
        help.loginfailed();
        help.press();
        hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element=log.wrongdata();
        Assert.assertTrue(element.isDisplayed());
    }
    //login with invalid user and password make sure color of error
    @Test
    public void colorfail(){
        help.loginfailed();
        help.press();
        WebElement element=log.wrongdata();
        /*
        String expected_color="rgb(226, 35, 26, 1)";
        String actual_color=element.getCssValue("background-color");
        Assert.assertEquals(expected_color,actual_color);

         */
        String expectedColor = "rgba(226, 35, 26, 1)";
        String actualColor = element.getCssValue("background-color");
        Assert.assertEquals(expectedColor,actualColor);
    }
    //login with invalid user and password make sure of the text of error
    @Test
    public void textfail(){
        help.loginfailed();
        help.press();
        String expected="Epic sadface: Username and password do not match any user in this service";
        String actual=log.wrongdata().getText();
        Assert.assertEquals(expected,actual);
    }
    //login with Empty username and password make sure message appear
    @Test
    public void isEmpty(){
        help.loginEmpty();
        help.press();
        WebElement element=log.wrongdata();
        Assert.assertTrue(element.isDisplayed());

    }
    //login with empty user and password make sure of the text
    @Test
    public void textEmpty(){
        help.loginEmpty();
        help.press();
        String expected="Epic sadface: Username is required";
        String actual=log.wrongdata().getText();
        Assert.assertEquals(expected,actual);
    }
    /*
    cannot get the showpassword icon so the test cases that needed to be covered is missed
    cover to all the users

     */



}