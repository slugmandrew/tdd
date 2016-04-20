import math.Fraction;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Drew Spencer
 */
public class AddFractionsTest
{
    @Test
    public void zeroPlusZero() throws Exception
    {
        Fraction sum = new Fraction(0).plus(new Fraction(0));

        Assert.assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception
    {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));

        assertEquals(3, sum.intValue());
    }

    @Test
    public void zeroPlusNonZero() throws Exception
    {
        final Fraction sum = new Fraction(0).plus(new Fraction(5));

        assertEquals(5, sum.intValue());

    }

    @Test
    public void nonZeroNonNegativeOperands() throws Exception
    {
        Fraction sum = new Fraction(3).plus(new Fraction(4));

        assertEquals(7, sum.intValue());
    }
}
