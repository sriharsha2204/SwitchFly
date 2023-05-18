/** Find no. of digits in a Number **/

package JunitTesing;

import JunitTesting.CountDigits;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class CountDigitsTest {


    private static CountDigits countDigits;
    private static List<Integer> numbers;

    @BeforeClass
    public static void setUp()
    {
        countDigits=new CountDigits();
        numbers=new ArrayList<>();
        numbers.add(0,14325);
        numbers.add(1,7552);
    }
    @Test
    public void testCountEquals()
    {
        Assert.assertEquals(4,countDigits.count(numbers.get(1)));
    }
    @Test
    public void testCountNotEquals()
    {
        Assert.assertNotEquals(4,countDigits.count(numbers.get(0)));
    }
    @Test
    public void testIsOdd() // is no. of digits in Number is Odd or Not
    {
        Assert.assertTrue(countDigits.isOdd(33422));
    }

    @Test
    public void testIsNotOdd()
    {
        Assert.assertFalse(countDigits.isOdd(3422));
    }

}
