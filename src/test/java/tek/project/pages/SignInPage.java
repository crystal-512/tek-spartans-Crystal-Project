package tek.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.project.utility.SeleniumUtility;

public class SignInPage extends SeleniumUtility {

    public SignInPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//h2[text()='Crystal Denekas']")
    public WebElement nameLogo;

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id = "confirm")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[text() ='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[text() ='Sign In']")
    public WebElement signInButton;

    public void logIn(String username, String password, String confirmPassword) {
        sendText(usernameInput, username);
        sendText(passwordInput, password);
        sendText(confirmPasswordInput, confirmPassword);
        clickOnElement(submitButton);
    }


}
