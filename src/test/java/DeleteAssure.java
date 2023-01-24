import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class DeleteAssure
{
    @Test
    public void deleteAssure()
    {
        RestAssured.when().
                delete(" https://70ssu4a992.execute-api.us-west-2.amazonaws.com/items/123").
                then().
                statusCode(200).
                log().all();

    }
}
