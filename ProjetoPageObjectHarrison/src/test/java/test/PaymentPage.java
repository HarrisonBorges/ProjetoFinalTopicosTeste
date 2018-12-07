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
class PaymentPage extends BasePage{
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div")
    WebElement msgSucesso;
    
    public PaymentPage(WebDriver driver) {
        super(driver);
    }
    
    public boolean criouPagamento(){
        return msgSucesso.isDisplayed();
    }
}
