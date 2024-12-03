package com.thinhtientech.mlm.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
