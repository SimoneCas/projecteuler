package it.simonecasamassa.projectEuler;

import java.util.List;

import junit.framework.TestCase;

public class PythagoreanTripletGeneratorTest extends TestCase {

	public void testApp()
    {
		PythagoreanTripletGenerator calculator = new PythagoreanTripletGenerator(26);
    	List<int[]> result = calculator.getPythagoreanTriplets();
        assertEquals(1, result.size());
    	assertEquals(3, result.get(0)[0]);
    	assertEquals(4, result.get(0)[1]);
    	assertEquals(5, result.get(0)[2]);
    }
}
