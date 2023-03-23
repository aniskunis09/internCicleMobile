package stepDef;

import com.github.javafaker.Faker;
import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import objectRepository.pageCompany;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.fileHandling;

public class company extends env {
    pageCompany elementCompany = new pageCompany();

//    TC-B-01
    @And("user click Choosen Team")
    public void user_click_choosen_team() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementCompany.getGetCtnChoosenTeam())
        );
        driver.findElement(elementCompany.getGetCtnChoosenTeam()).click();
    }
}
