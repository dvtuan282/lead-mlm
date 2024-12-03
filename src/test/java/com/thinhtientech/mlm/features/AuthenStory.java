package com.thinhtientech.mlm.features;

import com.thinhtientech.mlm.tasks.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class AuthenStory {

    Actor tuan = Actor.named("tuan");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @BeforeEach
    public void tuanCanBrowseTheWeb() {
        tuan.can(BrowseTheWeb.with(herBrowser));
        tuan.whoCan(CallAnApi.at("https://gateway-server-uat.mobifi.vn"));
    }

//    @Test
//    public void login_as_admin() {
//        tuan.attemptsTo(
//                openTheApplication,
//                Login.asAdmin("tuanduongtester", "1qazXSW@2020"),
//                CreateLead.with(DataModel.leadData())
//        );
//        int statusCode = tuan.asksFor(StatusResponse.statusResponse());
//        int statusCodeBody = tuan.asksFor(BodyResponse.field("httpCode").asInteger());
//        String idLead = tuan.asksFor(BodyResponse.field("id").asString());
//        if (statusCode == 200 && statusCodeBody == 200) {
//            tuan.attemptsTo(
//                    SearchLead.with(idLead)
//            );
//        }
//    }
}