package stepDef;

import com.github.javafaker.Faker;
import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pagePrivChat;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.fileHandling;
import support.mobileGesture;

import java.util.Set;

public class privateChat extends env {
    pagePrivChat elementPChat = new pagePrivChat();
    Faker faker = new Faker();
    fileHandling fileHandling = new fileHandling();
    mobileGesture gesture = new mobileGesture();
    String dataMsgPChat = "src/test/resources/file/msgPChat.txt";

//    TC-PC-01
    @When("user click button Menu")
    public void user_click_button_menu() throws InterruptedException {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPChat.getBtnMenu())
        );
//        Thread.sleep(100);
        driver.findElement(elementPChat.getBtnMenu()).click();
    }
    @And("user click menu Inbox")
    public void user_click_menu_inbox() throws InterruptedException {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPChat.getBtnMenuInbox())
        );
        Thread.sleep(100);
        driver.findElement(elementPChat.getBtnMenuInbox()).click();
    }
    @And("user click icon Create New Private Chat")
    public void user_click_icon_create_new_private_chat() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPChat.getBtnCreatePrivChat())
        );
        driver.findElement(elementPChat.getBtnCreatePrivChat()).click();
    }
    @And("user choose Member")
    public void user_choose_member() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPChat.getChooseMember())
        );
        driver.findElement(elementPChat.getChooseMember()).click();
    }
    @And("user input Message to Current Member")
    public void user_input_message_to_current_member() {
        WebElement inputMsgPChat = driver.findElement(elementPChat.getInputPrivChat());
        inputMsgPChat.click();
        String msgPChat = "Test Message Private Chat Current Member " + faker.number().numberBetween(1, 99);
        fileHandling.writeToFile(dataMsgPChat, msgPChat);
        inputMsgPChat.sendKeys(msgPChat);
        driver.hideKeyboard();
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPChat.getBtnSendPChat())
        );
        driver.findElement(elementPChat.getBtnSendPChat()).click();
    }
    @Then("user see new message has been sent")
    public void user_see_new_message_has_been_sent() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPChat.getCtnCurrPChat())
        );
        driver.findElement(elementPChat.getCtnCurrPChat()).isDisplayed();
    }

//    TC-PC-02
    @When("user click Current New Chat")
    public void user_click_current_new_chat() throws InterruptedException {
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(elementPChat.getCtnCurrPChat())
//        );
        Thread.sleep(300);
        driver.findElement(elementPChat.getCtnCurrPChat()).click();
    }
    @And("user click button Delete Chat")
    public void user_click_button_delete_chat() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPChat.getBtnDeletePChat())
        );
        driver.findElement(elementPChat.getBtnDeletePChat()).click();
    }
    @And("user click OK on confirmation Delete Chat page")
    public void user_click_ok_on_confirmation_delete_chat_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPChat.getConfOkDelPChat())
        );
        driver.findElement(elementPChat.getConfOkDelPChat()).click();
        driver.hideKeyboard();
    }
    @Then("user see success Delete Chat notification")
    public void user_see_success_delete_chat_notification() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPChat.getNotifDelPChat())
        );
        driver.findElement(elementPChat.getNotifDelPChat()).isDisplayed();
        driver.findElement(elementPChat.getCloseNotifDelPChat()).click();
    }

//    TC-PC-03
    @And("user click icon Attach File on Private Chat")
    public void user_click_icon_attach_file_on_private_chat() {
        driver.findElement(elementPChat.getBtnAttachPChat()).click();
    }
    @And("user click button Document and Video")
    public void user_click_button_document_and_video() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementPChat.getChooseDocVid())
        );
        driver.findElement(elementPChat.getChooseDocVid()).click();
    }
    @And("user click Allow confirmation Private Chat setting")
    public void user_click_allow_confirmation_private_chat_setting() {
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPChat.getBtnAllowConfPChat())
        );
        driver.findElement(elementPChat.getBtnAllowConfPChat()).click();
    }
    @And("user choose file PDF to be attached on Private Chat")
    public void user_choose_file_pdf_to_be_attached_on_private_chat() {
        Set<String> contextNames = driver.getContextHandles();
        for (String strContextName : contextNames) {
            if (strContextName.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }
        }
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPChat.getBtnFilePdfPChat())
        );
        driver.findElement(elementPChat.getBtnFilePdfPChat()).click();
    }

//    TC-PC-04
    @And("user choose file Txt to be attached on Private Chat")
    public void user_choose_file_txt_to_be_attached_on_private_chat() {
        Set<String> contextNames = driver.getContextHandles();
        for (String strContextName : contextNames) {
            if (strContextName.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }
        }
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPChat.getBtnFileTxtPChat())
        );
        driver.findElement(elementPChat.getBtnFileTxtPChat()).click();
    }

//    TC-PC-05
    @And("user choose file Word to be attached on Private Chat")
    public void user_choose_file_word_to_be_attached_on_private_chat() {
        Set<String> contextNames = driver.getContextHandles();
        for (String strContextName : contextNames) {
            if (strContextName.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }
        }
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPChat.getBtnFileWordPChat())
        );
        driver.findElement(elementPChat.getBtnFileWordPChat()).click();
    }

//    TC-PC-06
    @And("user choose file RAR to be attached on Private Chat")
    public void user_choose_file_rar_to_be_attached_on_private_chat() {
        Set<String> contextNames = driver.getContextHandles();
        for (String strContextName : contextNames) {
            if (strContextName.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }
        }
        gesture.swipeToElement(driver, 0.8, 0.5, 0.5, 0.2);
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPChat.getBtnFileRarPChat())
        );
        driver.findElement(elementPChat.getBtnFileRarPChat()).click();
    }

//    TC-PC-07
    @And("user choose file ZIP to be attached on Private Chat")
    public void user_choose_file_zip_to_be_attached_on_private_chat() {
        Set<String> contextNames = driver.getContextHandles();
        for (String strContextName : contextNames) {
            if (strContextName.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }
        }
        gesture.swipeToElement(driver, 0.8, 0.5, 0.5, 0.2);
        wait.until(
                ExpectedConditions.elementToBeClickable(elementPChat.getBtnFileZipPChat())
        );
        driver.findElement(elementPChat.getBtnFileZipPChat()).click();
    }
}