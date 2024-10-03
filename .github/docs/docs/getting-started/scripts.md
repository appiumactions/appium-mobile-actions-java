---
sidebar_position: 5
---

# Scripts

The Appium Mobile Actions library works based on the native scripts of the XCUITest and UiAutomator2 drivers.

This way, when performing the scroll action, it will be checked which platform is currently running and if it is **Android**, the script will be executed: **`mobile: scrollGesture`**. If it is **iOS**, the script will be executed: **`mobile: scroll`**.

Each script has its parameters, and there are some in common across platforms. These variations are already handled in the library at run time, without the need for handling on the test project side.

For example, when calling AppiumActions scroll like this:

```java
actions.gesture.scroll(Direction.DOWN, 0.8, baseElement);
```
If the platform the test is being run on is **Android**, the following script will be executed:

```java
driver.executeScript("mobile: scrollGesture", Map.of("direction", "down", "percent", 0.8, "elementId", webElement.getId()));
```

And if it is iOS:

```java
driver.executeScript("mobile: scroll", Map.of("direction", "down", "elementId", webElement.getId()));
```

Note that the **`percent`** parameter does not exist as an argument in the XCUITest script, however this is already handled and documented in the library, without impacting the operation of both scripts.