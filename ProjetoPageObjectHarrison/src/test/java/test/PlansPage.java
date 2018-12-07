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
class PlansPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"plans\"]/tbody/tr/td[8]/div/button[2]")
    WebElement dropdownMenu;

    @FindBy(xpath = "//*[@id=\"plans\"]/tbody/tr/td[8]/div/ul/li[2]/a")
    WebElement deletePlan;

    @FindBy(className = "confirm")
    WebElement confirmDelete;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div")
    WebElement msgSucesso;

    public PlansPage(WebDriver driver) {
        super(driver);
    }

    public boolean criouPlano() {
        esperar(1);
        return msgSucesso.isDisplayed();
    }

    public PlansPage removerPlano(){
        dropdownMenu.click();
        esperar(1);
        deletePlan.click();
        esperar(1);
        confirmDelete.click();
        
        return this;
    }
}
