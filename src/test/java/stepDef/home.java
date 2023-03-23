package stepDef;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageHome;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.MalformedURLException;

public class home extends env {
    pageHome elementHome = new pageHome();

    @Given("user is on Home page")
    public void user_is_on_home_page() throws MalformedURLException {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementHome.getPageHome())
        );
    }

//    TC-B-01
    @And("user click Choosen Company")
    public void user_click_choosen_company() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementHome.getCtnChoosenCompany())
        );
        driver.findElement(elementHome.getCtnChoosenCompany()).click();
    }
}
