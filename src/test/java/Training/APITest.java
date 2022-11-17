package Training;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITest {
    @Test
    public void getCategory() {
        String endPoint = "http://localhost:80/APITESTING/api_testing/category/read.php";
        var response = given().when()
                .get(endPoint).then();
        response.log().body();
    }

    @Test
    public void getProduct() {
        String endPoint = "http://localhost:80/apitesting/api_testing/product/read_one.php";
        var response = given().
                queryParam("id", 2).
                when().
                get(endPoint).then();
        response.log().body();
    }
}
