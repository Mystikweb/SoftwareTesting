/**
 * <p><strong>Statement of Authorship</strong><br />
 * <strong style="color: red">
 * I Christopher Hair, 000243034 certify that this material is my 
 * original work. No other person's work has been used without suitable
 * acknowledgment and I have not made my work available to anyone else.
 * </strong></p>
 * 
 * <pre>
 * File: Lab3Test.java
 * Date: 10/20/12
 * Author: Christopher Hair
 * Student ID: 000243034
 * </pre>
 *
 * <h2 style="color: blue">Description:</h2>
 * <p>Unit tests to test the provided Sort class</p>
 * 
 * @author Christopher Hair
 * @author Student ID 000243034 
 */
package lab3fall2012;

import java.util.Random;
import mohawkcollege.comp10066.perflib.Sort;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests for sort methods in the Sort class provided
 * 
 * @author Christopher
 */
public class Lab3Test {
    
    private static int studentId; // Used for seeding the random generators
    private static final int MAXSIZE = 1000000; // Dataset size to be sorted
    
    public Lab3Test() {
        studentId = 000243034;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Used to setup the JVM to do an initial compile of the methods before tests
     */
    @Before
    public void setUp() {
        int size = 5;
        
        int array[] = buildrandomarray(size, studentId);
        Sort.a(array);
        
        array  = buildrandomarray(size, studentId);
        Sort.b(array); 
        
        array = buildrandomarray(size, studentId);
        Sort.c(array); 
        
        array = buildrandomarray(size, studentId);
        Sort.d(array); 
        
        array = buildrandomarray(size, studentId);
        Sort.e(array); 
    }
    
    @After
    public void tearDown() {
    }

    /**
    * creates an integer array of random integers using a student id as a seed
    *
    * @param size - number of elements must be a positive value greater than 1
    * @param studid - a Mohawk college student id (no leading zeros)
    * @return an array of the specified length
    */
    private static int[] buildrandomarray(int size, int studentId) {

        Random r = new Random(studentId);  // Student Id is used to ensure same set for comparison purposes
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt();
        }
        return array;
    }
    
    /**
     * Default test to check the sort method 'a' works as expected
     * Expected Result: pass
     */
    @Test
    public void testSortADefault()
    {
        System.out.println("Default Test for Sort A");
        int size = 5;
        long started, total;
        int numbers[] = new int[size];
        int expected[] = new int[size];
        
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;
        expected[4] = 5;
                
        numbers[0] = 5;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 1;
        
        System.out.print("Before Sort A: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println();
        
        started = System.nanoTime();
        Sort.a(numbers);
        total = (System.nanoTime() - started) / 1000;
                
        System.out.print("After Sort A: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println();
        System.out.println("Total Time to Run Sort A: " + total + "us");
        System.out.println();
        
        Assert.assertArrayEquals(expected, numbers);
    }
    
    /**
     * Default test to check the sort method 'b' works as expected
     * Expected Result: pass 
     */
    @Test
    public void testSortBDefault()
    {
        System.out.println("Default Test for Sort B");
        int size = 5;
        long started, total;
        int numbers[] = new int[size];
        int expected[] = new int[size];
        
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;
        expected[4] = 5;
                
        numbers[0] = 5;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 1;
        
        System.out.print("Before Sort B: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println();
        
        started = System.nanoTime();
        Sort.b(numbers);
        total = (System.nanoTime() - started) / 1000;
                
        System.out.print("After Sort B: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println();
        System.out.println("Total Time to Run Sort B: " + total + "us");
        System.out.println();
        
        Assert.assertArrayEquals(expected, numbers);
    }
    
    /**
     * Default test to check the sort method 'c' works as expected
     * Expected Result: pass 
     */
    @Test
    public void testSortCDefault()
    {
        System.out.println("Default Test for Sort C");
        int size = 5;
        long started, total;
        int numbers[] = new int[size];
        int expected[] = new int[size];
        
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;
        expected[4] = 5;
                
        numbers[0] = 5;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 1;
        
        System.out.print("Before Sort C: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println();
        
        started = System.nanoTime();
        Sort.c(numbers);
        total = (System.nanoTime() - started) / 1000;
                
        System.out.print("After Sort C: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println();
        System.out.println("Total Time to Run Sort C: " + total + "us");
        System.out.println();
        
        Assert.assertArrayEquals(expected, numbers);
    }
    
    /**
     * Default test to check the sort method 'd' works as expected
     * Expected Result: pass 
     */
    @Test
    public void testSortDDefault()
    {
        System.out.println("Default Test for Sort D");
        int size = 5;
        long started, total;
        int numbers[] = new int[size];
        int expected[] = new int[size];
        
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;
        expected[4] = 5;
                
        numbers[0] = 5;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 1;
        
        System.out.print("Before Sort D: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println();
        
        started = System.nanoTime();
        Sort.d(numbers);
        total = (System.nanoTime() - started) / 1000;
                
        System.out.print("After Sort D: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println();
        System.out.println("Total Time to Run Sort D: " + total + "us");
        System.out.println();
        
        Assert.assertArrayEquals(expected, numbers);
    }
    
    /**
     * Default test to check the sort method 'e' works as expected
     * Expected Result: pass
     */
    @Test
    public void testSortEDefault()
    {
        System.out.println("Default Test for Sort E");
        int size = 5;
        long started, total;
        int numbers[] = new int[size];
        int expected[] = new int[size];
        
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;
        expected[4] = 5;
                
        numbers[0] = 5;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 1;
        
        System.out.print("Before Sort E: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println();
        
        started = System.nanoTime();
        Sort.e(numbers);
        total = (System.nanoTime() - started) / 1000;
                
        System.out.print("After Sort E: ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.printf("%d, ", numbers[i]);
        }
        System.out.println();
        System.out.println("Total Time to Run Sort E: " + total + "us");
        System.out.println();
        
        Assert.assertArrayEquals(expected, numbers);
    }
    
    /*********** LARGE DATASET TESTING ***********/
    
    /**
     * Large dataset test of sort method 'a' to take less than 30s to complete
     */
    @Test(timeout=30000)
    public void testSortALargeVol() 
    {
        System.out.println("Large DataSet Test for Sort A(Stops in 30s if no results)");
        long start, time;

        // Time the sort after building a new array 
        int array[] = buildrandomarray(MAXSIZE, studentId);
        start = System.nanoTime();
        Sort.a(array);
        
        time = (System.nanoTime() - start) / 1000;
        
        System.out.printf("Sort A took %d us to sort %d elements\n", time, MAXSIZE);
    }
    
    /**
     * Large dataset test of sort method 'b' to take less than 30s to complete 
     */
    @Test(timeout=30000)
    public void testSortBLargeVol() 
    {
        System.out.println("Large DataSet Test for Sort B(Stops in 30s if no results)");
        long start, time;

        // Time the sort after building a new array 
        int array[] = buildrandomarray(MAXSIZE, studentId);
        start = System.nanoTime();
        Sort.b(array);
        
        time = (System.nanoTime() - start) / 1000;
        
        System.out.printf("Sort B took %d us to sort %d elements\n", time, MAXSIZE);
    }
    
    /**
     * Large dataset test of sort method 'c' to take less than 30s to complete
     */
    @Test(timeout=30000)
    public void testSortCLargeVol() 
    {
        System.out.println("Large DataSet Test for Sort C(Stops in 30s if no results)");
        long start, time;

        // Time the sort after building a new array 
        int array[] = buildrandomarray(MAXSIZE, studentId);
        start = System.nanoTime();
        Sort.c(array);
        
        time = (System.nanoTime() - start) / 1000;
        
        System.out.printf("Sort C took %d us to sort %d elements\n", time, MAXSIZE);
    }
    
    /**
     * Large dataset test of sort method 'd' to take less than 30s to complete
     */
    @Test(timeout=30000)
    public void testSortDLargeVol() 
    {
        System.out.println("Large DataSet Test for Sort D(Stops in 30s if no results)");
        long start, time;

        // Time the sort after building a new array 
        int array[] = buildrandomarray(MAXSIZE, studentId);
        start = System.nanoTime();
        Sort.d(array);
        
        time = (System.nanoTime() - start) / 1000;
        
        System.out.printf("Sort D took %d us to sort %d elements\n", time, MAXSIZE);
    }
    
    /**
     * Large dataset test of sort method 'e' to take less than 30s to complete
     */
    @Test(timeout=30000)
    public void testSortELargeVol() 
    {
        System.out.println("Large DataSet Test for Sort E(Stops in 30s if no results)");
        long start, time;

        // Time the sort after building a new array 
        int array[] = buildrandomarray(MAXSIZE, studentId);
        start = System.nanoTime();
        Sort.e(array);
        
        time = (System.nanoTime() - start) / 1000;
        
        System.out.printf("Sort E took %d us to sort %d elements\n", time, MAXSIZE);
    }
}