package base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.LocatorParser;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    private By byLocator(By by, Object... args) {
        return LocatorParser.parseLocator(by, args);
    }

    protected SelenideElement getSelenideElement(By by, Object... args) {
        return $(byLocator(by, args));
    }

    protected SelenideElement shouldBe(Condition condition, By by, Object... args) {
        return $(byLocator(by, args)).shouldBe(condition);
    }

    protected void click(By by, Object... args) {
        shouldBe(Condition.visible, by, args).click();
    }

    protected void type(String text, By by, Object... args) {
        wipeText(by, args);
        shouldBe(Condition.visible, by, args).append(text);
    }

    protected void wipeText(By by, Object... args) {
        int stringSize = shouldBe(Condition.enabled, by, args).getWrappedElement().getAttribute("value").length();
        for (int i = 0; i < stringSize; i++) {
            shouldBe(Condition.enabled, by, args).sendKeys(Keys.BACK_SPACE);
        }
    }

    protected boolean isCondition(Condition condition, By by, Object... args) {
        return getSelenideElement(by, args).is(condition);
    }
}
