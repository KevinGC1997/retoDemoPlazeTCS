package apiDemoPlaze.util;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class GenerateData {

    public static List<String> data() {

        Faker faker = new Faker();
        String username = faker.name().username().substring(1, 10);
        String password = faker.internet().password(3, 5, true);


        List<String> datos = new ArrayList<String>();
        datos.add(username);
        datos.add(password);


        return datos;
    }
}
