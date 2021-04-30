package contact;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.Pages;
import utils.Constants;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactValidationTest extends BaseTest {

    @Test
    public void contactValidationTest() {
        Pages.googlePage().typeInSearchField(Constants.REQUEST);
        Pages.googlePage().clickOnSearchButton();
        Pages.googlePage().clickOnRequestItem();

        Pages.navigationPage().clickOnRequestDemoButton();

        Pages.contactPage().typeInFirstNameInputField(Constants.USERNAME);
        Pages.contactPage().typeInEmailInputField(Constants.EMAIL);
        Pages.contactPage().clickOnCompanySizeDropdown();
        Pages.contactPage().clickOnCompanySizeDropdownOption();
        Pages.contactPage().clickOnSubmitButton();


        assertTrue(Pages.contactPage().isLastNameErrorMassageDisplayed());
        assertTrue(Pages.contactPage().isEmailErrorMassageDisplayed());
        assertTrue(Pages.contactPage().isDropdownErrorMassageDisplayed());
        assertTrue(Pages.contactPage().isFinalErrorMassageDisplayed());
    }
}
