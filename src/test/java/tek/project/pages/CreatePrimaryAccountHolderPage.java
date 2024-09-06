package tek.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import tek.project.utility.SeleniumUtility;

import java.util.List;

public class CreatePrimaryAccountHolderPage extends SeleniumUtility {

    public CreatePrimaryAccountHolderPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy( xpath = "//h2[text()='Create Primary Account Holder']")
    public WebElement createAccountPageTitle;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "title")
    public WebElement titlePrefixOption;

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "gender")
    public WebElement genderInput;

    @FindBy(id = "maritalStatus")
    public WebElement maritalStatusInput;

    @FindBy(id = "employmentStatus")
    public WebElement employmentStatus;

    @FindBy(id = "dateOfBirth")
    public WebElement dateOfBirthInput;

    @FindBy(xpath = "//button[text() ='Create Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//div[text() ='Error']")
    public WebElement emailError;


    public void fillUpCreateAccountForm(
            String email, String firstName, String lastName, String employment, String dateOfBirth) {
        sendText(emailInput, email);
        sendText(firstNameInput, firstName);
        sendText(lastNameInput, lastName);
        sendText(employmentStatus, employment);
        sendText(dateOfBirthInput, dateOfBirth);

        clickOnElement(createAccountButton);




    }


}
