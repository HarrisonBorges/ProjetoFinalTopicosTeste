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
public class AddUserPage extends DashboardPage {

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "name")
    WebElement nome;

  //*  public UserPage adicionarUser(strinf ) {
   //     nome.sendkeys();
     //   return UserPage(driver);
   // }
}
