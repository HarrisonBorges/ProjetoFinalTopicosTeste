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
class AddPaymentPage extends BasePage{
    
    @FindBy(id = "payment_amount")
    WebElement amountInput;
    
    @FindBy(xpath = "//*[@id=\"paymentsform\"]/div/div[5]/div/div/input")
    WebElement acceptButton;
    
    public AddPaymentPage(WebDriver driver) {
        super(driver);
    }
    
    public PaymentPage criarPagamento(String quantia){
        amountInput.sendKeys(quantia);
        
        acceptButton.click();
        
        return new PaymentPage(driver);
    }
    
}
