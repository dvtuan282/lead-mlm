package com.thinhtientech.mlm.tasks;

import com.thinhtientech.mlm.ui.NavigationBars;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectItemOnNavigationBar {
    public static Performable select(String item, String itemDropDown){
        return Task.where("{0} select item on navigation bar",
                actor -> actor.attemptsTo(
                        Click.on(NavigationBars.MENU_ITEMS.of(item)),
                        WaitUntil.the(NavigationBars.MENU_ITEMS.of(itemDropDown), WebElementStateMatchers.isVisible()),
                        Click.on(NavigationBars.MENU_ITEMS.of(itemDropDown)),
                        Ensure.that(NavigationBars.PAGE_TITLE.of(itemDropDown)).text().isEqualTo(itemDropDown)
                ));
    }
}
