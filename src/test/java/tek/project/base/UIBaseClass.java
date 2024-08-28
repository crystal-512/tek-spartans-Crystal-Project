package tek.project.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tek.project.pages.HomePage;
import tek.project.pages.SignUpPage;
import tek.project.utility.SeleniumUtility;

public class UIBaseClass extends SeleniumUtility {

    private static final Logger LOGGER = LogManager.getLogger(UIBaseClass.class);

    public HomePage homePage;
    public SignUpPage signUpPage;


    @BeforeMethod
    public void setupTests() {
        LOGGER.info("Setup Test and opening browser");
        setupBrowser();
        homePage = new HomePage();
        signUpPage = new SignUpPage();

    }

    @AfterMethod
    public void testCleanup() {
        LOGGER.info("running after each test and quite browser");
        quitBrowser();
    }
}
