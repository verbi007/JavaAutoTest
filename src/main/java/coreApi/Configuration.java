package coreApi;

import io.restassured.RestAssured;

import java.io.IOException;

public class Configuration {

    public void  initRestAssured(String fileProperties) throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream(fileProperties));
//        RestAssured.authentication = RestAssured.basic(System.getProperty("username"), System.getProperty("password")) ;
        RestAssured.baseURI = System.getProperty("url");
    }
}
