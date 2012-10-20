/**
 * <p><strong>Statement of Authorship</strong><br />
 * <strong style="color: red">
 * I Christopher Hair, 000243034 certify that this material is my 
 * original work. No other person's work has been used without suitable
 * acknowledgment and I have not made my work available to anyone else.
 * </strong></p>
 * 
 * <pre>
 * File: Lab3.java
 * Date: 10/20/12
 * Author: Christopher Hair
 * Student ID: 000243034
 * </pre>
 *
 * <h2 style="color: blue">Description:</h2>
 * <p>Summarized testing of the given sort methods of a provided class</p>
 * 
 * @author Christopher Hair
 * @author Student ID 000243034 
 */
package lab3fall2012;

import java.util.Random;
import mohawkcollege.comp10066.perflib.Sort;

/**
 * Summarizes testing for the Sort class provided for Black Box Testing
 *
 * @author Christopher Hair
 */
public class Lab3 {
    
    private static int studentId;
    private static final int MINSIZE = 10;
    private static final int MAXSIZE = 1000000;
    
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
    * Runs the Tests and provides output in summary format
    *
    * @param args
    */
    public static void main(String[] args) {
        System.out.printf("Setting up Environment...\n");
        
        studentId = 000243034;
        int size = MINSIZE;
        long t;

        CompileHelper();
        
        while(size < MAXSIZE) {
            System.out.printf("\nElements To Sort: %d\n", size);
            System.out.printf("-------------------------\n");
            System.out.printf("Method\t\tTime\n");
            System.out.printf("------\t\t----\n");

            t = SortATime(size);
            System.out.printf("Sort A\t\t%d us\n", t);

            t = SortBTime(size);
            System.out.printf("Sort B\t\t%d us\n", t);

            t = SortCTime(size);
            System.out.printf("Sort C\t\t%d us\n", t);

            t = SortDTime(size);
            System.out.printf("Sort D\t\t%d us\n", t);

            t = SortETime(size);
            System.out.printf("Sort E\t\t%d us\n", t);
            
            size *= 10;
        }
        
        System.out.printf("\nTo see results for the 1000000 Element testing please run the associated JUnit Test file\n\n");
    }
  
    /**
     * Initial environment setup to ensure that JVM has compiled sort methods
     */
    private static void CompileHelper()
    {
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
    
    /**
     * Timing of the 'a' sort method in the sort class with the given size
     * @param size
     * @return Time to sort in microseconds (us)
     */
    private static long SortATime(int size)
    {
        long start;
        
        // Create an array to be sorted
        int array[] = buildrandomarray(size, studentId);
        Sort.a(array); 

        // Time the sort after building a new array 
        array = buildrandomarray(size, studentId);
        start = System.nanoTime();
        Sort.a(array);
        
        return (System.nanoTime() - start) / 1000;
    }
    
    /**
     * Timing of the 'b' sort method in the sort class with the given size
     * @param size
     * @return Time to sort in microseconds (us)
     */
    private static long SortBTime(int size)
    {
        long start;

        // Time the sort after building a new array
        int array[] = buildrandomarray(size, studentId);
        start = System.nanoTime();
        Sort.b(array);
        
        return (System.nanoTime() - start) / 1000;
    }
    
    /**
     * Timing of the 'c' sort method in the sort class with the given size
     * @param size
     * @return Time to sort in microseconds (us)
     */
    private static long SortCTime(int size)
    {
        long start;

        // Time the sort after building a new array
        int array[] = buildrandomarray(size, studentId);
        start = System.nanoTime();
        Sort.c(array);
        
        return (System.nanoTime() - start) / 1000;
    }
    
    /**
     * Timing of the 'd' sort method in the sort class with the given size
     * @param size
     * @return Time to sort in microseconds (us)
     */
    private static long SortDTime(int size)
    {
        long start;

        // Time the sort after building a new array
        int array[] = buildrandomarray(size, studentId);
        start = System.nanoTime();
        Sort.d(array);
        
        return (System.nanoTime() - start) / 1000;
    }
    
    /**
     * Timing of the 'e' sort method in the sort class with the given size
     * @param size
     * @return Time to sort in microseconds (us)
     */
    private static long SortETime(int size)
    {
        long start;

        // Time the sort after building a new array 
        int array[] = buildrandomarray(size, studentId);
        start = System.nanoTime();
        Sort.e(array);
        
        return (System.nanoTime() - start) / 1000;
    }
}
