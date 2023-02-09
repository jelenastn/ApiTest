import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class bookerAPI2 {
    @Test
    public void PingCheckTest(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
        given().log().all(). when().get("/ping").then().log().all().assertThat().statusCode(201);
    }
    @Test
    public void GetAllBookings() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        given().log().all()
                .when().get("/booking")
                .then().log().all()
                .assertThat().statusCode(200);
    }
    @Test
    public void CreateBooking(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        given().log().all()
                .header("Content-Type", "application/json" )
                .body("" +
                        "{\n"  +
                        "                        \"firstname\" : \"Dragoljub\",\n" +
                        "                        \"lastname\" : \"Boranijasevic\",\n" +
                        "                        \"    \\\"totalprice\\\" : 99,\\n\" +\n" +
                        "                        \"    \\\"depositpaid\\\" : false,\\n\" +\n" +
                        "                        \"    \\\"bookingdates\\\" : {\\n\" +\n" +
                        "                        \"        \\\"checkin\\\" : \\\"2022-01-01\\\",\\n\" +\n" +
                        "                        \"        \\\"checkout\\\" : \\\"2023-01-01\\\"\\n\" +\n" +
                        "                        \"    },\\n\" +\n" +
                        "                        \"    \\\"additionalneeds\\\" : \\\"Dinner\\\"\\n\" +\n" +
                        "                        \"}");
    }
}
