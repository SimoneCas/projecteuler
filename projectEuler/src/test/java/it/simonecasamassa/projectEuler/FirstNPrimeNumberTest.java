package it.simonecasamassa.projectEuler;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FirstNPrimeNumberTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FirstNPrimeNumberTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FirstNPrimeNumberTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	List<Long> listPrimeNumbers = new ArrayList<Long>();
    	listPrimeNumbers = FirstNPrimeNumber.getFirstNPrimeNumber(5);
        assertEquals(2, listPrimeNumbers.get(0).intValue());
        assertEquals(3, listPrimeNumbers.get(1).intValue());
        assertEquals(5, listPrimeNumbers.get(2).intValue());
        assertEquals(7, listPrimeNumbers.get(3).intValue());
        assertEquals(11, listPrimeNumbers.get(4).intValue());
    	assertTrue( true );
    }
}
