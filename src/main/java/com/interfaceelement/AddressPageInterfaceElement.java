package com.interfaceelement;

public interface AddressPageInterfaceElement {
    String firstName_xpath = "//input[@name='firstname']";
    String lastName_xpath = "//input[@name='lastname']";
    String address_xpath = "//input[@id='street1']";
    String city_xpath = "//input[@id='city']";
    String state_xpath = "//input[@id='region_id']";
    String zip_xpath = "//input[@id='zip']";
    String country_xpath = "//input[@id='country']";
    String phoneNumber_xpath = "//input[@id='telephone']";
    String radio_button = "//input[@type='radio']";
    String next_button = "//span[text()='Next']";
}