---
sidebar_position: 4
---

# Initialize

After the dependency is added to the project, simply initialize the `AppiumActions` object to have access to all library resources.

## Recommended

Add the `actions` variable to the page (see more about PageObject [here](https://github.com/appium/java-client/blob/master/docs/Page-objects.md))

```java
private AppiumActions actions;
```

In the page constructor, **initialize** the AppiumActions object.

```java
public ExamplePage(AppiumDriver driver) {
    this.driver = driver;
    this.actions = new AppiumActions(driver);
    PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
```

After that, just use the library’s available resources!

```java
public ExamplePage scrollPage() {
    actions.gesture.scroll(Direction.DOWN, 0.8, baseElement);
    return this;
}
```

## Full Class

see below the implementation of the complete class, using the Page Object and Page Factory pattern.

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