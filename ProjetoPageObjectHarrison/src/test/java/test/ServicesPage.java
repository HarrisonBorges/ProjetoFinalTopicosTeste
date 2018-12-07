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
class ServicesPage extends BasePage{
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/h1[1]/a")
    WebElement addNew;
    
    @FindBy(id = "name")
    WebElement serviceName;
    
    @FindBy(id = "description")
    WebElement serviceDesc;
    
    @FindBy(xpath = "//*[@id=\"servicesform\"]/div/div[2]/div/div/input")
    WebElement addButton;
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div")
    WebElement msgSucesso;
    
    public ServicesPage(WebDriver driver) {
        super(driver);
    }
    
    public ServicesPage clicarEmAddNew(){
        addNew.click();
        
        return this;
    }
    
    public ServicesPage criarNovoServico(String nome, String desc){
        serviceName.clear();
        serviceName.sendKeys(nome);
        
        serviceDesc.clear();
        serviceDesc.sendKeys(desc);
        
        esperar(1);
        
        addButton.click();
        
        esperar(1);
        
        return this;
    }
    
    public boolean criouServico(){
        return msgSucesso.isDisplayed();
    }
}
