package com.thinhtientech.mlm.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DetailsCampaignPage {
    public static Target OPTION_TAB = Target.the("option tab {0}")
            .locatedBy("//div[@class='mat-tab-label-content' and text()='{0}']");
    public static Target CREATE_NEW_OFFER_BUTTON = Target.the("{0} button")
            .locatedBy("//button[@id='btn-add']");

    public static Target OFFER_SELECT = Target.the("offer select")
            .locatedBy("//mat-select[@formcontrolname='offerSelected']");

    public  static Target OFFER_OPTION = Target.the("{0} offer option")
            .locatedBy("//span[@class='mat-option-text' and text()=' {0} ']");

    public static Target BUTTON_CONFIRM = Target.the("confirm button")
            .locatedBy("(//mar-offer-add[@class='ng-star-inserted']//button[contains(@class, 'mat-focus-indicator')])[2]");
}
