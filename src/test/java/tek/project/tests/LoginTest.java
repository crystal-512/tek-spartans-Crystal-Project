package tek.project.tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;
import tek.project.base.UIBaseClass;
import tek.project.pages.PrimaryAccountPage;
import tek.project.utility.DataGenerator;

public class LoginTest extends UIBaseClass {

    @Test
    public void signInTest()  {
        clickOnElement(homePage.loginButton);

        sendText(signInPage.usernameInput, "supervisor");
        sendText(signInPage.passwordInput, "tek_supervisor");
        clickOnElement(signInPage.signInButton);

    }



}
