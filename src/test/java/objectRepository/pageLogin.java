package objectRepository;

import org.openqa.selenium.By;

public class pageLogin {
    By btnYes = By.xpath("//android.widget.Button[@content-desc='Yes!']");
    By btnSkip = By.xpath("//android.view.View[@content-desc='Skip']");
    By btnSignIn = By.xpath("//android.widget.Button[@content-desc='Go to Sign In']");
    By btnSignInGoogle = By.xpath("//android.widget.ImageView[@content-desc='Sign in with Google Account']");
    By btnChooseAccount = By.xpath("//*/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");

    public By getBtnYes() {
        return btnYes;
    }
    public By getBtnSkip() {
        return btnSkip;
    }
    public By getBtnSignIn() {
        return btnSignIn;
    }
    public By getBtnSignInGoogle() {
        return btnSignInGoogle;
    }
    public By getBtnChooseAccount() {
        return btnChooseAccount;
    }
}
