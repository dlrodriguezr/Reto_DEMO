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

public class Edit {


    private WebDriver driver;
    private Botones botones;
    private Questions questions;

    public Edit(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.botones = new Botones(driver);
        this.questions = new Questions(driver);
    }


    @FindBy(how = How.LINK_TEXT, using = "Catalog")
    private WebElement Catalog;

    @FindBy(how = How.LINK_TEXT, using = "Products")
    private WebElement Products;

    @FindBy(how = How.ID, using = "input-name")
    private WebElement name;

    @FindBy(how = How.ID, using = "button-filter")
    private WebElement filter;

    @FindBy(how = How.XPATH, using = "//form[@id='form-product']/div/table/tbody/tr/td[8]/a")
    private WebElement Edit;

    @FindBy(how = How.ID, using = "input-name1")
    private WebElement NameProduct;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-save']")
    private WebElement submit;


    public void EditProduct() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        Catalog.click();
        Products.click();
        wait.until(ExpectedConditions.elementToBeClickable(name));
        name.click();
        name.clear();
        name.sendKeys("Apple cinema");
        filter.click();
        wait.until(ExpectedConditions.elementToBeClickable(Edit));
        Edit.click();
        wait.until(ExpectedConditions.elementToBeClickable(NameProduct));
        NameProduct.click();
        NameProduct.sendKeys(" Edit");
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();
        questions.WarningAssert(); //  se asegura de saber que no se tienen los permisos
    }
}
