import com.appium.AppiumActions;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.testng.annotations.Test;

public class ActionsTest {

    @Test
    public void testTerminateApp() {
        new AppiumActions(new IOSDriver(new XCUITestOptions())).sessionActions.removeApp("com.example.app", 100);
    }
}