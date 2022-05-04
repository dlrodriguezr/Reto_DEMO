package automation.DEFINITIONS;
import automation.Paginas.Edit;
import automation.Paginas.Login;
import automation.Paginas.SerchOrder;
import automation.Steps.Conexion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private Login login ;
	private SerchOrder serchOrder ;
	private Edit edit ;


	@Given("^Open browser$")
	public void Open_browser() throws Throwable {
		this.conexion = new Conexion();
		this.driver = this.conexion.HOME_opencart();
	}

	@When("^login$")
	public void login() throws Throwable {
		this.login = new Login(driver);
		this.login.LoginReto();
	}

	@When("^Serch_Order$")
	public void Serch_Order() throws Throwable {
		this.serchOrder= new SerchOrder(driver);
		this.serchOrder.SerchOrderID();

	}

	@When("^Edit_Product$")
	public void Edit_Product() throws Throwable {
		this.edit= new Edit(driver);
		this.edit.EditProduct();

	}
	}
