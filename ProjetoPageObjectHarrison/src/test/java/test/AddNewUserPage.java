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
class AddNewUserPage extends BasePage{
    
    @FindBy(id = "name")
    WebElement nameInput;
    
    @FindBy(id = "email")
    WebElement emailInput;
    
    @FindBy(id = "password")
    WebElement passwordInput;
    
    @FindBy(id = "password_confirmation")
    WebElement pwConfInput;
    
    @FindBy(xpath = "//*[@id=\"usersform\"]/div[3]/div/div/input")
    WebElement createButton;
    
    public AddNewUserPage(WebDriver driver) {
        super(driver);
    }
    
    public UsersPage criarNovoUser(String name, String email, String password){
        nameInput.clear();
        nameInput.sendKeys(name);
        
        emailInput.clear();
        emailInput.sendKeys(email);
        
        passwordInput.clear();
        passwordInput.sendKeys(password);
        
        pwConfInput.clear();
        pwConfInput.sendKeys(password);
        
        createButton.click();
        
        return new UsersPage(driver);
    }
    
}
