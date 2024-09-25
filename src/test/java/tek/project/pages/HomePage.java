package tek.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.project.utility.SeleniumUtility;

public class HomePage extends SeleniumUtility {

    public HomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy( xpath = "//h2[text()='TEK Insurance App']")
    public WebElement topLeftPageTitle;

    @FindBy( linkText = "Create Primary Account")
    public WebElement createPrimaryAccountButton;

    @FindBy( xpath = "//a[text()='Login']")
    public WebElement loginButton;
}
