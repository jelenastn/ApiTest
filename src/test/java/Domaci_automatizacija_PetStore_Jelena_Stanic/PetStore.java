package Domaci_automatizacija_PetStore_Jelena_Stanic;

import Domaci_automatizacija_PetStore_Jelena_Stanic.files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static Domaci_automatizacija_PetStore_Jelena_Stanic.files.payload.AddPet;
import static io.restassured.RestAssured.given;
import org.testng.Assert;

public class PetStore {

   @Test
    public void AddNewPet(){
       RestAssured.baseURI = "https://petstore.swagger.io/v2";
       given().log().all()
               .header("Content-Type", "application/json")
               .body("{\n" +
                       "  \"id\": 333,\n" +
                       "  \"category\": {\n" +
                       "    \"id\": 2,\n" +
                       "    \"name\": \"cat\"\n" +
                       "  },\n" +
                       "  \"name\": \"Masa\",\n" +
                       "  \"photoUrls\": [\n" +
                       "    \"string\"\n" +
                       "  ],\n" +
                       "  \"tags\": [\n" +
                       "    {\n" +
                       "      \"id\": 0,\n" +
                       "      \"name\": \"string\"\n" +
                       "    }\n" +
                       "  ],\n" +
                       "  \"status\": \"available\"\n" +
                       "}")
               .when().post("/pet")
               .then().log().all()
               .assertThat().statusCode(200);
   }

   @Test
    public void AddNewPetWithPayload(){
       RestAssured.baseURI = "https://petstore.swagger.io/v2";
       given().log().all()
               .header("Content-Type", "application/json")
               .body(AddPet())
               .when().post("/pet")
               .then().log().all()
               .assertThat().statusCode(200);
   }
    @Test
    public void GetPetById() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/pet/111")
                .then().log().all()
                 .assertThat().statusCode(200);
    }
    @Test
    public void DeletePetById(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .when().delete("/pet/111")
                .then().log().all()
                .assertThat().statusCode(200);
    }

@Test
public void GetPetByIdJson() {
    RestAssured.baseURI = "https://petstore.swagger.io/v2";
    String response = given().log().all()
            .header("Content-Type", "application/json")
            .body(payload.AddPet2())
            .when().post("/pet")
            .then().log().all()
            .assertThat().statusCode(200)
            .extract().response().asString();
    JsonPath js = new JsonPath(response);
    String id = js.getString("id");

    String response1 = given().log().all()
            .when().get("/pet/" + id)
            .then().log().all()
            .assertThat().statusCode(200)
            .extract().response().asString();

    JsonPath js1 = new JsonPath(response1);
    String name = js1.getString("name");
    String status = js1.getString("status");


    Assert.assertEquals(name, "Bella");
    Assert.assertEquals(status, "available");


}
    @Test
    public void GetInventory(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/store/inventory")
                .then().log().all()
                .assertThat().statusCode(200);
    }


  /*  @Test
    public void CreateOrder(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .header("Content-Type", "application/json")
                .body(OrderPet())
                .when().post("/store/order")
                .then().log().all()
                .assertThat().statusCode(200);
    }*/

    @Test
    public void GetOrderById(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .when().get("/store/order/3")
                .then().log().all()
                .assertThat().statusCode(200);
    }
    @Test
    public void DeleteOrderById(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        given().log().all()
                .when().delete("/store/order/7")
                .then().log().all()
                .assertThat().statusCode(200);
    }

    }






