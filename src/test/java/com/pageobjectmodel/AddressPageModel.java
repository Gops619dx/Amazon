 package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.runner.Base_Class;
import com.utility.FileReaderManager;

public class AddressPageModel extends Base_Class {

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='street_1']")
    private WebElement address;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;

    @FindBy(xpath = "//input[@id='region_id']")
    private WebElement state;

    @FindBy(xpath = "//input[@id='zip']")
    private WebElement zip;

    @FindBy(xpath = "//input[@id='country']")
    private WebElement country;

    @FindBy(xpath = "//input[@id='telephone']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@type='radio']")
    private WebElement radioButton;

    @FindBy(xpath = "//span[text()='Next']")
    private WebElement nextButton;

    public AddressPageModel() {
        SearchContext driver = null;
		PageFactory.initElements(driver, this);
    }

    FileReaderManager reader = new FileReaderManager();

    public void fillAddressDetails() throws IOException {
        passInput(firstName, reader.getDataProperty("firstname"));
        passInput(lastName, reader.getDataProperty("lastname"));
        passInput(phoneNumber, reader.getDataProperty("MobileNumber"));
        passInput(address, reader.getDataProperty("street"));
        passInput(city, reader.getDataProperty("city"));
        passInput(state, reader.getDataProperty("state"));
        passInput(zip, reader.getDataProperty("zipCode"));
        passInput(country, reader.getDataProperty("country"));
        clickElement(radioButton);
        clickElement(nextButton);
    }

	private void clickElement(WebElement radioButton2) {
		// TODO Auto-generated method stub
		
	}

	private void passInput(WebElement firstName2, String dataProperty) {
		// TODO Auto-generated method stub
		
	}
}