package objectRepository;

import org.openqa.selenium.By;
import support.fileHandling;

public class pageTeam {
    public By getCtnListMenuCurrTeam() {
        By ctnListMenuCurrTeam = By.xpath("//*/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View");
        return ctnListMenuCurrTeam;
    }
    public By getBtnMenuBlast() {
        By btnMenuBlast = By.xpath("//*[@content-desc='Blast']");
        return btnMenuBlast;
    }
}
