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
        assertEquals(1, NumberTheory.gcd(1, 1));
        assertEquals(2, NumberTheory.gcd(2, 2));
        assertEquals(1, NumberTheory.gcd(-1, -1));
    }

    @Test
    public void relativelyPrime() throws Exception
    {
        assertEquals(1, NumberTheory.gcd(2, 3));
        assertEquals(1, NumberTheory.gcd(7, 4));
        assertEquals(1, NumberTheory.gcd(-2, -3));
    }

    @Test
    public void oneIsMultiplierOfTheOther() throws Exception
    {
        assertEquals(3, NumberTheory.gcd(3, 9));
        assertEquals(4, NumberTheory.gcd(4, 400));
        assertEquals(5, NumberTheory.gcd(5, 30));
    }

    @Test
    public void commonFactor() throws Exception
    {
        assertEquals(2, NumberTheory.gcd(6, 8));
        assertEquals(7, NumberTheory.gcd(49, 315));
        assertEquals(4, NumberTheory.gcd(-24, 28));
    }


}
