package org.eoozturk;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
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
}
