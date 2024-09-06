package tek.project.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import tek.project.base.UIBaseClass;
import tek.project.pages.CreatePrimaryAccountHolderPage;
import tek.project.pages.SignUpPage;
import tek.project.utility.DataGenerator;

import java.util.*;

public class CreateAccountTest extends UIBaseClass {

    private void validateCreateAccountPageTitle() {
        String actualLogoText = getElementText(createPrimaryAccountHolderPage.createAccountPageTitle);
        Assert.assertEquals(actualLogoText, "Create Primary Account Holder", "Title of page matches");
    }

    @Test
    public void createNewAccountTestPositive() {
        clickOnElement(homePage.createPrimaryAccountButton);
        validateCreateAccountPageTitle();

        String expectedEmail = DataGenerator.generateRandomEmail("crystal");

        createPrimaryAccountHolderPage.fillUpCreateAccountForm(
                expectedEmail, "Crystal", "Denekas",
                "employed", "03/24/1992");
        Select titlPrefixSelect = new Select(createPrimaryAccountHolderPage.titlePrefixOption);
        titlPrefixSelect.selectByIndex(3);

        Select genderSelect = new Select(createPrimaryAccountHolderPage.genderInput);
        genderSelect.selectByIndex(2);

        Select martialStatusSelect = new Select(createPrimaryAccountHolderPage.maritalStatusInput);
        martialStatusSelect.selectByIndex(2);


    }

    @Test
    public void createNewAccountWithExistingEmail() {
        clickOnElement(homePage.createPrimaryAccountButton);
        validateCreateAccountPageTitle();

        createPrimaryAccountHolderPage.fillUpCreateAccountForm(
                "crystal.a512@gmail.com", "Crystal", "Denekas",
                "employed", "03/24/1992");

        Select titlPrefixSelect = new Select(createPrimaryAccountHolderPage.titlePrefixOption);
        titlPrefixSelect.selectByIndex(3);

        Select genderSelect = new Select(createPrimaryAccountHolderPage.genderInput);
        genderSelect.selectByIndex(2);

        Select martialStatusSelect = new Select(createPrimaryAccountHolderPage.maritalStatusInput);
        martialStatusSelect.selectByIndex(2);

        clickOnElement(createPrimaryAccountHolderPage.createAccountButton);

      //String actualError = getElementText(createPrimaryAccountHolderPage.emailError);

        //Assert.assertEquals(actualError, "Account with email crystal.a512@gmail.com is exist",
               // "Error Message for Existing Email should match");//
    }

    @Test
    public void createNewAccountWithUnderAgeBirthday() {
        clickOnElement(homePage.createPrimaryAccountButton);
        validateCreateAccountPageTitle();

        String expectedEmail = DataGenerator.generateRandomEmail("crystal");

        createPrimaryAccountHolderPage.fillUpCreateAccountForm(
                expectedEmail, "Crystal", "Denekas",
                "employed", "05/03/2024");
        Select titlPrefixSelect = new Select(createPrimaryAccountHolderPage.titlePrefixOption);
        titlPrefixSelect.selectByIndex(3);

        Select genderSelect = new Select(createPrimaryAccountHolderPage.genderInput);
        genderSelect.selectByIndex(2);

        Select martialStatusSelect = new Select(createPrimaryAccountHolderPage.maritalStatusInput);
        martialStatusSelect.selectByIndex(2);


    }





}
