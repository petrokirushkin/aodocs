package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class GooglePage extends BasePage {
    private final By searchField = By.name("q");
    private final By searchButton = By.xpath("//center/input[@name='btnK']");
    private final By requestItem = By.xpath("//h3[text()='AODocs: Document Management, BPM, and Regulatory ...']");

    public void typeInSearchField(String request) {
        type(request, searchField);
    }

    public void clickOnSearchButton() {
        click(searchButton);
    }

    public void clickOnRequestItem() {
        click(requestItem);
    }
}
