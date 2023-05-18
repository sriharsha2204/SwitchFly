package JunitTesing;

import Json.Calculation;
import junit.framework.Assert;
import org.junit.Test;

public class CalculationTest {


    /**
     * Counts No. of letters in a sentence
     */
    @Test
    public void charLength() {
        String title = "Calculation Test";
        Calculation calculation = new Calculation();
        Assert.assertEquals(15, calculation.charLength(title));
    }
}
