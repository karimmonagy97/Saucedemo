package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdef.hooks;

public class home {

    public WebElement Item(){
        WebElement Item = hooks.driver.findElement(By.className("inventory_item_name"));
        return Item;
    }
    public WebElement Item1(){
        WebElement item=hooks.driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div"));
        return item;
    }
    public WebElement addcartbuttonit1(){
        WebElement addcartbut=hooks.driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        return addcartbut;
    }
    public WebElement addcartbutton2(){
        WebElement addcartbut=hooks.driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        return addcartbut;
    }
    public WebElement addcartbutton3(){
        WebElement addcartbut=hooks.driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        return addcartbut;
    }
    public WebElement removecartbuttonit1(){
        WebElement removecartbut=hooks.driver.findElement(By.id("remove-sauce-labs-backpack"));
        return removecartbut;
    }

    public WebElement cartnumber(){
        WebElement cartNumber=hooks.driver.findElement(By.className("shopping_cart_badge"));
        return cartNumber;
    }
    public WebElement cart(){
        WebElement cart= hooks.driver.findElement(By.id("shopping_cart_container"));
        return cart;
    }
    public WebElement filter(){
        WebElement filter=hooks.driver.findElement(By.className("product_sort_container"));
        return filter;
    }
    public WebElement sidepanel(){
        WebElement sidepanel=hooks.driver.findElement(By.id("react-burger-menu-btn"));
        return sidepanel;
    }
    public WebElement logoutbtn(){
        WebElement logoutbtn=hooks.driver.findElement(By.id("logout_sidebar_link"));
        return logoutbtn;
    }
    public WebElement filterprice(){
        WebElement p1=hooks.driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div"));

        return p1;
    }


}