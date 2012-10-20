package lab3fall2012;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import mohawkcollege.comp10066.perflib.Sort;

/**
 * COMP10066 Lab#3 starter file The main method demonstrates manual timing code.
 * You may use this code in order to manually time the different sort methods.
 * The sort methods are in the jar file that is included with the project NOTE :
 * You do not have access to the sort code - Black Box Test
 *
 * @author mark.yendt
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
     * 
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
     * 
     * @param size
     * @return 
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
     * 
     * @param size
     * @return 
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
     * 
     * @param size
     * @return 
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
     * 
     * @param size
     * @return 
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
     * 
     * @param size
     * @return 
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
