package math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Drew Spencer
 */
public class ReduceFractionTest
{
    @Test
    public void alreadyInLowestTerms() throws Exception
    {
        assertEquals(new Fraction(3, 4), new Fraction(3, 4));
    }

    @Test
    public void reduceToNotWholeNumber() throws Exception
    {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));
    }

    @Test
    public void reduceToWholeNumber() throws Exception
    {
        assertEquals(new Fraction(6), new Fraction(24, 4));
    }

    @Test
    public void reduceZero() throws Exception
    {
        assertEquals(new Fraction(0), new Fraction(0, 1231321));
    }


}
