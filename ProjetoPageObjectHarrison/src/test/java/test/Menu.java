package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Harrison
 */
public class Menu extends BasePage{
    
    //Menu User
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[10]/a/span")
    WebElement usuario;
    
    //Menu AddUser
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[10]/ul/li[2]/a")
    WebElement addUsuario;
    
    //Menu Plans
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[9]/a/span")
    WebElement planos;
    
        //Menu Plans
  //  @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[9]/a/span")
   // WebElement planos;
            
            
    public Menu(WebDriver driver) {
        super(driver);
    }
    
    public AddUserPage irParaCadastroUsuario(){
        usuario.click();
        addUsuario.click();
        return new AddUserPage(driver);
    }
}
