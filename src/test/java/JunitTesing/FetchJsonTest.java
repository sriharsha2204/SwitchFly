package JunitTesing;

import Json.FetchJson;
import org.junit.Assert;
import org.junit.Test;

public class FetchJsonTest {

    @Test
    public void fetchEquals() throws Exception // check if No. of letters in a sentence is as expected or not
    {
        FetchJson json=new FetchJson();
        Assert.assertEquals(16,json.fetch());
    }
    @Test
    public void fetchNotEquals() throws Exception
    {
        FetchJson json= new FetchJson();
        Assert.assertNotEquals(10,json.fetch());
    }
}
