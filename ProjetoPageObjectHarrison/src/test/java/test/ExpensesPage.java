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
class ExpensesPage extends BasePage{
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div")
    WebElement msgSucesso;
    
    @FindBy(xpath = "//*[@id=\"expenses\"]/tbody/tr/td[8]/div/button[2]")
    WebElement dropdown;
    
    @FindBy(xpath = "//*[@id=\"expenses\"]/tbody/tr/td[8]/div/ul/li[3]/a")
    WebElement deleteExpense;
    
    @FindBy(className = "confirm")
    WebElement confirmDelete;
    
    public ExpensesPage(WebDriver driver) {
        super(driver);
    }
    
    public boolean criouDespesa(){
        esperar(1);
        return msgSucesso.isDisplayed();
    }
    
    public ExpensesPage deletarDespesa(){
        dropdown.click();
        esperar(1);
        deleteExpense.click();
        esperar(1);
        confirmDelete.click();
        
        return this;
    }
   
}
