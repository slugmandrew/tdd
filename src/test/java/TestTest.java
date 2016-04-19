import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Drew Spencer
 */
public class TestTest
{
    @Test
    public void failTest()
    {
        fail("not yet implemented");
    }


    @Test
    public void passTest() throws Exception
    {
        assertTrue(true);
    }

}
