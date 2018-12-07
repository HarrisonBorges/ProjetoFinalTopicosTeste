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
class AddExpensePage extends BasePage{
    
    @FindBy(id = "name")
    WebElement nameInput;
    
    @FindBy(id = "due_date")
    WebElement dueDateInput;
    
    @FindBy(id = "note")
    WebElement noteInput;
    
    @FindBy(id = "amount")
    WebElement amountInput;
    
    @FindBy(xpath = "//*[@id=\"expensesform\"]/div[7]/div/div/input")
    WebElement buttonAdd;
    
    
    public AddExpensePage(WebDriver driver) {
        super(driver);
    }
    
    public ExpensesPage criarDespesa(String nome, String dataVenc, String nota, String quantia){
        nameInput.sendKeys(nome);
        dueDateInput.sendKeys(dataVenc);
        noteInput.sendKeys(nota);
        amountInput.sendKeys(quantia);
        
        buttonAdd.click();
        
        return new ExpensesPage(driver);
    }
    
}
