package JunitTesing;

import Json.Calculation;
import junit.framework.Assert;
import org.junit.Test;

public class CalculationTest {


    @Test
    public void charLength() {
        String title = "charlength";
        Calculation calculation = new Calculation();
        Assert.assertEquals(10, calculation.charLength(title));
    }
}
