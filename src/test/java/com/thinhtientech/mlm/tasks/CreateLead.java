package com.thinhtientech.mlm.tasks;

import com.thinhtientech.mlm.models.LeadModel;
import com.thinhtientech.mlm.questions.BodyResponse;
import com.thinhtientech.mlm.questions.StatusResponse;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.HashMap;
import java.util.Map;

public class CreateLead {
    public static Performable with(LeadModel leadModel) {
        Map<String,String> headers = new HashMap<>();
        headers.put("x-api-key", "NzIxMmYxYTktYzNjZi00NmViLThmYmEtZjJmZmE2MjhkNTMy");
        return Task.where("{0} create lead",
                actor -> actor.attemptsTo(
                        SelectItemOnNavigationBar.select("Quản lý phân phối", "Quản lý lead"),
                        Post.to("/leads/leads/new").with(
                                req -> {
                                    req.contentType(ContentType.JSON);
                                    req.headers(headers);
                                    req.body(leadModel);
                                    req.log().uri();
                                    req.then().log().body();
                                    req.then().log().status();
                                    req.that().log().body();
                                    return req;
                                }
                        ),
                        Ensure.that(StatusResponse.statusResponse()).isEqualTo(200),
                        Ensure.that(BodyResponse.field("httpCode").asString()).isEqualTo("200"),
                        Ensure.that(BodyResponse.field("id").asString()).isNotEmpty()
                ));
    }
}
