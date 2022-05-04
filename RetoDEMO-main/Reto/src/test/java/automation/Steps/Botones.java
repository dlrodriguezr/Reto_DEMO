package automation.Steps;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;

public class Botones {

    private WebDriver driver;

    public Botones(WebDriver driver)  {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }


    public String getDate () {

        DateFormat dateformat = new SimpleDateFormat("hh-mm-dd-mm-yy");
        Date date = new Date();
        return dateformat.format(date);
    }


// no se utiliza esta clase pero se deja correspondiendo al modelo POM, teniendo en cuanta que mas adelante se pueda usar
    @Step
    public void Dummy()throws Throwable  {



    }


}
