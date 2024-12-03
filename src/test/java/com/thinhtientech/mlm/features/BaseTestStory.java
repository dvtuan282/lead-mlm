package com.thinhtientech.mlm.features;

import com.thinhtientech.mlm.models.AccountModel;
import com.thinhtientech.mlm.tasks.OpenTheApplication;
import com.thinhtientech.mlm.tasks.QuitBrowser;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTestStory {
    protected Actor tuan = Actor.named("tuan");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    protected OpenTheApplication openTheApplication;

    @BeforeEach
    public void setup() {
        tuan.can(BrowseTheWeb.with(herBrowser));
        tuan.whoCan(CallAnApi.at("https://gateway-server-uat.mobifi.vn"));
    }

    @AfterEach
    public void quitBrowser() {
        tuan.attemptsTo(
                QuitBrowser.thePage()
        );
    }

    AccountModel accountModel = new AccountModel("tuanduongtester", "1qazXSW@2020");

}
