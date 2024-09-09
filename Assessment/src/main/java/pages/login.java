package pages;

import stepdef.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login {


    public WebElement username(){
        WebElement usernametext = hooks.driver.findElement(By.id("user-name"));
        return usernametext;
    }
    public WebElement pass(){
        WebElement pass=hooks.driver.findElement(By.id("password"));
        return pass;
    }
    public WebElement login_button(){
        WebElement login_button=hooks.driver.findElement(By.id("login-button"));
        return login_button;
    }
    public WebElement wrongdata(){
        //WebElement errormessage=hooks.driver.findElement(By.className("error-message-container"));
        WebElement errormessage=hooks.driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]"));
        return errormessage;
    }


}