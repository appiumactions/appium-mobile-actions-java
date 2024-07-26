# Appium Mobile Actions for Java

This project provides a comprehensive set of actions to automate mobile interactions using Appium and Java. It simplifies the process of performing common gestures, device manipulations, and session management tasks on both Android and iOS platforms.
All features in this lib are based on actions provided by the UiAutomator2 (Android) and XCUITest (iOS) plugins.

## Motivation

Appium is a popular open-source test automation framework for mobile applications. It allows you to write tests against multiple platforms using the same API. However, Appium's API is low-level and requires a lot of boilerplate code to perform common actions such as scrolling, tapping, and locking devices. This library aims to simplify the process of writing mobile automation tests by providing a high-level API for performing these actions.

Until version 7.6.0 of java_client (Appium) it was common to use the TouchAction class to create more complex gestures. As of version 8.0.0, the class has been deprecated.

## Features

- **Device actions**: 
    - lock
    - unlock
    - isLocked
    - batteryInfo
    - deviceInfo
- **Keyboard actions**:
    - hideKeyboard
    - isKeyboardShown
- **Gesture actions**:
    - scroll
    - swipe
    - pinchOpen
    - pinchClose
- **Tap actions**:
    - tap
    - doubleTap
    - longTap
- **Session actions**:
    - terminateApp
    - activateApp
    - isAppInstalled
    - removeApp
    - installApp
    - clearApp
    - backgroundApp
    - acceptAlert
    - dismissAlert
    - deepLink

## Getting Started

### Add the dependency

Add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>io.github.appiumactions</groupId>
    <artifactId>appium-mobile-actions</artifactId>
    <version>LATEST</version>
</dependency>
```

or if you are using Gradle, add the following to your `build.gradle` file:

```gradle
dependencies {
    implementation 'io.github.appiumactions:appium-mobile-actions:+'
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
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
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

## Code of conduct

Please read our [Code of Conduct](CODE_OF_CONDUCT.md) before contributing or engaging in discussions.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
