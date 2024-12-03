package com.thinhtientech.mlm.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CreateOfferPage {

    public static Target CREATE_NEW_BUTTON = Target.the("create new button")
            .locatedBy("//button[@id='btn-add']");
    public static Target FIELD_BY_NAME = Target.the("{0} field")
            .locatedBy("//input[@formcontrolname='{0}']");
    public static Target BUTTON_BY_POSITION_IN_PAGE = Target.the("{0} button")
            .locatedBy("(//button[contains(@class, 'mat-focus-indicator')])[{1}]");

    public static Target OPERATOR_SELECT = Target.the("operator select")
            .locatedBy("(//nz-select[@formcontrolname='conditionId'])[{0}]");

    public static Target CONDITION_LEAD_INFORMATION_FIELD_SELECT = Target.the("select condition \"lead\" information field")
            .locatedBy("(//*[@id=\"kt_content\"]/div/mar-add-lead-offer/div/kt-portlet/div/kt-portlet-body/form/div[1]/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div/nz-select[@formcontrolname='fieldId'])[{0}]");

    public static Target INFORMATION_FIELD_OFFER_SELECT = Target.the("select \"offer\" information field")
            .locatedBy("(//*[@id=\"kt_content\"]/div/mar-add-lead-offer/div/kt-portlet/div/kt-portlet-body/form/div[1]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div/nz-select[@formcontrolname='fieldId'])[{0}]");

    public static Target OPTION_FIELD = Target.the("{0} option")
            .locatedBy("//li[contains(text(), '{0}')]");

    public static Target VALUES_FIELD_CONDITION_LEAD = Target.the("Values field")
            .locatedBy("(//input[@formcontrolname='values'])[{0}]");

    public static Target VALUES_FIELD_INFORMATION_OFFER = Target.the("Values field")
            .locatedBy("(//input[@formcontrolname='value'])[{0}]");
}
