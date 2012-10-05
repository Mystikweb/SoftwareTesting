/**
 * <p><strong>Statement of Authorship</strong><br />
 * <strong style="color: red">
 * I Christopher Hair, 000243034 certify that this material is my 
 * original work. No other person's work has been used without suitable
 * acknowledgment and I have not made my work available to anyone else.
 * </strong></p>
 * 
 * <pre>
 * File: ArraySetUtilitiesTest.java
 * Date: 10/05/12
 * Author: Christopher Hair
 * Student ID: 000243034
 * </pre>
 *
 * <h2 style="color: blue">Description:</h2>
 * <p>Utility Class used to provide comparisons using Math Set Theory</p>
 * 
 * @author Christopher Hair
 * @author Student ID 000243034 
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
     * Test createSet for basic pass results
     * Expected: Pass
     */
    @Test(timeout=5000)
    public void testCreateSetBasic() {
        System.out.println("Test createSet for basic results");
        int size = 10;
        int minimum = 1;
        int maximum = 5;
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
     * Test for creating sets where the size of the set is larger than the
     * maximum boundary when unique is set to true
     * Expected Result: Fail
     */
    @Test(timeout=5000)
    public void testCreateSetUniqueSizeBigger() {
        System.out.println("createSet unique array");
        int size = 10;
        int min = 1;
        int max = 5;
        boolean unique = true;
        
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, min, max, unique);
        
        boolean expectedResult = false;
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
     * Test to create unique set when the max boundary is larger than the
     * set size.
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testCreateSetUniqueMaxBigger() {
        System.out.println("createSet unique array");
        int size = 5;
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
     * Basic isUnique test for returning true result
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testIsUniqueBasicTrue() {
        System.out.println("Test isUnique Basic True results");
        ArrayList<Integer> arraySet = new ArrayList(Arrays.asList(1,2,3,4,5));
        boolean expResult = true;
        boolean result = ArraySetUtilities.isUnique(arraySet);
        assertEquals(expResult, result);
    }
    
    /**
     * Basic isUnique test for returning false result
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testIsUniqueBasicFalse() {
        System.out.println("Test isUnique Basic False results");
        ArrayList<Integer> arraySet = new ArrayList(Arrays.asList(1,1,2,3,4));
        boolean expResult = false;
        boolean result = ArraySetUtilities.isUnique(arraySet);
        assertEquals(expResult, result);
    }
    
    /**
     * Basic isUnique for a false result when array is null
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testIsUniqueNullArray() {
        System.out.println("Test isUnique returns false from null array");
        ArrayList<Integer> arraySet = null;
        boolean expResult = false;
        boolean result = ArraySetUtilities.isUnique(arraySet);
        assertEquals(expResult, result);
    }

    /**
     * Basic isUnique test exception with empty array
     * Expected Result: Pass
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testIsUniqueEmptyArray() {
        System.out.println("Test isUnique reporting an exception for empty array");
        ArrayList<Integer> arraySet = new ArrayList();
        boolean expResult = false;
        boolean result = ArraySetUtilities.isUnique(arraySet);
        fail("Exception not thrown for empty array");
    }
    
    /**
     * Test intersection for a basic passing result
     * Expected: Pass
     */
    @Test(timeout=5000)
    public void testIntersectionBasic() {
        System.out.println("Test intersection for basic pass");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(3,4,5,6,7));
        ArrayList expResult = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        assertEquals(expResult, result);
    }

    /**
     * Test intersection for a no intersection - 0 length array
     * Expected: Pass
     */
    @Test(timeout=5000)
    public void testIntersectionNotEqual() {
        System.out.println("Test intersection with no intersection - return empty array");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(6,7,8,9,0));
        ArrayList expResult = new ArrayList();
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        assertEquals(expResult, result);
    }
    
    /**
     * Test intersection for a exception on setA null
     * Expected: Pass
     */
    @Test(timeout=5000,expected=IllegalArgumentException.class)
    public void testIntersectionNullSetA() {
        System.out.println("Test intersection for exception on null setA");
        ArrayList<Integer> setA = null;
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(3,4,5,6,7));
        ArrayList expResult = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        fail("Exception not thrown for setA null");
    }
    
    /**
     * Test intersection for a exception on setA null
     * Expected: Pass
     */
    @Test(timeout=5000,expected=IllegalArgumentException.class)
    public void testIntersectionNullSetB() {
        System.out.println("Test intersection for exception on null setB");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(3,4,5,6,7));
        ArrayList<Integer> setB = null;
        ArrayList expResult = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        fail("Exception not thrown for setA null");
    }
    
    /**
     * Test intersection for a exception on setA null
     * Expected: Pass
     */
    @Test(timeout=5000,expected=IllegalArgumentException.class)
    public void testIntersectionEmptySetA() {
        System.out.println("Test intersection for exception on empty setA");
        ArrayList<Integer> setA = new ArrayList();
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(3,4,5,6,7));
        ArrayList expResult = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        fail("Exception not thrown for setA null");
    }
    
    /**
     * Test intersection for a exception on setA null
     * Expected: Pass
     */
    @Test(timeout=5000,expected=IllegalArgumentException.class)
    public void testIntersectionEmptySetB() {
        System.out.println("Test intersection for exception on empty setB");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(3,4,5,6,7));
        ArrayList<Integer> setB = new ArrayList();
        ArrayList expResult = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        fail("Exception not thrown for setA null");
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
    public void testUnionNoUnion() {
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
     * Test of subSet method, basic pass of setB as subset of setA
     * Expected: Pass
     */
    @Test(timeout=5000)
    public void testSubSetBasicTrue() {
        System.out.println("Test subSet basic pass result of setB is subset setA");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(1,2,3));
        boolean expResult = true;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of subSet method, basic pass of setB as subset of setA
     * Expected: Pass
     */
    @Test(timeout=5000)
    public void testSubSetBasicFalse() {
        System.out.println("Test subSet basic pass result of setB is subset setA");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3));
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(4,5,6));
        boolean expResult = false;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of subSet method, basic fail of setA as subset of setB
     * Expected: fail
     */
    @Test(timeout=5000)
    public void testSubSetReverseSets() {
        System.out.println("Test subSet basic pass result of setA is subset setB");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3));
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(1,2,3,4,5));
        boolean expResult = false;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of subSet method, exception for null setA
     * Expected: Pass
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testSubSetBasicNullSetA() {
        System.out.println("Test subSet null setA");
        ArrayList<Integer> setA = null;
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(1,2,3));
        boolean expResult = true;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        fail("Exception not thrown for null setA");
    }
    
    /**
     * Test of subSet method, exception for null setB
     * Expected: Pass
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testSubSetBasicNullSetB() {
        System.out.println("Test subSet null setB");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3));
        ArrayList<Integer> setB = null;
        boolean expResult = true;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        fail("Exception not thrown for null setA");
    }
}
