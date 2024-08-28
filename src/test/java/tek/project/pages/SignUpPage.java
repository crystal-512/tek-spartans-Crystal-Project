package tek.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.project.utility.SeleniumUtility;

public class SignUpPage extends SeleniumUtility {

    public SignUpPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy( xpath = "//h2[text()='Create Primary Account Holder']")
    public WebElement createAccountPageTitle;
}
