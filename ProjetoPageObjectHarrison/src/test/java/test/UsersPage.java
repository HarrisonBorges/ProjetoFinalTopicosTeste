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
class UsersPage extends BasePage{
    
    @FindBy(xpath = "//*[@id=\"staffs\"]/tbody/tr[2]/td[5]/div/button[2]")
    WebElement buttonMenuDropdown;
    
    @FindBy(xpath = "//*[@id=\"staffs\"]/tbody/tr[2]/td[5]/div/ul/li[2]/a")
    WebElement deleteUserOption;
    
    @FindBy(className = "confirm")
    WebElement confirmDelete;
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div")
    WebElement msgSucesso;
    
    public UsersPage(WebDriver driver) {
        super(driver);
    }
    
    public boolean criouUsuario(){
        esperar(1);
        
        return msgSucesso.isDisplayed();
    }
    
    public UsersPage removerUsuario(){
        buttonMenuDropdown.click();
        esperar(1);
        deleteUserOption.click();
        esperar(1);
        confirmDelete.click();
        
        return this;
    }
}
