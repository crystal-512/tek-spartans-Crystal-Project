package tek.project.tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import tek.project.base.UIBaseClass;
import tek.project.utility.DataGenerator;

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

        clickOnElement(createPrimaryAccountHolderPage.createAccountButton);


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
                "employed", "05/03/2015");
        Select titlPrefixSelect = new Select(createPrimaryAccountHolderPage.titlePrefixOption);
        titlPrefixSelect.selectByIndex(3);

        Select genderSelect = new Select(createPrimaryAccountHolderPage.genderInput);
        genderSelect.selectByIndex(2);

        Select martialStatusSelect = new Select(createPrimaryAccountHolderPage.maritalStatusInput);
        martialStatusSelect.selectByIndex(2);

        clickOnElement(createPrimaryAccountHolderPage.createAccountButton);

        String actualDateOfBirthError = getElementText(createPrimaryAccountHolderPage.dateOfBirthError);
        Assert.assertEquals(actualDateOfBirthError, "ERROR",
                "you must be 18 years or older to create account");


    }

    @Test
    public void createValidAccount() {
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

        clickOnElement(createPrimaryAccountHolderPage.createAccountButton);

        String expectedUsername = DataGenerator.generateRandomUserName("crystal");
        signInPage.logIn(expectedUsername, "Password@123", "Password@123");

        clickOnElement(signInPage.submitButton);


    }





}
