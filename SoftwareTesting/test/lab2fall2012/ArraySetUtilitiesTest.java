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
 * <p>Unit test class for the ArraySetUtilites class</p>
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
     * Perform size test to validate set size matches requested size
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testCreateSetSize() {
        System.out.println("createSet basic size");
        int size = 10;
        int minimum = 1;
        int maximum = 10;
        boolean uniqueElements = false;
        
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, minimum, maximum, uniqueElements);
        
        for(int i = 0; i < arrayToCheck.size(); i++) {
            System.out.println(arrayToCheck.get(i));
        }
        
        int expResult = size;
        int result = arrayToCheck.size();
        assertEquals(expResult, result);
    }

    /**
     * Test to make sure that an exception is thrown when size is set to 0
     * Expected Result: Fail
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testCreateSetZeroSize() {
        System.out.println("createSet basic size");
        int size = 0;
        int minimum = 1;
        int maximum = 10;
        boolean uniqueElements = false;
        
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, minimum, maximum, uniqueElements);
        
        for(int i = 0; i < arrayToCheck.size(); i++) {
            System.out.println(arrayToCheck.get(i));
        }
        
        int expResult = size;
        int result = arrayToCheck.size();
        assertEquals(expResult, result);
    }
    
    /**
     * Test to make sure that the random numbers generated are above 
     * the minimum boundary
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testCreateSetMinBoundary() {
        System.out.println("createSet minimum boundary");
        int size = 100;
        int min = 1;
        int max = 5;
        boolean unique = false;
        
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, min, max, unique);
        
        boolean result = false;
        boolean expectedResult = true;
        
        for(int i = 0; i < arrayToCheck.size(); i++) {
            System.out.println(arrayToCheck.get(i));
            if(arrayToCheck.get(i) == min) {
                result = true;
            }
        }
        assertEquals(expectedResult, result);
    }
 
    /**
     * Test to make sure that the random numbers generated are below or 
     * equal to the maximum boundary
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testCreateSetMaxBoundary() {
        System.out.println("createSet maximum boundary");
        int size = 100;
        int min = 1;
        int max = 5;
        int upperBoundary = max - 1;
        boolean unique = false;
        
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, min, max, unique);
        
        boolean result = false;
        boolean expectedResult = true;
        
        for(int i = 0; i < arrayToCheck.size(); i++) {
            System.out.println(arrayToCheck.get(i));
            if(arrayToCheck.get(i) == upperBoundary) {
                result = true;
            }
        }
        assertEquals(expectedResult, result);
    }
    
    /**
     * Boundary check when minimum is larger than maximum which should result
     * in an error being thrown
     * Expected Result: Fail
     */
    @Test(timeout=5000)
    public void testCreateSetMinLarger() {
        int size = 10;
        int min = 10;
        int max = 1;
        boolean unique = false;
        
        boolean expResult = true;
        boolean result = false;
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, min, max, unique);
        
        for(int i = 0; i < arrayToCheck.size(); i++) {
            System.out.println(arrayToCheck.get(i));
            int value = (int) arrayToCheck.get(i);
            if(value >= min || value < max) {
                result = true;
            }
        }
        assertEquals(expResult, result);
    }
    
    /**
     * Boundary validation for when minimum and maximum are equal which should
     * result in an exception for being the same
     * Expected Result: Fail
     */
    @Test(timeout=5000)
    public void testCreateSetSameBoundaries() {
        int size = 10;
        int min = 10;
        int max = 10;
        boolean unique = false;
        
        boolean expResult = true;
        boolean result = false;
        ArrayList arrayToCheck = ArraySetUtilities.createSet(size, min, max, unique);
        
        for(int i = 0; i < arrayToCheck.size(); i++) {
            System.out.println(arrayToCheck.get(i));
            int value = (int) arrayToCheck.get(i);
            if(value >= min || value < max) {
                result = true;
            }
        }
        assertEquals(expResult, result);
    }
    
    /**
     * Test for an exception when the size of the set is larger than the 
     * maximum boundary while the unique flag is set to true
     * Expected Result: Fail
     */
    @Test(timeout=5000)
    public void testCreateSetUniqueSizeBigger() {
        System.out.println("createSet unique array when size is bigger than max");
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
     * Test the unique parameter set true when the maximum boundary is larger 
     * than the size of the set
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testCreateSetUniqueMaxBigger() {
        System.out.println("createSet unique array when max is bigger than size");
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
     * Basic test to find out if a set contains all unique values
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testIsUniqueBasicTrue() {
        System.out.println("isUnique basic true results");
        ArrayList<Integer> arraySet = new ArrayList(Arrays.asList(1,2,3,4,5));
        boolean expResult = true;
        boolean result = ArraySetUtilities.isUnique(arraySet);
        assertEquals(expResult, result);
    }
    
    /**
     * Basic test to find out if the set contains any duplicate values
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testIsUniqueBasicFalse() {
        System.out.println("isUnique basic false results");
        ArrayList<Integer> arraySet = new ArrayList(Arrays.asList(1,1,2,3,4));
        boolean expResult = false;
        boolean result = ArraySetUtilities.isUnique(arraySet);
        assertEquals(expResult, result);
    }
    
    /**
     * Test for false return with a null array set
     * Expected Result: Fail
     */
    @Test(timeout=5000)
    public void testIsUniqueNullArray() {
        System.out.println("isUnique returns false from null array");
        ArrayList<Integer> arraySet = null;
        boolean expResult = false;
        boolean result = ArraySetUtilities.isUnique(arraySet);
        assertEquals(expResult, result);
    }

    /**
     * Test for exception thrown when an empty array
     * Expected Result: Fail
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testIsUniqueEmptyArray() {
        System.out.println("isUnique throw exception for empty array");
        ArrayList<Integer> arraySet = new ArrayList();
        boolean expResult = false;
        boolean result = ArraySetUtilities.isUnique(arraySet);
        fail("isUnique exception not thrown for empty array");
    }
    
    /**
     * Basic test for intersecting sets
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testIntersectionBasic() {
        System.out.println("intersection for basic pass");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(3,4,5,6,7));
        ArrayList expResult = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        assertEquals(expResult, result);
    }

    /**
     * Test for empty array returned when the sets contain no 
     * intersecting values
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testIntersectionNotEqual() {
        System.out.println("intersection with no intersecting values");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(6,7,8,9,0));
        ArrayList expResult = new ArrayList();
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        assertEquals(expResult, result);
    }
    
    /**
     * Test for exception when set A is a null array
     * Expected Result: Fail
     */
    @Test(timeout=5000,expected=IllegalArgumentException.class)
    public void testIntersectionNullSetA() {
        System.out.println("intersection exception for null setA");
        ArrayList<Integer> setA = null;
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(3,4,5,6,7));
        ArrayList expResult = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        fail("intersection exception not thrown for null setA");
    }
    
    /**
     * Test for exception when set B is a null array
     * Expected Result: Fail
     */
    @Test(timeout=5000,expected=IllegalArgumentException.class)
    public void testIntersectionNullSetB() {
        System.out.println("intersection exception for null setB");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(3,4,5,6,7));
        ArrayList<Integer> setB = null;
        ArrayList expResult = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        fail("intersection exception not thrown for null setB");
    }
    
    /**
     * Test for exception when set A is an empty array
     * Expected Result: Fail
     */
    @Test(timeout=5000,expected=IllegalArgumentException.class)
    public void testIntersectionEmptySetA() {
        System.out.println("intersection exception for empty setA");
        ArrayList<Integer> setA = new ArrayList();
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(3,4,5,6,7));
        ArrayList expResult = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        fail("intersection exception not thrown for empty setA");
    }
    
    /**
     * Test for exception when set B is an empty array
     * Expected Result: Fail
     */
    @Test(timeout=5000,expected=IllegalArgumentException.class)
    public void testIntersectionEmptySetB() {
        System.out.println("intersection exception for empty setB");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(3,4,5,6,7));
        ArrayList<Integer> setB = new ArrayList();
        ArrayList expResult = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.intersection(setA, setB);
        fail("intersection exception not thrown for empty setB");
    }
    
    /**
     * Basic test of union with array set values with one value overlapping
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testUnionBasic() {
        System.out.println("union basic values with one union");
        ArrayList<Integer> A = new ArrayList(Arrays.asList(1,2,3));
        ArrayList<Integer> B = new ArrayList(Arrays.asList(3,4,5));
        ArrayList expResult = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList result = ArraySetUtilities.union(A, B);
        assertEquals(expResult, result);
    }
    
    /**
     * ADetailed test using negative values and multiple duplicates between 
     * the two array sets
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testUnionAdvanced() {
        System.out.println("union advanced values with multiple unions");
        ArrayList<Integer> A = new ArrayList(Arrays.asList(1,1,1,88,1,1,1,2,3));
        ArrayList<Integer> B = new ArrayList(Arrays.asList(6,88,-2,2));
        ArrayList expResult = new ArrayList(Arrays.asList(1,88,2,3,6,-2));
        ArrayList result = ArraySetUtilities.union(A, B);
        assertEquals(expResult, result);
    }
    
    /**
     * Test for a return result of a single value when both array sets contain 
     * the same values
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testUnionNoUnion() {
        System.out.println("union with no union values");
        ArrayList<Integer> A = new ArrayList(Arrays.asList(1,1,1,1,1));
        ArrayList<Integer> B = new ArrayList(Arrays.asList(1,1,1,1,1));
        
        ArrayList expResult = new ArrayList(Arrays.asList(1));
        ArrayList result = ArraySetUtilities.union(A, B);
        
        assertEquals(expResult, result)        ;
    }
    
    /**
     * Test for exception when set A is a null array
     * Expected Result: Fail
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testUnionNullArrayA() {
        System.out.println("union exception for null set A");
        ArrayList<Integer> A = null;
        ArrayList<Integer> B = new ArrayList(Arrays.asList(3,4,5));
        ArrayList result = ArraySetUtilities.union(A, B);
        fail("union exception not thrown for null set A");
    }
    
    /**
     * Test for exception when set B is a null array
     * Expected Result: Fail
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testUnionNullArrayB() {
        System.out.println("union exception for null set B");
        ArrayList<Integer> A = new ArrayList(Arrays.asList(3,4,5));
        ArrayList<Integer> B = null;
        ArrayList expResult = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList result = ArraySetUtilities.union(A, B);
        fail("union exception not thrown for null set B");
    }
    
    /**
     * Test that return result is true to show that set B is a subset of set A
     * Expected Result: Fail
     */
    @Test(timeout=5000)
    public void testSubSetBasicTrue() {
        System.out.println("subSet pass result when setB is a subset setA");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(1,2,3));
        boolean expResult = true;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        assertEquals(expResult, result);
    }
    
    /**
     * Test that return result is false to show that set B is not a subset 
     * of set A
     * Expected Result: Pass
     */
    @Test(timeout=5000)
    public void testSubSetBasicFalse() {
        System.out.println("subSet pass result when setB is not a subset setA");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3));
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(4,5,6));
        boolean expResult = false;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        assertEquals(expResult, result);
    }
    
    /**
     * Test that return results after basic true test failed.  Attempt to see 
     * if method allows for set A to be a subset of set B.
     * Expected Result: Fail
     */
    @Test(timeout=5000)
    public void testSubSetReverseSets() {
        System.out.println("subSet pass result of setA is subset setB");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3));
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(1,2,3,4,5));
        boolean expResult = false;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        assertEquals(expResult, result);
    }
    
    /**
     * Test for exception thrown when set A is a null array
     * Expected Result: Fail
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testSubSetBasicNullSetA() {
        System.out.println("subSet exception for null setA");
        ArrayList<Integer> setA = null;
        ArrayList<Integer> setB = new ArrayList(Arrays.asList(1,2,3));
        boolean expResult = true;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        fail("subSet exception not thrown for null setA");
    }
    
    /**
     * Test for exception thrown when set B is a null array
     * Expected Result: Fail
     */
    @Test(timeout=5000, expected=IllegalArgumentException.class)
    public void testSubSetBasicNullSetB() {
        System.out.println("subSet exception for null setB");
        ArrayList<Integer> setA = new ArrayList(Arrays.asList(1,2,3));
        ArrayList<Integer> setB = null;
        boolean expResult = true;
        boolean result = ArraySetUtilities.subSet(setA, setB);
        fail("subSet exception not thrown for null setB");
    }
}
