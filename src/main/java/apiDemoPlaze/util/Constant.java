package apiDemoPlaze.util;

import io.cucumber.java.an.Dada;

import java.util.List;

public class Constant {

    static List<String> DataTest = GenerateData.data();

    public static final String username = DataTest.get(0);
    public static final String password = DataTest.get(1);
    public static final String wrongPassword = "password";
}
