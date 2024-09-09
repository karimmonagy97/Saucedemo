package tests;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.home;
import pages.login;
import stepdef.hooks;

import java.time.Duration;

public class helpers {
    login login=new login();
    home Home=new home();
    public void setdata(String name,String pass){
        login.username().sendKeys(name);
        login.pass().sendKeys(pass);
    }
    public void loginsuccess(){
        setdata("standard_user","secret_sauce");
    }
    public void press(){
        login.login_button().click();
    }
    public void loginfailed(){
        setdata("Karim_user","secretsauce");
    }
    public void loginEmpty(){
        setdata("","");
    }
    public void hover(WebElement element){
        Actions action =new Actions(hooks.driver);
        action.moveToElement(element).perform();

    }
    public void Clickcart(WebElement element){
        Actions action=new Actions(hooks.driver);
        action.click(element).perform();
    }
    public void wait(WebElement element){
        WebDriverWait wait=new WebDriverWait(hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public void select(WebElement element,int index){
        Select select=new Select(element);
        select.selectByIndex(index);

    }

}