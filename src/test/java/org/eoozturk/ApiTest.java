package org.eoozturk;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.apache.commons.codec.digest.UnixCrypt.body;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class ApiTest {

    @Test
    public void Test(){

        when()
                .get("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .time(lessThan(2000L))
                .body("data.id", equalTo(2));
    }

    @Test
    public void Test2(){

        RestAssured.baseURI = "https://reqres.in";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.get("/api/users/2");
        ResponseBody body = response.getBody();
        String bodyString = body.asString();
        System.out.println(bodyString);
    }
}
