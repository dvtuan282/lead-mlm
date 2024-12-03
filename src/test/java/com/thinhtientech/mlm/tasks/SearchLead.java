package com.thinhtientech.mlm.tasks;

import com.thinhtientech.mlm.models.LeadModel;
import com.thinhtientech.mlm.ui.LeadManagementPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SearchLead {
    public static Performable withId(String id) {
        return Task.where("{0} search lead by id",
                actor -> actor.attemptsTo(
                        ReloadPage.thePage(),
                        // search theo id lead
                        WaitUntil.the(LeadManagementPage.SPAN_BY_TEXT.of("Hiển thị bộ lọc nâng cao"), WebElementStateMatchers.isVisible()),
                        Click.on(LeadManagementPage.SPAN_BY_TEXT.of("Hiển thị bộ lọc nâng cao")),
                        SendKeys.of(id).into(LeadManagementPage.SEARCH_BY_FIELD.of("leadID")),
                        Click.on(LeadManagementPage.SETTING_BUTTON.of("search", "1"))
                ));
    }

    public static Performable withCampaign() {
        return Task.where("{0} search lead by campaign",
                actor -> actor.attemptsTo(
                        ReloadPage.thePage(),
                        // search theo id lead
                        Click.on(LeadManagementPage.FILTER_FIELD.of("campaign", "3")),
                        Scroll.to(LeadManagementPage.SPAN_BY_TEXT_SPACE.of("AutoTestOffer")),
                        Click.on(LeadManagementPage.SPAN_BY_TEXT_SPACE.of("AutoTestOffer"))
                ));
    }


}
