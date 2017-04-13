package it.simonecasamassa.projectEuler;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PalindromeTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PalindromeTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PalindromeTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	assertFalse(Palindrome.isPalindrome("abap"));
    	assertFalse(Palindrome.isPalindrome("ap"));
    	assertFalse(Palindrome.isPalindrome("fjsdkljasdkj"));
    	assertTrue(Palindrome.isPalindrome("a"));
    	assertTrue(Palindrome.isPalindrome("hh"));
    	assertTrue(Palindrome.isPalindrome("klolk"));
    	assertTrue(Palindrome.isPalindrome("qwerttrewq"));
    	assertTrue( true );
    }
}
