package automation.Paginas;

import automation.Steps.Botones;
import automation.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SerchOrder {

    private WebDriver driver;
    private Botones botones;
    private Questions questions;

    public SerchOrder(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.botones = new Botones(driver);
        this.questions= new Questions(driver);
    }



    @FindBy(how = How.LINK_TEXT, using = "Sales")
    private WebElement Sales;

    @FindBy(how = How.LINK_TEXT, using = "Orders")
    private WebElement Orders;

    @FindBy(how = How.ID, using = "input-order-id")
    private WebElement order;
    @FindBy(how = How.ID, using = "button-filter")
    private WebElement filter;

    @FindBy(how = How.CSS, using = "div.btn-group > a.btn.btn-primary")
    private WebElement See;

    @FindBy(how = How.CSS, using = "div:nth-child(3) div.container-fluid:nth-child(2) div.panel.panel-default:nth-child(2) div.panel-heading > h3.panel-title")
    private WebElement NoOrder;



    public void SerchOrderID() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        Sales.click();
        Orders.click();
        order.click();
        order.clear();
        order.sendKeys("16634");
        filter.click();
        wait.until(ExpectedConditions.elementToBeClickable(See));
        See.click();
        String orden= NoOrder.getText();
        System.out.println(" el numero de la orden es " + "\n"  + orden);



    }
}
