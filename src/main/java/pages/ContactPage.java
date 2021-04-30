package pages;

import base.BasePage;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

public class ContactPage extends BasePage {

    private final By firstNameInputField = By.xpath("//div/input[contains(@id, 'firstname')]");
    private final By emailInputField = By.xpath("//div/input[contains(@id, 'email')]");
    private final By companySizeDropdown = By.xpath("//div/select[contains(@id, 'company_size')]");
    private final By companySizeDropdownOption = By.xpath("//div/select[contains(@id, 'company_size')]/option[@value='5-50 employees']");
    private final By submitButton = By.xpath("//div/input[@type='submit']");

    private final By emailErrorMassage = By.xpath("//ul/li/label[text()='Email must be formatted correctly.']");
    private final By lastNameErrorMassage = By.xpath("//ul/li/label[text()='Please complete this required field.']");
    private final By dropdownErrorMassage = By.xpath("//ul/li/label[text()='Please select an option from the dropdown menu.']");
    private final By finalErrorMassage = By.xpath("//ul/li/label[text()='Please complete all required fields.']");


    public void typeInFirstNameInputField(String firstName) {
        type(firstName, firstNameInputField);
    }

    public void typeInEmailInputField(String email) {
        type(email, emailInputField);
    }

    public void clickOnCompanySizeDropdown() {
        click(companySizeDropdown);
    }

    public void clickOnCompanySizeDropdownOption() {
        click(companySizeDropdownOption);
    }

    public void clickOnSubmitButton() {
        click(submitButton);
    }

    /*is Displayed*/
    public boolean isLastNameErrorMassageDisplayed() {
        return isCondition(Condition.visible, lastNameErrorMassage);
    }

    public boolean isEmailErrorMassageDisplayed() {
        return isCondition(Condition.visible, emailErrorMassage);
    }

    public boolean isDropdownErrorMassageDisplayed() {
        return isCondition(Condition.visible, dropdownErrorMassage);
    }

    public boolean isFinalErrorMassageDisplayed() {
        return isCondition(Condition.visible, finalErrorMassage);
    }
}
