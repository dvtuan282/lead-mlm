package com.thinhtientech.mlm.tasks;

import com.thinhtientech.mlm.models.LeadModel;
import com.thinhtientech.mlm.ui.LeadManagementPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;


public class CheckOfferLead {
    public static Performable with(LeadModel leadModel) {
        return Task.where("{0} check offer lead",
                actor -> {
                    List<String> fieldsToCheck = List.of(
                            "offer success",
                            leadModel.campaignCodeCRM,
                            leadModel.phoneNumber1,
                            leadModel.partnerCode,
                            leadModel.campaignCode,
                            leadModel.pernamentAddress
                    );
                    fieldsToCheck.forEach(field -> {
                        actor.attemptsTo(
                                // xem chi tiết
                                WaitUntil.the(LeadManagementPage.SETTING_BUTTON.of("remove_red_eye"), WebElementStateMatchers.isVisible()),
                                Click.on(LeadManagementPage.SETTING_BUTTON.of("remove_red_eye", "1")),
                                // check offer lead
                                Ensure.that(LeadManagementPage.SPAN_BY_TEXT.of(field)).isDisplayed()
                        );
                    });
                });
    }

    public static Performable withNumberOfOffer() {
        return Task.where("{0} check offer lead",
                actor -> {
                    String successfulLeads = actor.recall("successfulLeads");
                    for (int i = 0; i < Integer.parseInt(successfulLeads); i++) {
                        int finalI = i + 1;
                        System.out.println("Number offer: " + finalI);
                        actor.attemptsTo(
                                // xem chi tiết
                                WaitUntil.the(LeadManagementPage.SETTING_BUTTON.of("remove_red_eye", String.valueOf(finalI)), WebElementStateMatchers.isVisible()),
                                Click.on(LeadManagementPage.SETTING_BUTTON.of("remove_red_eye", String.valueOf(finalI))),
                                // check offer lead
                                Ensure.that(LeadManagementPage.SPAN_BY_TEXT.of("offer success")).isDisplayed(),
                                Ensure.that(LeadManagementPage.SPAN_BY_TEXT.of("Test_15")).isDisplayed(),
                                Ensure.that(LeadManagementPage.SPAN_BY_TEXT.of("0974863997")).isDisplayed(),
                                Ensure.that(LeadManagementPage.SPAN_BY_TEXT.of("VPBANK")).isDisplayed(),
                                Ensure.that(LeadManagementPage.SPAN_BY_TEXT.of("AutoTestOffer")).isDisplayed(),
                                Click.on(LeadManagementPage.SPAN_BY_TEXT_SPACE.of("Đóng"))
                        );
                    }
                });
    }
}
