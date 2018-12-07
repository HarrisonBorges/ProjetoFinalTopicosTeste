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
class ExpenseCategoriesPage extends BasePage{
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/h1[1]/a")
    WebElement addNew;
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div")
    WebElement msgSucesso;
    
    public ExpenseCategoriesPage(WebDriver driver) {
        super(driver);
    }
    
    public AddNewCategoryPage clicarEmAddNew(){
        addNew.click();
        
        return new AddNewCategoryPage(driver);
    }
    
    public boolean criouCategoria(){
        return msgSucesso.isDisplayed();
    }
}
