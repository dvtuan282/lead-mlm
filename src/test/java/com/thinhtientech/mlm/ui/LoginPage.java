package com.thinhtientech.mlm.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static Target USERNAME_FIELD = Target.the("username field")
            .locatedBy("//input[@id='mat-input-0']");
    public static Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("//input[@id='mat-input-1']");

    public static Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("//button[@id='kt_login_signin_submit']");


}
