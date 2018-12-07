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
public class HomePage extends DashboardPage {

    Menu menu;

    public HomePage(WebDriver driver) {
        super(driver);
        menu = new Menu(driver);
    }

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[1]/a")
    WebElement dashboard;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[9]/a")
    WebElement plans;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[2]/a")
    WebElement enquiries;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[2]/ul/li[2]/a")
    WebElement addEnquiry;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[9]/ul/li[3]/a")
    WebElement gymServices;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[10]/a")
    WebElement users;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[10]/ul/li[2]/a")
    WebElement addNewUser;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[9]/ul/li[2]/a")
    WebElement addPlan;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[8]/a")
    WebElement expenses;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[8]/ul/li[2]/a")
    WebElement addExpense;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[8]/ul/li[3]/a")
    WebElement expenseCategories;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[4]/a")
    WebElement payments;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[4]/ul/li[2]/a")
    WebElement addPayment;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[6]/a")
    WebElement sms;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[6]/ul/li[3]/a")
    WebElement sendMessage;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[6]/ul/li[2]/a")
    WebElement scheduleMessage;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[3]/a")
    WebElement members;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/ul/li[3]/ul/li[2]/a")
    WebElement addMember;

    public String tituloPrincipal() {
        return dashboard.getText();
    }

    public Menu getMenu() {
        return menu;
    }

    public boolean entrouNoDashboard() {
        esperar(1);

        return driver.getCurrentUrl().contains("dashboard");
    }

    public HomePage clicarEmPlans() {
        plans.click();
        esperar(1);
        return this;
    }

    public HomePage clicarEmUsers() {
        users.click();
        esperar(1);
        return this;
    }

    public HomePage clicarEmEnquiries() {
        enquiries.click();
        esperar(1);
        return this;
    }

    public HomePage clicarEmExpenses() {
        expenses.click();
        esperar(1);
        return this;
    }

    public HomePage clicarEmPayments() {
        payments.click();
        esperar(1);
        return this;
    }

    public HomePage clicarEmSMS() {
        sms.click();
        esperar(1);
        return this;
    }

    public HomePage clicarEmMembers() {
        members.click();
        esperar(1);
        return this;
    }

    public ServicesPage irParaGymServices() {
        gymServices.click();
        esperar(1);
        return new ServicesPage(driver);
    }

    public AddNewUserPage irParaAddNewUser() {
        addNewUser.click();
        esperar(1);
        return new AddNewUserPage(driver);
    }

    public AddPlanPage irParaAddPlan() {
        addPlan.click();
        esperar(1);
        return new AddPlanPage(driver);
    }

    public AddEnquiryPage irParaAddEnquiry() {
        addEnquiry.click();
        esperar(1);
        return new AddEnquiryPage(driver);
    }

    public AddExpensePage irParaAddExpense() {
        addExpense.click();
        esperar(1);

        return new AddExpensePage(driver);
    }

    public ExpenseCategoriesPage irParaExpensesCategories() {
        expenseCategories.click();

        return new ExpenseCategoriesPage(driver);
    }

    public AddPaymentPage irParaAddPayment() {
        addPayment.click();

        return new AddPaymentPage(driver);
    }

    public SendMessagePage irParaSendMessage() {
        sendMessage.click();

        return new SendMessagePage(driver);
    }

    public ScheduleMessagePage irParaScheduleMessage() {
        scheduleMessage.click();

        return new ScheduleMessagePage(driver);
    }
    
    public AddMemberPage irParaAddMember(){
        addMember.click();
        
        return new AddMemberPage(driver);
    }
}
