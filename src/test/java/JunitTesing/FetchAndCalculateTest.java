package JunitTesing;

import Json.Calculation;
import Json.FetchAndCalculate;
import Json.FetchJson;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class FetchAndCalculateTest {

    @Test
    public void fetchAndCalculateTest() throws Exception {
        FetchJson json = Mockito.mock(FetchJson.class);
        Mockito.when(json.fetch()).thenReturn("title");
        Calculation calculation = new Calculation();
        FetchAndCalculate fetchAndCalculate = new FetchAndCalculate(json, calculation);
        int charLength = fetchAndCalculate.getAndProcess();
        Assert.assertEquals(5, charLength);
    }
}
