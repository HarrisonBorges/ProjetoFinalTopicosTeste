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
class ScheduleMessagePage extends BasePage{
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/a")
    WebElement addButton;
    
    @FindBy(id = "name")
    WebElement nameInput;
    
    @FindBy(id = "date")
    WebElement dateInput;
    
    @FindBy(id = "description")
    WebElement descInput;
    
    @FindBy(xpath = "//*[@id=\"smseventsform\"]/div/div[5]/div/div/div/button")
    WebElement sendToSelect;
    
    @FindBy(xpath = "//*[@id=\"smseventsform\"]/div/div[5]/div/div/div/div/ul/li[1]/a")
    WebElement opcaoActiveMembers;
    
    @FindBy(id = "message")
    WebElement messageInput;
    
    @FindBy(xpath = "//*[@id=\"smseventsform\"]/div/div[7]/div/div/input")
    WebElement add;
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div")
    WebElement msgSucesso;
       
    public ScheduleMessagePage(WebDriver driver) {
        super(driver);
    }
    
    public ScheduleMessagePage clicarEmAdd(){
        addButton.click();
        
        return this;
    }
    
    public ScheduleMessagePage agendarMensagem(String nome, String data, String desc, String mandarPara, String mensagem){
        nameInput.sendKeys(nome);
        dateInput.sendKeys(data);
        descInput.sendKeys(desc);
        
        sendToSelect.click();
        esperar(1);
        opcaoActiveMembers.click();
        
        messageInput.sendKeys(mensagem);
        
        add.click();
        
        return this;
    }
    
    public boolean agendouMensagem(){
        esperar(1);
        return msgSucesso.isDisplayed();
    }
    
}
