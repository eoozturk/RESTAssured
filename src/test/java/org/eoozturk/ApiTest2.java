package org.eoozturk;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTest2 {

    @Test
    public void postMethod(){

        String data = "{\n" +
                " \"name\": \"morpheus\", \n" +
                " \"job\": \"leader\"\n" +
                "}";

        given().
                contentType(ContentType.JSON).
                body(data).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201);
    }
}
