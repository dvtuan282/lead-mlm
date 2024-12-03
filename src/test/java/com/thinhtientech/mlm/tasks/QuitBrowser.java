package com.thinhtientech.mlm.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class QuitBrowser implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        WebDriver driver = BrowseTheWeb.as(t).getDriver();
        driver.quit();
    }
    public static QuitBrowser thePage() {
        return Tasks.instrumented(QuitBrowser.class);
    }
}
