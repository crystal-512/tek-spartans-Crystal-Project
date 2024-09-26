package tek.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.project.utility.SeleniumUtility;

public class CustomerServicePortalPage extends SeleniumUtility {

    public CustomerServicePortalPage() {
        PageFactory.initElements(getDriver(), this);
    }


    @FindBy(css = "button[aria-label='profile']")
    public WebElement profileButton;
}
