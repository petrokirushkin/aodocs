package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class NavigationPage extends BasePage {
    private final By requestDemoButton = By.xpath("//div[@class='hs-u-padding-t-20']/a");

    public void clickOnRequestDemoButton() {
        click(requestDemoButton);
    }
}
