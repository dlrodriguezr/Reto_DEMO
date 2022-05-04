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


public class Login {

    private WebDriver driver;
    private Botones botones;
    private Questions questions;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.botones = new Botones(driver);
        this.questions= new Questions(driver);
    }

    @FindBy(how = How.ID, using = "input-username")
    private WebElement UserName;

    @FindBy(how = How.ID, using = "input-password")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
    private WebElement Login;

    public void LoginReto() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        ExpectedConditions.elementToBeClickable(UserName);
        UserName.clear();
        UserName.sendKeys("demo");
        password.clear();
        password.sendKeys("demo");
        Login.click();
        this.questions.tituloAssert();
    }

}
