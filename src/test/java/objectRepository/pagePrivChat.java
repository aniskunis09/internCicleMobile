package objectRepository;

import org.openqa.selenium.By;
import support.fileHandling;

public class pagePrivChat {
    fileHandling fileHandling = new fileHandling();
    String dataMsgPChat = "src/test/resources/file/msgPChat.txt";

    public By getBtnMenu() {
        By btnMenu = By.xpath("//android.view.View[contains(@content-desc, 'Menu')]");
//        By btnMenu = By.xpath("//android.view.View[@content-desc=\"Menu\n" +
//                "Tab 4 of 4\"]");
        return btnMenu;
    }
    public By getBtnMenuInbox() {
        By btnMenuInbox = By.xpath("//android.view.View[contains(@content-desc, 'Inbox')]");
        return btnMenuInbox;
    }
    public By getBtnCreatePrivChat() {
        By btnCreatePrivChat = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
        return btnCreatePrivChat;
    }
    public By getChooseMember() {
        By chooseMember =  By.xpath("//android.widget.ImageView[@content-desc='Testing Anis 09']");
        return chooseMember;
    }
    public By getInputPrivChat() {
        By inputPrivChat = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
        return inputPrivChat;
    }
    public By getBtnSendPChat() {
        By btnSendPChat = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
        return btnSendPChat;
    }
    public By getCtnCurrPChat() {
        By ctnCurrPChat = By.xpath("//android.view.View[contains(@content-desc, '" + fileHandling.readFromFile(dataMsgPChat) + "')]]");
        return ctnCurrPChat;
    }
    public By getBtnAttachPChat() {
        By btnAttachPChat = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]");
        return btnAttachPChat;
    }
    public By getChooseDocVid() {
        By chooseDocVid = By.xpath("//android.view.View[@content-desc='Document & Video']");
        return chooseDocVid;
    }
    public By getBtnAllowConfPChat() {
        By btnAllowConfPChat = By.xpath("//*/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
        return btnAllowConfPChat;
    }
    public By getBtnFileImgPChat() {
        By btnFileImgPChat = By.xpath("//*/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]");
        return btnFileImgPChat;
    }
    public By getBtnFilePdfPChat() {
        By btnFilePdfPChat = By.xpath("//*/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView");
        return btnFilePdfPChat;
    }
    public By getBtnFileTxtPChat() {
        By btnFileTxtPChat = By.xpath("//*/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView");
        return btnFileTxtPChat;
    }
    public By getBtnFileWordPChat() {
        By btnFileWordPChat = By.xpath("//*/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView");
        return btnFileWordPChat;
    }
    public By getBtnFileRarPChat() {
        By btnFileRarPChat = By.xpath("//*/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]");
        return btnFileRarPChat;
    }
    public By getBtnFileZipPChat() {
        By btnFileZipPChat = By.xpath("//*/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]");
        return btnFileZipPChat;
    }
    public By getChooseImgGallery() {
        By chooseImgGallery = By.xpath("//android.widget.Button[@content-desc='OK']");
        return chooseImgGallery;
    }
    public By getFileImgPChat1() {
        By fileImgPChat1 = By.xpath("//android.widget.LinearLayout[@content-desc='1 kcg.jpeg, 3.50 kB, Jan 14']/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]");
        return fileImgPChat1;
    }
    public By getFileImgPChat2() {
        By fileImgPChat2 = By.xpath("//android.widget.LinearLayout[@content-desc='kcg.jpeg, 6.29 kB, 9:46 AM']/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]");
        return fileImgPChat2;
    }
    public By getBtnDeletePChat() {
        By btnDeletePChat = By.xpath("//android.view.View[@content-desc='Delete']");
        return btnDeletePChat;
    }
    public By getConfMsgDelPChat() {
        By confMsgDelPChat = By.xpath("//android.view.View[@content-desc='are you sure you want to delete message ?']");
        return confMsgDelPChat;
    }
    public By getConfOkDelPChat() {
        By confOkDelPChat = By.xpath("//android.widget.Button[@content-desc='Ok']");
        return confOkDelPChat;
    }
    public By getNotifDelPChat() {
        By notifDelPChat = By.xpath("//android.view.View[@content-desc='Delete chat message success']");
        return notifDelPChat;
    }
    public By getCloseNotifDelPChat() {
        By closeNotifDelPChat = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
        return closeNotifDelPChat;
    }

    public By getBtnDelAttach() {
        By btnDelAttach = By.xpath("//android.widget.Button[@content-desc='Download']");
        return btnDelAttach;
    }
//    public By getSwitchPrivate() {
//        By switchPrivate = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Switch");
//        return switchPrivate;
//    }
//    public By getBtnPublish() {
//        By btnPublish = By.xpath("//android.widget.Button[@content-desc='Publish']");
//        return btnPublish;
//    }
//    public By getNotifSuccessBlast() {
//        By notifSuccessBlast = By.xpath("//android.view.View[@content-desc='Create post successful']");
//        return notifSuccessBlast;
//    }
//    public By getCloseNotifSuccessBlast() {
//        By closeNotifSuccessBlast = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
//        return closeNotifSuccessBlast;
//    }
//    public By getOptCurrBlast() {
//        By optCurrBlast = By.xpath("//android.widget.ImageView[contains(@content-desc, '" + fileHandling.readFromFile(dataBlastTitle) + "')]/android.view.View");
//        return optCurrBlast;
//    }
//    public By getCtnCurrBlast() {
//        By ctnCurrBlast = By.xpath("//android.widget.ImageView[contains(@content-desc, '" + fileHandling.readFromFile(dataBlastTitle) + "')]");
//        return ctnCurrBlast;
//    }
//    public By getDtlCurrBlast() {
//        By dtlCurrBlast = By.xpath("//android.view.View[contains(@content-desc, '" + fileHandling.readFromFile(dataBlastTitle) + "')]");
//        return dtlCurrBlast;
//    }
//    public By getCheckCompletePost() {
//        By checkCompletePost = By.xpath("//android.view.View[contains(@content-desc, '" + fileHandling.readFromFile(dataBlastTitle) + "']/android.widget.CheckBox");
//        return checkCompletePost;
//    }
//    public By getNotifCompletePost() {
//        By notifCompletePost = By.xpath("//android.view.View[@content-desc='Set post complete successful']");
//        return notifCompletePost;
//    }
//    public By getCloseNotifCompletePost() {
//        By closeNotifCompletePost = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
//        return closeNotifCompletePost;
//    }
//    public By getBtnBack() {
//        By btnBack = By.xpath("//android.widget.Button[@content-desc='Back']");
//        return btnBack;
//    }
//    public By getBtnEditBlast() {
//        By btnEditBlast = By.xpath("//android.view.View[@content-desc='Edit']");
//        return btnEditBlast;
//    }
//    public By getBtnArchiveBlast() {
//        By btnArchiveBlast = By.xpath("//android.view.View[@content-desc='Archive']");
//        return btnArchiveBlast;
//    }
//    public By getConfMsgArchive() {
//        By confMsgArchive = By.xpath("//android.view.View[@content-desc='Archive Post ?']\n");
//        return confMsgArchive;
//    }
//    public By getConfOkArchive() {
//        By confOkArchive = By.xpath("//android.widget.Button[@content-desc='Ok']");
//        return confOkArchive;
//    }
//    public By getNotifArchivePost() {
//        By notifArchivePost = By.xpath("//android.view.View[contains(@content-desc, 'Post has been archived')]");
//        return notifArchivePost;
//    }
//    public By getCloseNotifArchivePost() {
//        By closeNotifArchivePost = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
//        return closeNotifArchivePost;
//    }
//    public By getIconAttachFile() {
//        By iconAttachFile = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.view.View[2]");
//        return iconAttachFile;
//    }
//    public By getIconInsertLink() {
//        By iconInsertLink = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.widget.Button[6]");
//        return iconInsertLink;
//    }
//    public By getBtnAllowConfBlast() {
//        By btnAllowConfBlast = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
//        return btnAllowConfBlast;
//    }
//    public By getBtnFileImg() {
//        By btnFileImg = By.xpath("//*/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView");
//        return btnFileImg;
//    }
//    public By getIconInsertImg() {
//        By iconInsertImg = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.widget.HorizontalScrollView/android.widget.Button[7]");
//        return iconInsertImg;
//    }
//    public By getBtnPublishChanges() {
//        By btnPublishChanges = By.xpath("//android.widget.Button[@content-desc='Publish changes']");
//        return btnPublishChanges;
//    }
//    public By getNotifUpdatePost() {
//        By notifUpdatePost = By.xpath("//android.view.View[@content-desc='Update post successful']\n");
//        return notifUpdatePost;
//    }
//    public By getCloseNotifUpdatePost() {
//        By closeNotifUpdatePost = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
//        return closeNotifUpdatePost;
//    }
//
//    public By getInputTextLink() {
//        By inputTextLink = By.xpath("//android.view.View[contains(@content-desc, 'Text to display URL')]/android.widget.EditText[1]");
//        return inputTextLink;
//    }
//    public By getURLTextLink() {
//        By inputURLLink = By.xpath("//android.view.View[contains(@content-desc, 'Text to display URL')]/android.widget.EditText[2]");
//        return inputURLLink;
//    }
//    public By getBtnOKLink() {
//        By btnOKLink = By.xpath("//android.widget.Button[@content-desc='OK']");
//        return btnOKLink;
//    }
//    public By getBtnCancelLink() {
//        By btnCancelLink = By.xpath("//android.widget.Button[@content-desc='Cancel']");
//        return btnCancelLink;
//    }
}