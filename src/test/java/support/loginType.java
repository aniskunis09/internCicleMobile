package support;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class loginType {
    public String getLoginType() {
        List<String> givenList = Arrays.asList("Swipe", "Skip");
        Random rdm = new Random();
        String loginType = givenList.get(rdm.nextInt(givenList.size()));

        return loginType;
    }
}
