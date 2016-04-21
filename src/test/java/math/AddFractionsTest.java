package math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Drew Spencer
 */
public class AddFractionsTest
{
    private void checkAddFractionsAsIntegers(int addend, int augend, int expectedResult)
    {
        assertEquals(expectedResult, new Fraction(addend).plus(new Fraction(augend)).intValue());
    }

    @Test
    public void zeroPlusZero() throws Exception
    {
        checkAddFractionsAsIntegers(0, 0, 0);
    }

    @Test
    public void nonZeroPlusZero() throws Exception
    {
        checkAddFractionsAsIntegers(3, 0, 3);
    }

    @Test
    public void zeroPlusNonZero() throws Exception
    {
        checkAddFractionsAsIntegers(0, 5, 5);
    }

    @Test
    public void nonZeroNonNegativeOperands() throws Exception
    {
        checkAddFractionsAsIntegers(3, 4, 7);
    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception
    {
        checkAddFractionsAsIntegers(-3, 1, -2);
    }

    @Test
    public void nonTrivialButCommonDenominator() throws Exception
    {
        assertEquals(new Fraction(3, 5), new Fraction(1, 5).plus(new Fraction(2, 5)));
    }

    @Test
    public void differentDenominatorsWithoutReducing() throws Exception
    {
        assertEquals(new Fraction(5, 6), new Fraction(1, 2).plus(new Fraction(1, 3)));
    }

}
