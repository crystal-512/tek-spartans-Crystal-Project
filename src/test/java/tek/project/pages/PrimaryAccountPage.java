package tek.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.project.utility.SeleniumUtility;

public class PrimaryAccountPage extends SeleniumUtility {

    public PrimaryAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy( xpath = "//h2[text()='Primary Account Portal']")
    public WebElement topLeftPageLogo;
}
