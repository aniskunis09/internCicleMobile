package stepDef;

import com.github.javafaker.Faker;
import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageTeam;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.fileHandling;


public class team extends env {
    pageTeam elementTeam = new pageTeam();

    @When("user click button Menu Blast")
    public void user_click_button_menu_blast() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementTeam.getCtnListMenuCurrTeam())
        );
        driver.findElement(elementTeam.getCtnListMenuCurrTeam()).isDisplayed();
        driver.findElement(elementTeam.getBtnMenuBlast()).click();
    }
}
