package automation.Test;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = { "src/test/resources/features" }
        , glue = { "automation.DEFINITIONS" }
       // ,tags={"@login"} // si se requiere ejecutar unicamente algun caso en especifico se debe colocar el nombre del tag que esta en el feature
)



public class RunnersFeature {

}
