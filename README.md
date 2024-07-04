# Appium Mobile Actions for Java

This project provides a comprehensive set of actions to automate mobile interactions using Appium and Java. It simplifies the process of performing common gestures, device manipulations, and session management tasks on both Android and iOS platforms.
All features in this lib are based on actions provided by the UiAutomator2 (Android) and XCUITest (iOS) plugins.


## Features

- **Device Actions**: Lock, unlock, and check lock status of devices.
- **Keyboard Actions**: Show/hide the keyboard and check its visibility.
- **Gesture Actions**: Perform scroll and swipe gestures.
- **Tap Actions**: Support for tap, double tap, and long tap gestures.
- **Session Actions**: Manage app sessions including app termination, activation, installation, removal, and backgrounding. Also, manage alert dialogs.

## Getting Started

### Add the dependency

Add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>com.appium.actions</groupId>
    <artifactId>appium-mobile-actions-java</artifactId>
    <version>LATEST</version>
</dependency>
```

or if you are using Gradle, add the following to your `build.gradle` file:

```gradle
dependencies {
    implementation 'com.appium.actions:appium-mobile-actions-java:+'
}
```

### Usage

Here is an example of how to use the `AppiumActions` class to perform a scroll gesture:

```java
import com.appium.arguments.Direction;
import com.appium.AppiumActions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class ExamplePage {

    private AppiumDriver driver;
    private AppiumActions actions; // AppiumActions instance

    @AndroidFindBy(id = "com.example.android.base:id/view")
    @iOSXCUITFindBy(accessibility = "Example Page")
    private WebElement baseElement;

    public ExamplePage(AppiumDriver driver) {
        this.driver = driver;
        this.actions = new AppiumActions(driver); // Initialize AppiumActions
    }

    public ExamplePage scrollPage() {
        actions.gesture.scroll(Direction.DOWN, 0.8, baseElement); // Perform a scroll gesture
        return this;
    }
}
```
## Changelog

For a detailed changelog, see the [CHANGELOG.md](CHANGELOG.md) file.

## Contributing

Contributions are welcome! Please refer to the [contributing guidelines](CONTRIBUTING.md) for more information.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
