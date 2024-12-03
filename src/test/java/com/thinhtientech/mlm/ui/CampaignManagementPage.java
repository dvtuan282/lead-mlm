package com.thinhtientech.mlm.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CampaignManagementPage {
    public static Target SEARCH_FIELD = Target.the("search field")
            .locatedBy("//input[@data-placeholder='Tìm kiếm']");

    public static Target DETAILS_CAMPAIGN_BUTTON = Target.the("details campaign button")
            .locatedBy("//*[@id=\"kt_content\"]/div/mar-list/div/kt-portlet/div/kt-portlet-body/div/div[2]/mat-table/mat-row[1]/mat-cell[10]/button[1]");


}
