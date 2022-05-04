package automation.Steps;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Conexion {

	private WebDriver driver;

	public Conexion() {

	}

	@Before
	@Step

	public WebDriver HOME_opencart() {
		WebDriverManager.chromedriver().setup(); // se va a ejecutar en Google Chrome
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.opencart.com/admin/index.php?route=common/dashboard"); // pagina a la cual se conecta
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return this.driver;

	}
}
