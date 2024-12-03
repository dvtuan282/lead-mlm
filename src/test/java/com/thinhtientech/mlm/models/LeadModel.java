package com.thinhtientech.mlm.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeadModel {
    @JsonProperty("CampaignCode")
    public String campaignCode;
    @JsonProperty("PhoneNumber1")
    public String phoneNumber1;
    @JsonProperty("Description2")
    public String description2;
    @JsonProperty("CustomerName")
    public String customerName;
    @JsonProperty("BoundCode")
    public String boundCode;
    @JsonProperty("Description1")
    public String description1;
    @JsonProperty("NationalId1")
    public String nationalId1;
    @JsonProperty("PernamentAddress")
    public String pernamentAddress;
    @JsonProperty("CurrentAddress")
    public String currentAddress;
    @JsonProperty("TemporaryAddress")
    public String temporaryAddress;
    @JsonProperty("CampaignCodeCRM")
    public String campaignCodeCRM;
    @JsonProperty("Description3")
    public String description3;
    @JsonProperty("PartnerCode")
    public String partnerCode;
    @JsonProperty("PhoneNumber2")
    public String phoneNumber2;

    public LeadModel() {
    }

    public LeadModel(String campaignCode, String phoneNumber1, String description2, String customerName, String boundCode, String description1, String nationalId1, String pernamentAddress, String currentAddress, String temporaryAddress, String campaignCodeCRM, String description3, String partnerCode, String phoneNumber2) {
        this.campaignCode = campaignCode;
        this.phoneNumber1 = phoneNumber1;
        this.description2 = description2;
        this.customerName = customerName;
        this.boundCode = boundCode;
        this.description1 = description1;
        this.nationalId1 = nationalId1;
        this.pernamentAddress = pernamentAddress;
        this.currentAddress = currentAddress;
        this.temporaryAddress = temporaryAddress;
        this.campaignCodeCRM = campaignCodeCRM;
        this.description3 = description3;
        this.partnerCode = partnerCode;
        this.phoneNumber2 = phoneNumber2;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBoundCode() {
        return boundCode;
    }

    public void setBoundCode(String boundCode) {
        this.boundCode = boundCode;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getNationalId1() {
        return nationalId1;
    }

    public void setNationalId1(String nationalId1) {
        this.nationalId1 = nationalId1;
    }

    public String getPernamentAddress() {
        return pernamentAddress;
    }

    public void setPernamentAddress(String pernamentAddress) {
        this.pernamentAddress = pernamentAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    public void setTemporaryAddress(String temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }

    public String getCampaignCodeCRM() {
        return campaignCodeCRM;
    }

    public void setCampaignCodeCRM(String campaignCodeCRM) {
        this.campaignCodeCRM = campaignCodeCRM;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }
}
