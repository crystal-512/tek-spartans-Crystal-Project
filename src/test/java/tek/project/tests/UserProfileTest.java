package tek.project.tests;

import org.testng.annotations.Test;
import tek.project.base.UIBaseClass;

public class UserProfileTest extends UIBaseClass {

    @Test
    public void signInTest()  {
        clickOnElement(homePage.loginButton);

        sendText(signInPage.usernameInput, "supervisor");
        sendText(signInPage.passwordInput, "tek_supervisor");
        clickOnElement(signInPage.signInButton);

        clickOnElement(customerServicePortalPage.profileButton);

    }
}
