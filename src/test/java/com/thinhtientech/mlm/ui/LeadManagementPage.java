package com.thinhtientech.mlm.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LeadManagementPage {
    public static Target SETTING_BUTTON = Target.the("{0} button")
            .locatedBy("(//mat-icon[text()='{0}'])[{1}]");

    public static Target BUTTON_BY_TEXT = Target.the("{0} button")
            .locatedBy("//button[text()='{0}']");

    public static Target SPAN_BY_TEXT_SPACE = Target.the("{0} button")
            .locatedBy("//span[text()= ' {0} ']");
    public static Target SPAN_BY_TEXT = Target.the("{0}")
            .locatedBy("//span[text()= '{0}']");
    public static Target IMPORT_FIELD = Target.the("import field")
            .locatedBy("//input[@id='fileUpload']");

    public static Target SEARCH_BY_FIELD = Target.the("{0} search")
            .locatedBy("//mat-header-cell[text()= ' {0} ']//input");

    public static Target FILTER_FIELD = Target.the("{0} filter")
            .locatedBy("/html/body/kt-base/div/div/div/div/div/mar-list/div/kt-portlet/div/kt-portlet-body/div/form/div[1]/div[{1}]/div/mat-form-field/div/div[1]/div/mat-select");

    public static Target IMPORT_SUCCESS_LEAD = Target.the("import success lead")
            .locatedBy("(//span[contains(@class, 'detail-value des')])[2]");
}
