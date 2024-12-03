package com.thinhtientech.mlm.tasks;

import com.thinhtientech.mlm.models.AccountModel;
import com.thinhtientech.mlm.ui.LoginPage;
import com.thinhtientech.mlm.ui.NavigationBars;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Login {
    public static Performable asAdmin(AccountModel accountModel){
        return Task.where("{0} login as admin",
                actor -> actor.attemptsTo(
                        SendKeys.of(accountModel.getUsername()).into(LoginPage.USERNAME_FIELD),
                        SendKeys.of(accountModel.getPassword()).into(LoginPage.PASSWORD_FIELD),
                        Click.on(LoginPage.LOGIN_BUTTON),
                        WaitUntil.the(NavigationBars.CURRENT_USERNAME_ON_NAV.of(accountModel.getUsername()), WebElementStateMatchers.isVisible()),
                        Ensure.that(NavigationBars.CURRENT_USERNAME_ON_NAV.of(accountModel.getUsername())).text().isEqualTo(accountModel.getUsername())
                ));
    }
}
