package tek.project.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import tek.project.base.UIBaseClass;

public class HomePageTest extends UIBaseClass {

    private void validateTitle() {
        String actualLogoText = getElementText(homePage.topLeftPageTitle);
        Assert.assertEquals(actualLogoText, "TEK Insurance App", "Logo text should match");
    }

    @Test
    public void validateTopLeftCornerPageTitle() {
        validateTitle();
    }


}
