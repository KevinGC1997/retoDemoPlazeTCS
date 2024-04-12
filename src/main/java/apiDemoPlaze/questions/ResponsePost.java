package apiDemoPlaze.questions;

import apiDemoPlaze.models.ResponsePostModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ResponsePost implements Question<ResponsePostModel> {

    @Override
    public ResponsePostModel answeredBy(Actor actor) {

        return SerenityRest.lastResponse().as(ResponsePostModel.class);
    }
    public static ResponsePost was(){
        return new ResponsePost();
    }
}
