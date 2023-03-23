package objectRepository;

import org.openqa.selenium.By;
import support.fileHandling;

public class pageBlast {
    fileHandling fileHandling = new fileHandling();
    String dataBlastTitle = "src/test/resources/file/blastTitle.txt";
    String dataNewComment = "src/test/resources/file/newComment.txt";
    String dataReplyComment = "src/test/resources/file/replyComment.txt";

    public By getBtnCreateBlast() {
        By btnCreateBlast = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
        return btnCreateBlast;
    }
    public By getInputBlastTitle() {
        By inputBlastTitle =  By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
        return inputBlastTitle;
    }
    public By getInputBlastStory() {
        By inputBlastStory = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.EditText");
        return inputBlastStory;
    }
    public By getBtnDueDate() {
        By btnDueDate = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]");
        return btnDueDate;
    }
    public By getChooseDate() {
        By chooseDate = By.xpath("//android.view.View[@content-desc='28, Tuesday, February 28, 2023']");
        return chooseDate;
    }
    public By getBtnOKDueDate() {
        By btnOKDueDate = By.xpath("//android.widget.Button[@content-desc='OK']");
        return btnOKDueDate;
    }
    public By getBtnNotifUser() {
        By btnNotifUser = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[6]");
        return btnNotifUser;
    }
    public By getChkbxNotifUser() {
        By chkbxNotifUser = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.CheckBox");
        return chkbxNotifUser;
    }
    public By getBtnDoneNotifUser() {
        By btnDoneNotifUser = By.xpath("//android.view.View[@content-desc='done']");
        return btnDoneNotifUser;
    }
    public By getSwitchPrivate() {
        By switchPrivate = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch");
        return switchPrivate;
    }
    public By getBtnPublish() {
        By btnPublish = By.xpath("//android.widget.Button[@content-desc='Publish']");
        return btnPublish;
    }
    public By getNotifSuccessBlast() {
        By notifSuccessBlast = By.xpath("//android.view.View[@content-desc='Create post successful']");
        return notifSuccessBlast;
    }
    public By getCloseNotifSuccessBlast() {
        By closeNotifSuccessBlast = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
        return closeNotifSuccessBlast;
    }
    public By getOptCurrBlast() {
        By optCurrBlast = By.xpath("//android.widget.ImageView[contains(@content-desc, '" + fileHandling.readFromFile(dataBlastTitle) + "')]/android.view.View");
        return optCurrBlast;
    }
    public By getCtnCurrBlast() {
        By ctnCurrBlast = By.xpath("//android.widget.ImageView[contains(@content-desc, '" + fileHandling.readFromFile(dataBlastTitle) + "')]");
        return ctnCurrBlast;
    }
    public By getDtlCurrBlast() {
        By dtlCurrBlast = By.xpath("//android.view.View[contains(@content-desc, '" + fileHandling.readFromFile(dataBlastTitle) + "')]");
        return dtlCurrBlast;
    }
    public By getCheckCompletePost() {
        By checkCompletePost = By.xpath("//android.view.View[contains(@content-desc, '" + fileHandling.readFromFile(dataBlastTitle) + "']/android.widget.CheckBox");
        return checkCompletePost;
    }
    public By getNotifCompletePost() {
        By notifCompletePost = By.xpath("//android.view.View[@content-desc='Set post complete successful']");
        return notifCompletePost;
    }
    public By getCloseNotifCompletePost() {
        By closeNotifCompletePost = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
        return closeNotifCompletePost;
    }
    public By getBtnBack() {
        By btnBack = By.xpath("//android.widget.Button[@content-desc='Back']");
        return btnBack;
    }
    public By getBtnEditBlast() {
        By btnEditBlast = By.xpath("//android.view.View[@content-desc='Edit']");
        return btnEditBlast;
    }
    public By getBtnArchiveBlast() {
        By btnArchiveBlast = By.xpath("//android.view.View[@content-desc='Archive']");
        return btnArchiveBlast;
    }
    public By getConfMsgArchive() {
        By confMsgArchive = By.xpath("//android.view.View[@content-desc='Archive Post ?']");
        return confMsgArchive;
    }
    public By getConfOkArchive() {
        By confOkArchive = By.xpath("//android.widget.Button[@content-desc='Ok']");
        return confOkArchive;
    }
    public By getNotifArchivePost() {
        By notifArchivePost = By.xpath("//android.view.View[contains(@content-desc, 'Post has been archived')]");
        return notifArchivePost;
    }
    public By getCloseNotifArchivePost() {
        By closeNotifArchivePost = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
        return closeNotifArchivePost;
    }
    public By getIconAttachFile() {
        By iconAttachFile = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.view.View[2]");
        return iconAttachFile;
    }
    public By getIconInsertLink() {
        By iconInsertLink = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.widget.Button[6]");
        return iconInsertLink;
    }
    public By getBtnAllowConfBlast() {
        By btnAllowConfBlast = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
        return btnAllowConfBlast;
    }
    public By getBtnFileImg() {
        By btnFileImg = By.xpath("//*/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]");
        return btnFileImg;
    }
    public By getIconInsertImg() {
        By iconInsertImg = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.widget.Button[7]");
        return iconInsertImg;
    }
    public By getBtnPublishChanges() {
        By btnPublishChanges = By.xpath("//android.widget.Button[@content-desc='Publish changes']");
        return btnPublishChanges;
    }
    public By getNotifUpdatePost() {
        By notifUpdatePost = By.xpath("//android.view.View[@content-desc='Update post successful']\n");
        return notifUpdatePost;
    }
    public By getCloseNotifUpdatePost() {
        By closeNotifUpdatePost = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
        return closeNotifUpdatePost;
    }
    public By getInputTextLink() {
        By inputTextLink = By.xpath("//android.view.View[contains(@content-desc, 'Text to display URL')]/android.widget.EditText[1]");
        return inputTextLink;
    }
    public By getURLTextLink() {
        By inputURLLink = By.xpath("//android.view.View[contains(@content-desc, 'Text to display URL')]/android.widget.EditText[2]");
        return inputURLLink;
    }
    public By getBtnOKLink() {
        By btnOKLink = By.xpath("//android.widget.Button[@content-desc='OK']");
        return btnOKLink;
    }
    public By getBtnCancelLink() {
        By btnCancelLink = By.xpath("//android.widget.Button[@content-desc='Cancel']");
        return btnCancelLink;
    }
    public By getNotifTitleEmpty() {
        By notifTitleEmpty = By.xpath("//android.view.View[@content-desc='Title must be filled']");
        return notifTitleEmpty;
    }
    public By getCloseNotifTitleEmpty() {
        By closeNotifTitleEmpty = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
        return closeNotifTitleEmpty;
    }
    public By getNotifStoryEmpty() {
        By notifStoryEmpty = By.xpath("//android.view.View[@content-desc='Description must be filled']");
        return notifStoryEmpty;
    }
    public By getCloseNotifStoryEmpty() {
        By closeNotifStoryEmpty = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
        return closeNotifStoryEmpty;
    }
    public By getClickAddNewComment() {
        By clickAddNewComment = By.xpath("//android.view.View[@content-desc='Add new comment...']");
        return clickAddNewComment;
    }
    public By getBoxInputAddComment() {
        By boxInputAddComment = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
//        By boxInputAddComment = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
        return boxInputAddComment;
    }
    public By getBtnSubmitComment() {
        By btnSubmitComment = By.xpath("//android.widget.Button[@content-desc='submit']");
        return btnSubmitComment;
    }
    public By getNotifEditComm() {
        By notifEditComm = By.xpath("//android.view.View[contains(@content-desc, 'your comment has been archived')]");
        return notifEditComm;
    }
    public By getCloseNotifEditComm() {
        By closeNotifEditComm = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
        return closeNotifEditComm;
    }
    public By getNewCommentBlast() {
        By newCommentBlast = By.xpath("//android.view.View[contains(@content-desc, '" + fileHandling.readFromFile(dataNewComment) + "')]");
        return newCommentBlast;
    }
    public By getOptCurrComment() {
        By optCurrComment = By.xpath("//android.view.View[contains(@content-desc, '" + fileHandling.readFromFile(dataNewComment) + "')]/android.view.View[1]");
        return optCurrComment;
    }
    public By getBtnEditComment() {
        By btnEditComment = By.xpath("//android.view.View[@content-desc='Edit Comment']");
        return btnEditComment;
    }
    public By getBtnArchiveComment() {
        By btnArchiveComment = By.xpath("//android.view.View[@content-desc='Archive']");
        return btnArchiveComment;
    }
    public By getBoxInputEditComment() {
        By boxInputEditComment = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
        return boxInputEditComment;
    }
    public By getConfCommArchive() {
        By confCommArchive = By.xpath("//android.view.View[@content-desc='Archive comment?]");
        return confCommArchive;
    }
    public By getConfOkCommArchive() {
        By confOkCommArchive = By.xpath("//android.widget.Button[@content-desc='Ok']");
        return confOkCommArchive;
    }
    public By getNotifArchiveComm() {
        By notifArchiveComm = By.xpath("//android.view.View[contains(@content-desc, 'your comment has been archived')]");
        return notifArchiveComm;
    }
    public By getCloseNotifArchiveComm() {
        By closeNotifArchiveComm = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
        return closeNotifArchiveComm;
    }
    public By getBtnReplyComment() {
        By btnReplyComment = By.xpath("//android.view.View[@content-desc='Reply']");
        return btnReplyComment;
    }
    public By getFormReplyComment() {
        By formReplyComment = By.xpath("//android.view.View[@content-desc='reply comment ']");
        return formReplyComment;
    }
    public By getClickAddReplyComment() {
        By clickAddReplyComment = By.xpath("//android.view.View[@content-desc='Add new comment...']");
        return clickAddReplyComment;
    }
    public By getBoxInputReplyComment() {
        By boxInputReplyComment = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
//        By boxInputReplyComment1 = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
        return boxInputReplyComment;
    }
    public By getBtnSubmitReplyComment() {
        By btnSubmitReplyComment = By.xpath("//android.widget.Button[@content-desc='submit']");
        return btnSubmitReplyComment;
    }
    public By getReplyCommentBlast() {
        By replyCommentBlast = By.xpath("//android.view.View[contains(@content-desc, '" + fileHandling.readFromFile(dataReplyComment) + "')]");
        return replyCommentBlast;
    }


//    By iconBold = By.xpath();
//    By iconBold = By.xpath();
//    By iconBold = By.xpath();
//    By iconBold = By.xpath();
//    By iconBold = By.xpath();
//    By iconBold = By.xpath();
//    By iconBold = By.xpath();
//    By iconBold = By.xpath();

}