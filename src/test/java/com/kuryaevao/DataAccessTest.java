package com.kuryaevao;

import io.restassured.internal.util.IOUtils;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataAccessTest {

    @Test
    void Number1ToWordTest() throws Exception {

        InputStream is = DataAccessTest.class.getClassLoader().getResourceAsStream("NumberToWordRequest.xml");
        final String request = new String(IOUtils.toByteArray(is));

        Response response = given()
                .header("Content-Type", "text/xml")
                .and()
                .body(request)
                .when()
                .post("https://www.dataaccess.com/webservicesserver/numberconversion.wso")
                .then()
                //.statusCode(200)
                .extract().response();

        System.out.println(response.asString());
        assertTrue(response.asString().contains("one"));
    }
}
