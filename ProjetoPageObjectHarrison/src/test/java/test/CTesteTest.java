/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Harrison
 */
public class CTesteTest {
    
   private WebDriver driver;
   String email = "admin@gymie.in";
   String senha = "password";
   
    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }
    
    @Before
    public void before() {
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("lang=en-US");
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     
    }
    
    @After
    public void after() {
        driver.close();
    }    
    
    @Test
    public void CT01(){
        LoginPage logar = new LoginPage(driver);
        HomePage home = logar.irPaginaPrincipal(email, senha);
        assertTrue(home.entrouNoDashboard());
    }
    
    @Test
    public void CT02(){
        ServicesPage services = new LoginPage(driver).
                                irPaginaPrincipal(email, senha).
                                clicarEmPlans().
                                irParaGymServices().
                                clicarEmAddNew().
                                criarNovoServico("Musculação em barras", "Levantamento de Peso");
        
        assertTrue(services.criouServico());
    }
    
    @Test
    public void CT03(){
        UsersPage users = new LoginPage(driver).
                          irPaginaPrincipal(email, senha).
                          clicarEmUsers().
                          irParaAddNewUser().
                          criarNovoUser("Harrison Borges", "harrisonborges@outlook.com.br", "123456");
                          /* O E-mail precisa ser mudado toda vez que executar este CT. Ver lista de Bugs no documento. */
        assertTrue(users.criouUsuario());
        
        //users.removerUsuario();
    }
    
    @Test
    public void CT04(){
        PlansPage plans = new LoginPage(driver).
                          irPaginaPrincipal(email, senha).
                          clicarEmPlans().
                          irParaAddPlan().
                          criarPlano("01", "Musculação com Peso", "Peso flexível", "Musculação em barras", "02", "55");
        
        assertTrue(plans.criouPlano());
        
        plans.removerPlano();
    }
    
    @Test
    public void CT05(){
        EnquiriesPage enquiries = new LoginPage(driver).
                                  irPaginaPrincipal(email, senha).
                                  clicarEmEnquiries().
                                  irParaAddEnquiry().
                                  criarNovoEnquiry("Rodrigo Aparecido", "4312345678", "rodrigo@yahoo.com", "1986-11-13", "Male", "Student", "2018-11-01", "Musculação em barras", "Fitness", "Promotions", "R: Ipiranga, 352, Cornélio Procópio", "1234", "Call", "2019-12-01");
        
        assertTrue(enquiries.criouEnquiry());
    }
    
    @Test
    public void CT06(){
        ExpenseCategoriesPage expense = new LoginPage(driver).
                                        irPaginaPrincipal(email, senha).
                                        clicarEmExpenses().
                                        irParaExpensesCategories().
                                        clicarEmAddNew().
                                        criarCategoria("Água");
        
        assertTrue(expense.criouCategoria());
                                        
    }
    
    @Test
    public void CT07(){
        ExpensesPage expenses = new LoginPage(driver).
                                irPaginaPrincipal(email, senha).
                                clicarEmExpenses().
                                irParaAddExpense().
                                criarDespesa("Despesas", "2018-11-10", "Sanepar", "153");
        
        assertTrue(expenses.criouDespesa());
        
        expenses.deletarDespesa();
    }
    
    @Test
    public void CT08(){
        PaymentPage payment = new LoginPage(driver).
        irPaginaPrincipal(email, senha).
        clicarEmMembers().
        irParaAddMember().criarMembro("Luis Carlos", "1996-03-24", "43998756", "luis@gmail.com", "431234577", "nenhum", "Teste", "012", "R: Cambará, 14").
        clicarEmPayments().
        irParaAddPayment().
        criarPagamento("50");
        
        assertTrue(payment.criouPagamento());
    }
    
    @Test
    public void CT09(){
        SendMessagePage send = new LoginPage(driver).
                               irPaginaPrincipal(email, senha).
                               clicarEmSMS().
                               irParaSendMessage().
                               mandarMensagemParaMembrosAtivos("Oi temos novas promoções");
        
        assertTrue(send.enviouMsg());
    }
    
    @Test
    public void CT10(){
        ScheduleMessagePage schedule = new LoginPage(driver).
                                       irPaginaPrincipal(email, senha).
                                       clicarEmSMS().
                                       irParaScheduleMessage().
                                       clicarEmAdd().
                                       agendarMensagem("Reinauguração", "2019-12-25", "Reinauguração da academia", "Membros Ativos", "Oi vamos iniciar uma nova academia");
        
        assertTrue(schedule.agendouMensagem());
        
        /*Bug encontrado: o site às vezes problema no redirecionamento, no entanto a mensagem foi criada.*/
    }
}
