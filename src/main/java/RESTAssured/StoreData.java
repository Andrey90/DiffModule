package RESTAssured;

import com.jayway.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.get;

/**
 * Created by luchk on 31.01.2017.
 */
public class StoreData {
    @Test
    public void getStore() throws JSONException {
// выполняем запрос get для доступа ко всем параметрам ответа
        Response resp = get("http://restcountries.eu/rest/v1/name/ukraine");

        resp.prettyPrint();
        JSONArray jsonResponse = new JSONArray(resp.asString());

        System.out.println(jsonResponse);

        // получение параметра capital (столицы Норвегии)
        String capital = jsonResponse.getJSONObject(0).getString("nativeName");

        // проверка, что столицей является Осло
        Assert.assertEquals(capital, "Україна");
    }
}
