package automation.Steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.soap.Text;

import static org.junit.Assert.assertEquals;


public class Questions {

	private  WebDriver driver;

	public Questions(WebDriver driver)  {

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Dashboard')]")
	private WebElement title;

	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement Warning;


	@Step
	public void tituloAssert() {
		String titulo= title.getText();
		String Login = "Dashboard";
		Assert.assertEquals(titulo,Login);
		System.out.println(titulo);



	}

	@Step
	public void WarningAssert() {
		String MyString = "Warning: You do not have permission to modify products!";
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(Warning));
		String Alert= Warning.getText().replace("\n", "").replace("×", "");// elimina salto de pagina y la letra x
		Assert.assertEquals(MyString,Alert);
		System.out.println(Alert);

	}




}