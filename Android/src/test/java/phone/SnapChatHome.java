package phone;

import generic.Base;
import login.data.UserInfo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by mrahman on 9/5/15.
 */
public class SnapChatHome extends Base {

    UserInfo user = new UserInfo();
    @Test
    public void mainPage()throws InterruptedException{
        System.out.println("App is launched");
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]");
        typeByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]", user.userName, Keys.TAB);
        typeByXpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.EditText[2]", user.passWord, Keys.ENTER);
        sleep(3);
    }
}
