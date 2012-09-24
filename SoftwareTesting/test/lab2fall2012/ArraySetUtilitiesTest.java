/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2fall2012;

import java.util.ArrayList;
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
     * Test of createSet method, of class ArraySetUtilities.
     */
    @Test
    public void testCreateSet() {
        System.out.println("createSet");
        int size = 0;
        int minimum = 0;
        int maximum = 0;
        boolean uniqueElements = false;
        ArrayList expResult = null;
        ArrayList result = ArraySetUtilities.createSet(size, minimum, maximum, uniqueElements);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of union method, of class ArraySetUtilities.
     */
    @Test
    public void testUnion() {
        System.out.println("union");
        ArrayList<Integer> setA = null;
        ArrayList<Integer> setB = null;
        ArrayList expResult = null;
        ArrayList result = ArraySetUtilities.union(setA, setB);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
