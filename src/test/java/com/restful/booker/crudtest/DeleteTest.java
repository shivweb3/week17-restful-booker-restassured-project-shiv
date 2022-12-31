package com.restful.booker.crudtest;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteTest extends TestBase{
    @Test
    public void getSingleBookingID() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token=8c10069b16fb2e6")
                .pathParam("id", 111)
                .when().delete("{id}");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
