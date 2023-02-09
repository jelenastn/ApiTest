import io.restassured.RestAssured;
import org.testng.annotations.Test;
import pojo.body;

import static io.restassured.RestAssured.given;

public class BookstoreAPI {
    @Test

    public void CreateUser() {
        body createUserBody = new body();
        createUserBody.setUserName("Random125j01092");
        createUserBody.setPassword("Qwerty123!@#");
        RestAssured.baseURI = "https://demoqa.com";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(createUserBody)
                .log().all()
                .post("Account/v1/User")
                .then().log().all()
                .assertThat().statusCode(201);

    }
}
