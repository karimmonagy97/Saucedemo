package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdef.hooks;

public class cart {
    public WebElement product1(){
        WebElement product1= hooks.driver.findElement(By.className("inventory_item_name"));
        return product1;
    }
    public WebElement remproduct1(){
        WebElement removeProduct=hooks.driver.findElement(By.id("remove-sauce-labs-backpack"));
        return removeProduct;
    }
    public WebElement contShopp(){
        WebElement cont=hooks.driver.findElement(By.id("continue-shopping"));
        return cont;
    }
}
