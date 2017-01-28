package com.techpalle.multifunctionsuseproject;

/**
 * Created by DELL on 12-Dec-16.
 */
public class CountryCodes {
    private String countryCode, state;

    public CountryCodes() {
    }

    public CountryCodes(String countryCode, String state) {
        this.countryCode = countryCode;
        this.state = state;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
