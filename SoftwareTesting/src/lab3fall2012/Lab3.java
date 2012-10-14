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
   * Example of a manual timing test
   *
   * @param args
   */
  public static void main(String[] args) {
    // YOU MUST ENTER YOUR STUDENT NUMBER HERE
    final int studentId = 44556345;
    final int size = 10000;
    long      start, t;

    // Declare random int array
    int array[] = buildrandomarray(size, studentId);

    // Note call each sort method once to force compile (The java VM is a hotspot compiler)
    Sort.a(array); 

    // Timing example code 
    int n = size;
    start = System.nanoTime();
    // Needs to be done before each sort call (fairness)
    array = buildrandomarray(n, studentId);
    Sort.a(array);
    // Time is reported in microseconds (1 millionth of a second)
    t = (System.nanoTime() - start) / 1000;
    System.out.printf("Sort A took %d us to sort %d elements\n", t, n);
  }
}
