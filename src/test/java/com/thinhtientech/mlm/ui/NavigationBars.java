package com.thinhtientech.mlm.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NavigationBars {
    public static Target MENU_ITEMS = Target.the("{0} item")
            .locatedBy("//span[text()=' {0} ']");
     public static Target CURRENT_USERNAME_ON_NAV = Target.the("current username on navbar")
             .locatedBy("//span[text()='{0}']");

     public static Target PAGE_TITLE = Target.the("{0} page title")
             .locatedBy("//span[text()='{0}']");
}
