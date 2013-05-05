
package math;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import math.Math;

/**
 * Test class for Math.
 */ 
public class MathTest
{
    /**
     * Initialise test suite.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Clean up test suite.
     */
    @After
    public void tearDown()
    {
    }
   
    /**
     * Test sum(1, 0).
     */
    @Test
    public void testSum10()
    {
        assertTrue(1 == Math.sum(1, 0));
    }

    /**
     * Test sum(0, 1).
     */
    @Test
    public void testSum01()
    {
        assertEquals(1, Math.sum(0, 1));
    }
}
