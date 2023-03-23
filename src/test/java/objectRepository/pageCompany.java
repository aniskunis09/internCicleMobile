package objectRepository;

import org.openqa.selenium.By;
import support.fileHandling;

public class pageCompany {
    public By getGetCtnChoosenTeam() {
        By getCtnChoosenTeam = By.xpath("//android.widget.Button[contains(@content-desc, 'Mobile')]");
//        By getCtnChoosenTeam = By.xpath("//android.widget.Button[@content-desc='Mobile Test Mobile Testing']");
        return getCtnChoosenTeam;
    }
}
