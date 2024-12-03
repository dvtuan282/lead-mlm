package com.thinhtientech.mlm.models;

import com.github.javafaker.Faker;
import com.thinhtientech.mlm.utils.FormatPhoneNumberFaker;

import java.util.ArrayList;
import java.util.List;

public class DataModel {
    public static List<LeadModel> leadModels() {
        Faker faker = new Faker();
        FormatPhoneNumberFaker phoneNumberFaker = new FormatPhoneNumberFaker();
        List<LeadModel> listLead = new ArrayList<>();
        listLead.add(new LeadModel(
                "AutoTestOffer",
                phoneNumberFaker.phoneNumberVietnam(),
                faker.lorem().sentence(),
                faker.name().fullName(),
                "Test_15",
                faker.lorem().sentence(),
                faker.address().country(),
                "Tester 3T",
                faker.address().fullAddress(),
                faker.address().streetName(),
                "Test_15",
                faker.lorem().sentence(),
                "VPBANK",
                phoneNumberFaker.phoneNumberVietnam()
        ));
        listLead.add(new LeadModel(
                "AutoTestOffer",
                phoneNumberFaker.phoneNumberVietnam(),
                faker.lorem().sentence(),
                faker.name().fullName(),
                "Test_15",
                faker.lorem().sentence(),
                faker.address().country(),
                "Tester 3T",
                faker.address().fullAddress(),
                faker.address().streetName(),
                "Test_15",
                faker.lorem().sentence(),
                "VPBANK",
                phoneNumberFaker.phoneNumberVietnam()
        ));
        return listLead;
    }
}
