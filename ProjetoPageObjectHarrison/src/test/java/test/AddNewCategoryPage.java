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
class AddNewCategoryPage extends BasePage{
    
    @FindBy(id = "name")
    WebElement nameInput;
    
    @FindBy(xpath = "//*[@id=\"expensecategoriesform\"]/div[3]/div/div/input")
    WebElement addButton;
    
    public AddNewCategoryPage(WebDriver driver) {
        super(driver);
    }
    
    public ExpenseCategoriesPage criarCategoria(String nome){
        nameInput.sendKeys(nome);
        
        addButton.click();
        
        return new ExpenseCategoriesPage(driver);
    }
}
