package math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Drew Spencer
 */
public class GreatestCommonDivisorTest
{
    @Test
    public void reflexive() throws Exception
    {
        assertEquals(1, Utils.gcd(1, 1));
        assertEquals(2, Utils.gcd(2, 2));
        assertEquals(1, Utils.gcd(-1, -1));
    }

    @Test
    public void relativelyPrime() throws Exception
    {
        assertEquals(1, Utils.gcd(2, 3));
        assertEquals(1, Utils.gcd(7, 4));
        assertEquals(1, Utils.gcd(-2, -3));
    }

    @Test
    public void oneIsMultiplierOfTheOther() throws Exception
    {
        assertEquals(3, Utils.gcd(3, 9));
        assertEquals(4, Utils.gcd(4, 400));
        assertEquals(5, Utils.gcd(5, 30));
    }

    @Test
    public void commonFactor() throws Exception
    {
        assertEquals(2, Utils.gcd(6, 8));
        assertEquals(7, Utils.gcd(49, 315));
        assertEquals(4, Utils.gcd(-24, 28));
    }


}
