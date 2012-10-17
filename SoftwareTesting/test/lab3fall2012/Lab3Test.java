/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3fall2012;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import mohawkcollege.comp10066.perflib.Sort;
import org.junit.Assert;

/**
 *
 * @author Christopher
 */
public class Lab3Test {
    
    public Lab3Test() {
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
     * 
     */
    @Test
    public void testSortADefault()
    {
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
     * 
     */
    @Test
    public void testSortBDefault()
    {
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
     * 
     */
    @Test
    public void testSortCDefault()
    {
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
     * 
     */
    @Test
    public void testSortDDefault()
    {
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
     * 
     */
    @Test
    public void testSortEDefault()
    {
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
}
