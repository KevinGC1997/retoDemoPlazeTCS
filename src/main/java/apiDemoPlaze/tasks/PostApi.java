package apiDemoPlaze.tasks;

import apiDemoPlaze.models.UserModel;
import apiDemoPlaze.questions.BuildDataUser;
import io.restassured.http.ContentType;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostApi implements Task {

    private final Integer test;
    private final String endpoint;


    public PostApi(Integer test, String endpoint) {
        this.test = test;
        this.endpoint = endpoint;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        UserModel userModel = actor.asksFor(BuildDataUser.was(test));

        actor.attemptsTo(
                Post.to(endpoint).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(userModel)
                )
        );

    }

    public static PostApi Post(Integer test, String endpoint){
        return Instrumented.instanceOf(PostApi.class).withProperties(test, endpoint);
    }
}
