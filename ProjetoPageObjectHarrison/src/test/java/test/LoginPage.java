/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Harrison
 */
public class LoginPage extends BasePage {
    
    public LoginPage(WebDriver driver) {
        super(driver);
        driver.get("http://192.168.0.5/auth/login");
    }
    
    @FindBy(name = "email")
    WebElement email;
    
    @FindBy(name = "password")
    WebElement password;
    
    @FindBy(xpath="//*[@id=\"loginform\"]/div/button")
    WebElement botaoLogar;
     
    public HomePage irPaginaPrincipal(String temail, String tsenha){
        email.sendKeys(temail);
        password.sendKeys(tsenha);
        esperar(1);
        botaoLogar.click();
        
        return new HomePage(driver);
    }
    
}
