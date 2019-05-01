package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    @FindBy(id = "firstname")
    WebElement firstNameField;

    @FindBy(id = "middlename")
    WebElement middlenameField;

    @FindBy(id = "lastname")
    WebElement lastnameField;

    @FindBy(id = "email_address")
    WebElement emailAddressField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(name = "confirmation")
    WebElement confirmationField;

    @FindBy(id = "is_subscribed")
    WebElement subscribeField;

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getMiddlenameField() {
        return middlenameField;
    }

    public WebElement getLastnameField() {
        return lastnameField;
    }

    public WebElement getEmailAddressField() {
        return emailAddressField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getConfirmationField() {
        return confirmationField;
    }

    public WebElement getSubscribeField() {
        return subscribeField;
    }
}
