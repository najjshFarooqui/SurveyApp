package com.example.mac.surveyapp;

public class CountryResponse {
          String countryId;

    public String getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getIsActive() {
        return isActive;
    }

    public String getIsProvienceRequired() {
        return isProvienceRequired;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

          String countryName;

    public CountryResponse(String countryId, String countryName, String countryCode, String isActive, String isProvienceRequired, String phoneCode) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.isActive = isActive;
        this.isProvienceRequired = isProvienceRequired;
        this.phoneCode = phoneCode;
    }

          String countryCode;
          String isActive;
          String isProvienceRequired;
          String phoneCode;

}
