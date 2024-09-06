package tek.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.project.utility.SeleniumUtility;

import static java.sql.DriverManager.getDriver;

public class SignUpPage extends SeleniumUtility {

    public SignUpPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//h2[text()='crystal.a512@gmail.com']")
    public WebElement emailLogo;

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id = "confirmPassword")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[text() ='Create Account']")
    public WebElement submitButton;


}
