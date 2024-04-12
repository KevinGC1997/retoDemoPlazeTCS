package apiDemoPlaze.stepDefinitions;

import apiDemoPlaze.questions.ResponsePost;
import apiDemoPlaze.questions.StatusCode;
import apiDemoPlaze.tasks.PostApi;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ApiDemoPlazeStepDefintion {

    private EnvironmentVariables enviromentVariables;
    Actor user= Actor.named("user");

    @Before
    public void setUpBaseUrl(){
        String theRestApiBaseUrl = enviromentVariables.optionalProperty("restApi.baseurl")
                .orElse("https://api.demoblaze.com");
        user.whoCan(CallAnApi.at(theRestApiBaseUrl));
    }

    @When("I consume the endpoint {int}{string}")
    public void iConsumeTheEndpointAndISendTheUserInformationUserNamePassword(Integer test, String endPoint) {
        user.attemptsTo(
                PostApi.Post(test, endPoint)
        );
    }
    @Then("I can validate the response service {int} and {string}")
    public void iCanValidateTheResponseServiceAnd(Integer code, String message) {
        switch (message) {
            case "Wrong password.":
            case "This user already exist.":
                user.should(
                        seeThat(
                                "The response was", StatusCode.was(), equalTo(code)
                        ),
                        seeThat(
                                "The message is successfully",
                                res -> ResponsePost.was().answeredBy(user).getErrorMessage(),
                                equalTo(message)
                        )
                );
                break;
            default:
                user.should(
                        seeThat(
                                "The response was", StatusCode.was(), equalTo(code)
                        )
                );

        }

    }


}
