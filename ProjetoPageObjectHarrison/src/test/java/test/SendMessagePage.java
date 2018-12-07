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
class SendMessagePage extends BasePage{
    
    @FindBy(xpath = "//*[@id=\"sendform\"]/div/div[1]/div/div/div[1]")
    WebElement activeMembersCheck;
    
    @FindBy(id = "message")
    WebElement messageInput;
    
    @FindBy(xpath = "//*[@id=\"sendform\"]/div/div[4]/div/div/input")
    WebElement sendButton;
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]")
    WebElement msgSucesso;
    
    public SendMessagePage(WebDriver driver) {
        super(driver);
    }
    
    public SendMessagePage mandarMensagemParaMembrosAtivos(String msg){
        activeMembersCheck.click();
        messageInput.sendKeys(msg);
        
        sendButton.click();
        return this;
    }
    
    public boolean enviouMsg(){
        esperar(1);
        return msgSucesso.isDisplayed();
    }
    
}
