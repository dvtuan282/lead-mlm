package com.thinhtientech.mlm.features;

import com.thinhtientech.mlm.models.DataModel;
import com.thinhtientech.mlm.models.LeadModel;
import com.thinhtientech.mlm.questions.BodyResponse;
import com.thinhtientech.mlm.tasks.*;
import com.thinhtientech.mlm.utils.FileDataOfferLead;
import com.thinhtientech.mlm.utils.FormatPhoneNumberFaker;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import com.github.javafaker.Faker;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@ExtendWith(SerenityJUnit5Extension.class)
public class OfferStory extends BaseTestStory {

    //     create lead as api and check offer success
//    @ParameterizedTest
//    @MethodSource("leadModelProvider")
//    void Check_offer_lead_when_creating_lead_with_api(LeadModel leadModel) {
//        tuan.attemptsTo(
//                openTheApplication,
//                Login.asAdmin(accountModel),
//                CreateLead.with(leadModel)
//        );
//        String idLead = tuan.asksFor(BodyResponse.field("id").asString());
//        tuan.attemptsTo(
//                SearchLead.withId(idLead),
//                CheckOfferLead.with(leadModel),
//                QuitBrowser.thePage()
//        );
//    }
    @Test
    void Check_offer_lead_success_when_importing_leads() {
        FileDataOfferLead fileDataOfferLead = new FileDataOfferLead();
        fileDataOfferLead.updateLeadInFile(DataModel.leadModels());
        Path fileToUpload = Paths.get("dataLeadOffer.xlsx");
        tuan.attemptsTo(
                openTheApplication,
                Login.asAdmin(accountModel),
                SelectItemOnNavigationBar.select("Quản lý phân phối", "Quản lý lead"),
                ImportLead.with(fileToUpload),
                SearchLead.withCampaign(),
                CheckOfferLead.withNumberOfOffer()
        );
    }

    private static Stream<Arguments> leadModelProvider() {
        Faker faker = new Faker();
        FormatPhoneNumberFaker phoneNumberFaker = new FormatPhoneNumberFaker();
        return Stream.of(
                Arguments.of(new LeadModel("AutoTestOffer",
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
                        )
                )
        );
    }

}
