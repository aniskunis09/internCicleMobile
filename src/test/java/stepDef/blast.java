package stepDef;

import com.github.javafaker.Faker;
import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.pageBlast;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.fileHandling;

import java.util.Set;

public class blast extends env {
    pageBlast elementBlast = new pageBlast();
    Faker faker = new Faker();
    fileHandling fileHandling = new fileHandling();
    mobileGesture gesture = new mobileGesture();
    String dataBlastTitle = "src/test/resources/file/blastTitle.txt";
    String dataNewComment = "src/test/resources/file/newComment.txt";
    String dataReplyComment = "src/test/resources/file/replyComment.txt";

//    TC-B-01
    @And("user click icon Create New Post")
    public void user_click_icon_create_new_post() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getBtnCreateBlast()));
        driver.findElement(elementBlast.getBtnCreateBlast()).click();
    }
    @And("user input Blast Title")
    public void user_input_blast_title() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getInputBlastTitle()));
        WebElement inputBlastTitle = driver.findElement(elementBlast.getInputBlastTitle());
        inputBlastTitle.click();
        String blastTitle = "Test Blast " + faker.number().numberBetween(1, 99);
        fileHandling.writeToFile(dataBlastTitle, blastTitle);
        inputBlastTitle.sendKeys(blastTitle);
        driver.hideKeyboard();
//        String inputRstTitle = driver.findElement(elementBlast.getInputBlastTitle()).getAttribute("text");
//        Assert.assertEquals(inputRstTitle, blastTitle);
    }
    @And("user input Blast Story")
    public void user_input_blast_story() {
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getInputBlastStory()));
        WebElement inputBlastStory = driver.findElement(elementBlast.getInputBlastStory());
        inputBlastStory.click();
        String blastStory = "Test Story Blast " + faker.number().numberBetween(111, 99999);
        inputBlastStory.sendKeys(blastStory);
        driver.hideKeyboard();
//        String inputRstStory = driver.findElement(elementBlast.getInputBlastStory()).getAttribute("text");
//        Assert.assertEquals(inputRstStory, blastStory);
    }
    @And("user click button Publish")
    public void user_click_button_publish() {
        gesture.swipeToElement(driver, 0.8, 0.5, 0.5, 0.2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getBtnPublish()));
        driver.findElement(elementBlast.getBtnPublish()).click();
    }
    @Then("user see success Create Post notification")
    public void user_see_success_create_post_notification() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getNotifSuccessBlast()));
        driver.findElement(elementBlast.getNotifSuccessBlast()).isDisplayed();
        driver.findElement(elementBlast.getCloseNotifSuccessBlast()).click();
    }

//    @And("user click Tick On Complete on Current Post")
//    public void user_click_tick_on_complete_on_current_post() {
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(elementBlast.getDtlCurrBlast())
//        );
//        Boolean statusComplete = Boolean. parseBoolean(driver.findElement(elementBlast.getCheckCompletePost()).getAttribute("checked"));
//        if (statusComplete == false) {
//            driver.findElement(elementBlast.getCheckCompletePost()).click();
//        } else {
//            driver.findElement(elementBlast.getBtnBack()).click();
//        }
//        Assert.assertTrue(statusComplete);
//    }
//    @Then("user see success Complete Post notification")
//    public void user_see_success_complete_post_notification() {
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(elementBlast.getNotifCompletePost())
//        );
//        driver.findElement(elementBlast.getNotifCompletePost()).isDisplayed();
//        driver.findElement(elementBlast.getCloseNotifCompletePost()).click();
//    }

    @When("user click option Current Post")
    public void user_click_option_current_post() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getOptCurrBlast()));
        driver.findElement(elementBlast.getOptCurrBlast()).isDisplayed();
        driver.findElement(elementBlast.getOptCurrBlast()).click();
    }
    @And("user click button Edit Post")
    public void user_click_button_edit_post() {
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnEditBlast()));
        driver.findElement(elementBlast.getBtnEditBlast()).click();
    }

//    TC-B-02
    @And("user change description Blast Story")
    public void user_change_description_blast_story() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getInputBlastStory()));
        WebElement changeBlastStory = driver.findElement(elementBlast.getInputBlastStory());
        changeBlastStory.click();
        String updBlastStory = "Update Test Blast " + faker.number().numberBetween(1, 99);
        changeBlastStory.sendKeys(updBlastStory);
        driver.hideKeyboard();
    }
    @And("user click button Publish Changes")
    public void user_click_button_publish_changes() {
        gesture.swipeToElement(driver, 0.8, 0.5, 0.5, 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnPublishChanges()));
        driver.findElement(elementBlast.getBtnPublishChanges()).click();
    }
    @Then("user see success Update Post notification")
    public void user_see_success_update_post_notification() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getNotifUpdatePost()));
        driver.findElement(elementBlast.getNotifUpdatePost()).isDisplayed();
        driver.findElement(elementBlast.getCloseNotifUpdatePost()).click();
    }

//    TC-B-03, TC-B-09
    @And("user click button Archive Post")
    public void user_click_button_archive_post() {
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnArchiveBlast()));
        driver.findElement(elementBlast.getBtnArchiveBlast()).click();
    }
    @And("user click OK on confirmation Archive Post page")
    public void user_click_ok_on_confirmation_archive_post_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getConfMsgArchive()));
        driver.findElement(elementBlast.getConfOkArchive()).click();
    }
    @Then("user see success Archive Post notification")
    public void user_see_success_archive_post_notification() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getNotifArchivePost()));
        driver.findElement(elementBlast.getNotifArchivePost()).isDisplayed();
        driver.findElement(elementBlast.getCloseNotifArchivePost()).click();
    }

//    TC-B-04, TC-B-10
    @And("user click Icon Attach File")
    public void user_click_icon_attach_file() {
//        driver.findElement(elementBlast.getInputBlastStory()).sendKeys(Keys.CONTROL, "A");
//        driver.findElement(elementBlast.getInputBlastStory()).sendKeys(Keys.BACK_SPACE);
        driver.findElement(elementBlast.getIconAttachFile()).click();
    }
    @And("user click Allow confirmation setting")
    public void user_click_allow_confirmation_setting() {
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnAllowConfBlast()));
        driver.findElement(elementBlast.getBtnAllowConfBlast()).click();
    }

    @And("user choose files to be attached on Post")
    public void user_choose_files_to_be_attached_on_post() {
        Set<String> contextNames = driver.getContextHandles();
        for (String strContextName : contextNames) {
            if (strContextName.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnFileImg()));
        driver.findElement(elementBlast.getBtnFileImg()).click();
    }

//    @When("user click Icon Insert Link")
//    public void user_click_icon_insert_link() {
////        driver.findElement(elementBlast.getInputBlastStory()).sendKeys(Keys.CONTROL, "A");
////        driver.findElement(elementBlast.getInputBlastStory()).sendKeys(Keys.BACK_SPACE);
//        driver.findElement(elementBlast.getIconInsertLink()).click();
//    }
//    @And("user input text Link")
//    public void user_input_text_link() {
//        WebElement inputTextLink = driver.findElement(elementBlast.getInputTextLink());
//        inputTextLink.click();
//        driver.findElement(elementBlast.getInputTextLink()).click();
//        String txtLink = "URLTest" + faker.number().numberBetween(1, 99);
//        inputTextLink.sendKeys(txtLink);
////        driver.hideKeyboard();
//    }
//    @And("user input URL Link")
//    public void user_input_url_link() {
//        WebElement inputURLLink = driver.findElement(elementBlast.getURLTextLink());
//        inputURLLink.click();
//        driver.findElement(elementBlast.getURLTextLink()).click();
//        String urlLink = "https://www.google.com";
//        inputURLLink.sendKeys(urlLink);
////        driver.hideKeyboard();
//    }
//    @And("user click button OK on Insert Link")
//    public void user_click_button_ok_on_insert_link() {
//        driver.findElement(elementBlast.getBtnOKLink()).click();
//    }

//    TC-B-05
    @When("user click button Due Date")
    public void user_click_button_due_date() {
        driver.findElement(elementBlast.getBtnDueDate()).click();
    }
    @And("user choose Due Date")
    public void user_choose_due_date() {
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getChooseDate()));
        driver.findElement(elementBlast.getChooseDate()).click();
    }
    @And("user click button OK on Calendar")
    public void user_click_button_ok_on_calendar() {
        driver.findElement(elementBlast.getBtnOKDueDate()).click();
    }
    @And("user click button OK on Watch")
    public void user_click_button_ok_on_watch() {
        driver.findElement(elementBlast.getBtnOKDueDate()).click();
    }

//    TC-B-06, TC-B-07
    @And("user click Private Post Switch")
    public void user_click_private_post_switch() {
        gesture.swipeToElement(driver, 0.8, 0.5, 0.5, 0.2);
        driver.findElement(elementBlast.getSwitchPrivate()).click();
    }
    @And("user click button Publish Changes Private")
    public void user_click_button_publish_changes_private() {
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnPublishChanges()));
        driver.findElement(elementBlast.getBtnPublishChanges()).click();
    }

    @And("user click button Publish Private")
    public void user_click_button_publish_private() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getBtnPublish()));
        driver.findElement(elementBlast.getBtnPublish()).click();
    }

//    TC-B-08
    @And("user change description Private Blast Story")
    public void user_change_description_private_blast_story() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getInputBlastStory()));
        WebElement changeBlastStory = driver.findElement(elementBlast.getInputBlastStory());
        changeBlastStory.click();
        String updBlastStory = "Update Private Test Blast " + faker.number().numberBetween(1, 99);
        changeBlastStory.sendKeys(updBlastStory);
        driver.hideKeyboard();
    }

//    TC-B-11, TC-B-12, TC-B-15, TC-B-16
    @Then("user see Title must be filled notification")
    public void user_see_title_must_be_filled_notification() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getNotifTitleEmpty()));
        driver.findElement(elementBlast.getNotifTitleEmpty()).isDisplayed();
        driver.findElement(elementBlast.getCloseNotifTitleEmpty()).click();
    }

//    TC-B-13, TC-B-17
    @Then("user see Description must be filled notification")
    public void user_see_description_must_be_filled_notification() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getNotifStoryEmpty()));
        driver.findElement(elementBlast.getCloseNotifStoryEmpty()).isDisplayed();
        driver.findElement(elementBlast.getCloseNotifStoryEmpty()).click();
    }

//    TC-B-14, TC-B-18
    @And("user input Blast Title Same with Existing Post")
    public void user_input_blast_title_same_with_existing_post() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getInputBlastTitle()));
        WebElement inputBlastTitle = driver.findElement(elementBlast.getInputBlastTitle());
        inputBlastTitle.click();
        String blastTitle = fileHandling.readFromFile(dataBlastTitle);
        inputBlastTitle.sendKeys(blastTitle);
        driver.hideKeyboard();
    }

    @When("user click Current Post")
    public void user_click_current_post() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getCtnCurrBlast()));
        driver.findElement(elementBlast.getCtnCurrBlast()).isDisplayed();
        driver.findElement(elementBlast.getCtnCurrBlast()).click();
    }


//    TC-B-19
    @And("user click Add New Comment")
    public void user_click_add_new_comment() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getClickAddNewComment()));
        driver.findElement(elementBlast.getClickAddNewComment()).click();
        Thread.sleep(200);
        WebElement inputComment = driver.findElement(elementBlast.getBoxInputAddComment());
        inputComment.click();
        String newCommentBl = "Test Comment Blast " + faker.number().numberBetween(1, 99);
        fileHandling.writeToFile(dataNewComment, newCommentBl);
        inputComment.sendKeys(newCommentBl);
    }
    @And("user click button Submit Comment")
    public void user_click_button_submit_comment() {
        driver.findElement(elementBlast.getBtnSubmitComment()).click();
    }
    @Then("user see comment has been added on Current Post")
    public void user_see_comment_has_been_added_on_current_post() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getClickAddNewComment()));
//        gesture.swipeToElement(driver, 0.8, 0.5, 0.5, 0.2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getNewCommentBlast()));
        driver.findElement(elementBlast.getNewCommentBlast()).isDisplayed();
    }

    @When("user click option Current Comment")
    public void user_click_option_current_comment() {
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getOptCurrComment()));
        driver.findElement(elementBlast.getOptCurrComment()).click();
    }


    //    TC-B-20
    @And("user click button Edit Comment")
    public void user_click_button_edit_comment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getBtnEditComment()));
        driver.findElement(elementBlast.getBtnEditComment()).click();
    }
    @And("user input Update Comment")
    public void user_input_update_comment() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getBoxInputEditComment()));
        driver.findElement(elementBlast.getBoxInputEditComment()).click();
        Thread.sleep(200);
        WebElement updateComment = driver.findElement(elementBlast.getBoxInputEditComment());
        updateComment.click();
        String editCommentBl = "Update Current Comment " + faker.number().numberBetween(1, 99);
        fileHandling.writeToFile(dataNewComment, editCommentBl);
        updateComment.sendKeys(editCommentBl);
    }
    @And("user click button Submit Update Comment")
    public void user_click_button_submit_update_comment() {
        driver.findElement(elementBlast.getBtnSubmitComment()).click();
    }
    @Then("user see comment has been edited on Current Post")
    public void user_see_comment_has_been_edited_on_current_post() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getNotifEditComm()));
        driver.findElement(elementBlast.getNotifEditComm()).isDisplayed();
        driver.findElement(elementBlast.getCloseNotifEditComm()).click();
    }

    //    TC-B-21
    @And("user click button Archive Comment")
    public void user_click_button_archive_comment() {
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnArchiveComment()));
        driver.findElement(elementBlast.getBtnArchiveComment()).click();
    }
    @And("user click OK on confirmation Archive Comment page")
    public void user_click_ok_on_confirmation_archive_comment_page() {
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(elementBlast.getConfCommArchive())
//        );
//        driver.findElement(elementBlast.getConfCommArchive()).isDisplayed();
        driver.findElement(elementBlast.getConfOkCommArchive()).click();
    }
    @Then("user see success Archive Comment notification")
    public void user_see_success_archive_comment_notification() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getNotifArchiveComm()));
        driver.findElement(elementBlast.getNotifArchiveComm()).isDisplayed();
        driver.findElement(elementBlast.getCloseNotifArchiveComm()).click();
    }

    @When("user click Reply on Current Comment")
    public void user_click_reply_on_current_comment() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(elementBlast.getBtnReplyComment()));
        Thread.sleep(200);
        driver.findElement(elementBlast.getBtnReplyComment()).click();
    }

//    TC-B-22
    @And("user click Add Reply Comment")
    public void user_click_add_reply_comment() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getFormReplyComment()));
        driver.findElement(elementBlast.getClickAddReplyComment()).click();
        Thread.sleep(200);
        WebElement inputReplyComment = driver.findElement(elementBlast.getBoxInputReplyComment());
        inputReplyComment.click();
        String replyCommentBl = "Reply Comment Blast " + faker.number().numberBetween(1, 99);
        fileHandling.writeToFile(dataReplyComment, replyCommentBl);
        inputReplyComment.sendKeys(replyCommentBl);
    }
    @And("user click button Submit Reply Comment")
    public void user_click_button_submit_reply_comment() {
        driver.findElement(elementBlast.getBtnSubmitReplyComment()).click();
    }
    @Then("user see reply has been added on Current Comment")
    public void user_see_reply_has_been_added_on_current_comment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getClickAddReplyComment()));
        driver.findElement(elementBlast.getNewCommentBlast()).isDisplayed();
//        gesture.swipeToElement(driver, 0.8, 0.5, 0.5, 0.2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBlast.getReplyCommentBlast()));
        driver.findElement(elementBlast.getReplyCommentBlast()).isDisplayed();
    }

}