package tek.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tek.project.base.UIBaseClass;

public class CreateAccountTest extends UIBaseClass {

    private void validateCreateAccountPageTitle() {
        String actualLogoText = getElementText(signUpPage.createAccountPageTitle);
        Assert.assertEquals(actualLogoText, "Create Primary Account Holder", "Title of page matches");
    }
    @Test
    public void createNewAccountTestPositive() {
        clickOnElement(homePage.createPrimaryAccountButton);
        validateCreateAccountPageTitle();
    }
}
