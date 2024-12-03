package com.thinhtientech.mlm.tasks;

import com.thinhtientech.mlm.ui.LeadManagementPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.actions.UploadToField;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ImportLead {
    public static Performable with(Path fileToUpload) {
        return Task.where("{0} import lead",
                actor -> {
                    actor.attemptsTo(
                            Click.on(LeadManagementPage.SETTING_BUTTON.of("settings", "1")),
                            Click.on(LeadManagementPage.BUTTON_BY_TEXT.of("Import lead")),
                            Upload.theFile(fileToUpload).to(LeadManagementPage.IMPORT_FIELD),
                            WaitUntil.the(LeadManagementPage.SPAN_BY_TEXT_SPACE.of("Import"), isVisible()).forNoMoreThan(15).seconds(),
                            Click.on(LeadManagementPage.SPAN_BY_TEXT_SPACE.of("Import"))

                            );
                    // lấy số lượng lead import thành công
                    actor.remember("successfulLeads", Text.of(LeadManagementPage.IMPORT_SUCCESS_LEAD));
                    // đóng popup
                    actor.attemptsTo(
                            WaitUntil.the(LeadManagementPage.SPAN_BY_TEXT_SPACE.of("Đóng"), WebElementStateMatchers.isVisible()),
                            Click.on(LeadManagementPage.SPAN_BY_TEXT_SPACE.of("Đóng"))
                    );
                });
    }
}
