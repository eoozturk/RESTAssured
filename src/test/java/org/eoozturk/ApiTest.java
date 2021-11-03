package org.eoozturk;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class ApiTest {

    @Test
    public void Test(){

        when()
                .get("https://reqres.in/api/users/2")
                .then().statusCode(200);
    }
}
