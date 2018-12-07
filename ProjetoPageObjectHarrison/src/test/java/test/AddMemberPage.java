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
class AddMemberPage extends BasePage{
    @FindBy(id = "name")
    WebElement nameInput;
    
    @FindBy(id = "DOB")
    WebElement dateOfBirthInput;
    
    @FindBy(id = "contact")
    WebElement contactInput;
    
    @FindBy(id = "email")
    WebElement emailInput;
    
    @FindBy(id = "emergency_contact")
    WebElement emergencyInput;
    
    @FindBy(id = "health_issues")
    WebElement issuesInput;
    
    @FindBy(id = "proof_name")
    WebElement proofNameInput;
    
    @FindBy(id = "pin_code")
    WebElement pinCodeInput;
    
    @FindBy(id = "address")
    WebElement addressInput;
    
    @FindBy(xpath = "//*[@id=\"membersform\"]/div[5]/div/div/input")
    WebElement buttonCreate;
    
    public AddMemberPage(WebDriver driver) {
        super(driver);
    }
    
    public HomePage criarMembro(String name, String dataNasc, String contato, String email, String emergencia, String problemas, String prova, String pin, String endereco){
        nameInput.sendKeys(name);
        dateOfBirthInput.sendKeys(dataNasc);
        contactInput.sendKeys(contato);
        emailInput.sendKeys(email);
        emergencyInput.sendKeys(emergencia);
        issuesInput.sendKeys(problemas);
        proofNameInput.sendKeys(prova);
        pinCodeInput.sendKeys(pin);
        addressInput.sendKeys(endereco);
        
        buttonCreate.click();
        
        return new HomePage(driver);
    }
    
}
