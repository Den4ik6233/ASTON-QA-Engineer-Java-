import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

public class EchoTests {

    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = when()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .extract()
                .response();

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("args.foo1"), "bar1");
        assertEquals(response.jsonPath().get("args.foo2"), "bar2");
    }

    @Test
    public void testPostRawTextRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given()
                .header("Content-Type", "text/plain")
                .body("{\"test\": \"value\"}")
                .when()
                .post("/post")
                .then()
                .extract()
                .response();

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("data"), "{\"test\": \"value\"}");
    }

    @Test
    public void testPostFormDataRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given()
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .extract()
                .response();

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().get("form.foo1"), "bar1");
        assertEquals(response.jsonPath().get("form.foo2"), "bar2");
    }


    @Test
    public void testPutRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = when()
                .put("/put")
                .then()
                .extract()
                .response();

        assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void testPatchRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given()
                .header("Content-Type", "text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .patch("/patch")
                .then()
                .extract()
                .response();

        assertEquals(response.getStatusCode(), 200);
    }


    @Test
    public void testDeleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given()
                .header("Content-Type", "text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete")
                .then()
                .extract()
                .response();

        assertEquals(response.getStatusCode(), 200);
    }

}
