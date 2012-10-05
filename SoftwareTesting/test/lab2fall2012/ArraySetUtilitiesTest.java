/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2fall2012;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher
 */
public class ArraySetUtilitiesTest {
    
    public ArraySetUtilitiesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Size Match test for CreateSet Method
     * Expected: Pass
     */
    @Test(timeout=5000)
    public void testCreateSetSizeMatch() {
        System.out.println("createSet Size Test");
        int size = 10;
        int minimum = 1;
        int maximum = 10;
        boolean uniqueElements = false;
        
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, minimum, maximum, uniqueElements);
        
        int expResult = size;
        int result = arrayToCheck.size();
        assertEquals(expResult, result);
    }

    /**
     * Test minimum boundary can be met in createSet method
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testCreateSetMinBoundary() {
        System.out.println("createSet Minimum Boundary Test");
        int size = 100;
        int min = 1;
        int max = 5;
        boolean unique = false;
        
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, min, max, unique);
        
        boolean result = false;
        boolean expectedResult = true;
        
        for(int i = 0; i < arrayToCheck.size(); i++) {
            if(arrayToCheck.get(i) == min) {
                result = true;
            }
        }
        assertEquals(expectedResult, result);
    }
 
    /**
     * Test that set contains 1 less than the maximum boundary as per documentation
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testCreateSetMaxBoundary() {
        System.out.println("createSet Maximum Boundary Test");
        int size = 100;
        int min = 1;
        int max = 5;
        int upperBoundary = max - 1;
        boolean unique = false;
        
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, min, max, unique);
        
        boolean result = false;
        boolean expectedResult = true;
        
        for(int i = 0; i < arrayToCheck.size(); i++) {
            if(arrayToCheck.get(i) == upperBoundary) {
                result = true;
            }
        }
        assertEquals(expectedResult, result);
    }
    
    /**
     * 
     */
    @Test(timeout=5000)
    public void testCreateSetUniqueArray() {
        System.out.println("createSet unique array");
        int size = 7;
        int min = 1;
        int max = 10;
        boolean unique = true;
        
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, min, max, unique);
        
        boolean expectedResult = true;
        boolean result = true;
        
        for(int i = 0; i < arrayToCheck.size(); i++) {
            System.out.println(arrayToCheck.get(i));
            for(int j = i + 1; j < arrayToCheck.size() && result; j++) {
                result = arrayToCheck.get(i) != arrayToCheck.get(j);
            }
        }
        
        assertEquals(expectedResult, result);
    }
    
    /**
     * Test when creating the array with a minimum value greater than the
     * maximum value
     * Expected Result: 
     */
    @Test(timeout=5000)
    public void testCreateSetMinGreaterThanMax() {
        System.out.println("createSet minimum is greater than maximum test");
        int size = 10;
        int min = 5;
        int max = 1;
        boolean unique = false;
        
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, min, max, unique);
        
        boolean expectedResults = true;
        boolean results = true;
        
        for(int i = 0; i < arrayToCheck.size(); i++) {
            int checkValue = (int) arrayToCheck.get(i);
            System.out.println(checkValue);
            if(checkValue > min || checkValue < max) {
                results = false;
            }
        }
        
        assertEquals(expectedResults, results);
    }
    
    /**
     * Test of isUnique method, of class ArraySetUtilities.
     */
    @Test
    public void testIsUnique() {
        System.out.println("isUnique");
        ArrayList<Integer> arraySet = null;
        boolean expResult = false;
        boolean result = ArraySetUtilities.isUnique(arraySet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of intersection method, of class ArraySetUtilities.
     */
    @Test
    public void testIntersection() {
        System.out.println("intersection");
        ArrayList<Integer> setA = null;
        ArrayList<Integer> setB = null;
        ArrayList expResult = null;
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Basic test of Union Method
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testUnionBasic() {
        System.out.println("Union Basic");
        ArrayList<Integer> A = new ArrayList(Arrays.asList(1,2,3));
        ArrayList<Integer> B = new ArrayList(Arrays.asList(3,4,5));
        ArrayList expResult = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList result = ArraySetUtilities.union(A, B);
        assertEquals(expResult, result);
    }

    /**
     * Advanced Test of Union Method
     * Expected Results: Pass
     */
    @Test(timeout=5000)
    public void testUnionAdvanced() {
        System.out.println("Union Advanced");
        ArrayList<Integer> A = new ArrayList(Arrays.asList(1,1,1,88,1,1,1,2,3));
        ArrayList<Integer> B = new ArrayList(Arrays.asList(6,88,-2,2));
        ArrayList expResult = new ArrayList(Arrays.asList(1,88,2,3,6,-2));
        ArrayList result = ArraySetUtilities.union(A, B);
        assertEquals(expResult, result);
    }
    
    /**
     * Test for no results of Union Method
     * Expected result: Pass
     */
    @Test(timeout=5000)
    public void testNoUnion() {
        System.out.println("No Union Test");
        ArrayList<Integer> A = new ArrayList(Arrays.asList(1,1,1,1,1));
        ArrayList<Integer> B = new ArrayList(Arrays.asList(1,1,1,1,1));
        
        ArrayList expResult = new ArrayList(Arrays.asList(1));
        ArrayList result = ArraySetUtilities.union(A, B);
        
        assertEquals(expResult, result)        ;
    }
    
    /**
     * Exception Test for Union Method - Set A Null
     * Expected Result: Pass
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testUnionNullArrayA() {
        ArrayList<Integer> A = null;
        ArrayList<Integer> B = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.union(A, B);
        fail("Expected exception not thrown");
    }
    
    /**
     * Exception Test for Union Method - Set B Null
     * Expected Result: Pass
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testUnionNullArrayB() {
        System.out.println("un");
        ArrayList<Integer> A = new ArrayList(Arrays.asList(3,4,5));
        ArrayList<Integer> B = null;
        ArrayList expResult = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList result = ArraySetUtilities.union(A, B);
        fail("Expected exception not thrown");
    }
    
    /**
     * Test of subSet method, of class ArraySetUtilities.
     */
    @Test
    public void testSubSet() {
        System.out.println("subSet");
        ArrayList<Integer> setA = null;
        ArrayList<Integer> setB = null;
        boolean expResult = false;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
