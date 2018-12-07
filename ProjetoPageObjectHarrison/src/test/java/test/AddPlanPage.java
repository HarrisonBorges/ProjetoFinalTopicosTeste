/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Harrison
 */
class AddPlanPage extends BasePage{
    
    @FindBy(id = "plan_code")
    WebElement planCodeInput;
    
    @FindBy(id = "plan_name")
    WebElement planNameInput;
    
    @FindBy(id = "plan_details")
    WebElement planDetailsInput;
    
    @FindBy(id = "service_id")
    WebElement serviceSelect;
    
    @FindBy(id = "days")
    WebElement planDaysInput;
    
    @FindBy(id = "amount")
    WebElement planAmountInput;
    
    @FindBy(xpath = "//*[@id=\"plansform\"]/div/div[8]/div/div/input")
    WebElement buttonAdd;
    
    
    public AddPlanPage(WebDriver driver) {
        super(driver);
    }
    
    public PlansPage criarPlano(String code, String name, String details, String service, String days, String amount){
        planCodeInput.sendKeys(code);
        planNameInput.sendKeys(name);
        planDetailsInput.sendKeys(details);
        
        /*
        Select selector = new Select(serviceSelect);
        selector.selectByVisibleText(service);
        */
        planDaysInput.sendKeys(days);
        planAmountInput.sendKeys(amount);
        
        buttonAdd.click();
        
        return new PlansPage(driver);
    }
       
}
