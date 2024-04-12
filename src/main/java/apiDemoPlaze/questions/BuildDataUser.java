package apiDemoPlaze.questions;

import apiDemoPlaze.models.UserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static apiDemoPlaze.util.Constant.*;


public class BuildDataUser implements Question<UserModel> {

    private final Integer test;

    public BuildDataUser(Integer test) {
        this.test = test;
    }

    @Override
    public UserModel answeredBy(Actor actor) {
        if (test.equals(2)){
            return UserModel.builder()
                    .username(username)
                    .password(wrongPassword)
                    .build();

        }else {
            return UserModel.builder()
                    .username(username)
                    .password(password)
                    .build();
        }

    }

    public static BuildDataUser was(Integer test){
        return new BuildDataUser(test);
    }
}
