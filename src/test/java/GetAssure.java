import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class GetAssure {
    @Test
    void testGet_1() {
        Response response = RestAssured.get("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items/2");

        System.out.println("==============================");
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test
    public void testGet_2()
    {
        Response response = RestAssured.get("https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items");

        System.out.println("==============================");
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
        Assert.assertEquals(response.getStatusCode(),200);

    }


}


