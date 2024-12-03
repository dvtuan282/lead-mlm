package com.thinhtientech.mlm.features;

import com.thinhtientech.mlm.models.LeadModel;
import com.thinhtientech.mlm.questions.BodyResponse;
import com.thinhtientech.mlm.tasks.*;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@ExtendWith(SerenityJUnit5Extension.class)
public class OfferStory extends BaseTestStory {

    // create lead as api and check offer success
    @ParameterizedTest
    @MethodSource("leadModelProvider")
     void Check_offer_lead_when_creating_lead_with_api(LeadModel leadModel) {
        tuan.attemptsTo(
                openTheApplication,
                Login.asAdmin(accountModel),
                CreateLead.with(leadModel)
        );
        String idLead = tuan.asksFor(BodyResponse.field("id").asString());
        tuan.attemptsTo(
                SearchLead.withId(idLead),
                CheckOfferLead.with(leadModel),
                QuitBrowser.thePage()
        );
    }

    @Test
    void Check_offer_lead_success_when_importing_leads(){
        Path fileToUpload = Paths.get("C:\\Users\\tuandv\\abc.xlsx");
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
        return Stream.of(
                Arguments.of(new LeadModel("AutoTestOffer",
                        "0974863998",
                        "men",
                        "test k8s",
                        "Test_15",
                        "men",
                        "men",
                        "Tester 3T",
                        "1 Trung Kính",
                        "1 Trung Kính",
                        "Test_15",
                        "Test_15",
                        "VPBANK",
                        "0974863820")
                ),
                Arguments.of(new LeadModel("AutoTestOffer",
                        "0974863991",
                        "men",
                        "test k8s",
                        "Test_15",
                        "men",
                        "men",
                        "Tester 3T",
                        "1 Trung Kính",
                        "1 Trung Kính",
                        "Test_15",
                        "Test_15",
                        "VPBANK",
                        "0974863820")
                )
        );
    }

}
