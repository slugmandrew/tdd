import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Drew Spencer
 */
public class AddFractionsTest
{
    @Test
    public void failTest()
    {
        fail("not yet implemented");
    }

    @Test
    public void zeroPlusZero() throws Exception
    {
        Fraction sum = new Fraction(0).plus(new Fraction(0));

        Assert.assertEquals(0, sum.intValue());
    }


    class Fraction
    {

        public Fraction(int intValue)
        {

        }

        public Fraction plus(Fraction input)
        {
            return this;
        }

        public int intValue()
        {
            return 0;
        }
    }


    @Test
    public void passTest() throws Exception
    {
        assertTrue(true);
    }

}
