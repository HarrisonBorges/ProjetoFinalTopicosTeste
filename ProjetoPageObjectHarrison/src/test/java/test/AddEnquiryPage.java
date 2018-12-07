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
class AddEnquiryPage extends BasePage{
    
    @FindBy(id = "name")
    WebElement nameInput;
     
    @FindBy(id = "contact")
    WebElement contactInput;
     
    @FindBy(id = "email")
    WebElement emailInput;
     
    @FindBy(id = "DOB")
    WebElement dateOfBirthInput;
     
    @FindBy(id = "gender")
    WebElement genderInput;
     
    @FindBy(id = "occupation")
    WebElement occupationInput;
     
    @FindBy(id = "start_by")
    WebElement startByInput;
     
    @FindBy(xpath = "//*[@id=\"enquiriesform\"]/div[1]/div/div/div[2]/div[5]/div[1]/div/div/button")
    WebElement interestedInButton;
    
    @FindBy(xpath = "//*[@id=\"enquiriesform\"]/div[1]/div/div/div[2]/div[5]/div[1]/div/div/div/ul/li/a")
    WebElement primeiraOpcao;
    
    @FindBy(id = "aim")
    WebElement aimInput;
    
    @FindBy(id = "source")
    WebElement sourceInput;
    
    @FindBy(id = "address")
    WebElement addressInput;
    
    @FindBy(id = "pin_code")
    WebElement pinCodeInput;
    
    @FindBy(id = "followup_by")
    WebElement followUpInput;
    
    @FindBy(id = "due_date")
    WebElement dueDateInput;
    
    @FindBy(xpath = "//*[@id=\"enquiriesform\"]/div[3]/div/div/input")
    WebElement buttonCreate;
    
    public AddEnquiryPage(WebDriver driver) {
        super(driver);
    }
    
    
    public EnquiriesPage criarNovoEnquiry(String nome, String contato, String email, String dataNasc, String genero, String ocupacao, String startBy, String interessadoEm, String aim, String source, String endereco, String pin, String acompanhamento, String dataVenc){
        nameInput.sendKeys(nome);
        contactInput.sendKeys(contato);
        emailInput.sendKeys(email);
        dateOfBirthInput.sendKeys(dataNasc);
        startByInput.sendKeys(startBy);
        
        interestedInButton.click();
        primeiraOpcao.click();
        
        addressInput.sendKeys(endereco);
        pinCodeInput.sendKeys(pin);
        
        dueDateInput.sendKeys(dataVenc);
        
        buttonCreate.click();
        
        esperar(1);
        
        return new EnquiriesPage(driver);
    }
}
