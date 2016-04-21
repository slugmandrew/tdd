package math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Drew Spencer
 */
public class FractionEqualsTest
{
    @Test
    public void sameNumeratorAndDenominator() throws Exception
    {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }

    @Test
    public void differentNumerators() throws Exception
    {
        assertNotEquals(new Fraction(1, 5), new Fraction(2, 5));
    }

    @Test
    public void differentDenominators() throws Exception
    {
        assertNotEquals(new Fraction(3, 4), new Fraction(3, 7));
    }

    @Test
    public void wholeNumbersEqualsSameFraction() throws Exception
    {
        assertEquals(new Fraction(5, 1), new Fraction(5));
    }

    @Test
    public void wholeNumberNotEqualToWholeNumber() throws Exception
    {
        assertNotEquals(new Fraction(6), new Fraction(2));
    }

    @Test
    public void negativeDenominator() throws Exception
    {
        assertEquals(new Fraction(1, 2), new Fraction(-1, -2));
        assertEquals(new Fraction(-1, 2), new Fraction(1, -2));
    }
}
