/**
 * <p><strong>Statement of Authorship</strong><br />
 * <strong style="color: red">
 * I Christopher Hair, 000243034 certify that this material is my 
 * original work. No other person's work has been used without suitable
 * acknowledgment and I have not made my work available to anyone else.
 * </strong></p>
 * 
 * <pre>
 * File: SetsUtil.java
 * Date: 09/21/12
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

public final class SetsUtil {
    /**
     * Create an ArrayList of random values to be used as a Math Set
     * 
     * @param valueSize - size of the set to be created
     * @param minValue - minimum random number boundary
     * @param maxValue - maximum random number boundary
     * @param isListUnique - determines whether the list will contain unique values
     * @return ArrayList of Integers
     */
    public static ArrayList<Integer> createArray(int valueSize, int minValue, int maxValue, boolean isListUnique) {
        boolean isDone = false;
        int i = 0;
        ArrayList<Integer> ReturnList = null;
        if (valueSize > 0) {
            ReturnList = new ArrayList<Integer>();
            boolean isUnique = false;
            while (!isDone) {
                int randomValue = (int) (Math.random() * (maxValue - minValue)) + minValue;
                isUnique = true;
                for (int j = 0; j < i && isUnique; j++) {
                    isUnique = randomValue != ReturnList.get(j);
                }

                if (isUnique || !isListUnique) {
                    ReturnList.add(randomValue);
                    i++;
                }

                isDone = (i == valueSize);
            }
        }
        return ReturnList;
    }

    /**
     * Used to see if all values in a Set are unique
     * 
     * @param valuesList - set of values to check
     * @return boolean value
     */
    public static boolean isListUnique(ArrayList<Integer> valuesList) {
        boolean isUnique = true;
        if (valuesList == null) {
            isUnique = false;
        } else {
            for (int i = 0; i < valuesList.size() && isUnique; i++) {
                for (int j = i + 1; j < valuesList.size() && isUnique; j++) {
                    isUnique = valuesList.get(i) != valuesList.get(j);
                }
            }
        }
        return isUnique;
    }

    /**
     * Used to check for Intersection values between two Sets of values
     * 
     * @param valuesListA - Set of values to evaluate
     * @param valuesListB - Set of values to evaluate
     * @return List of Integers
     * @throws IllegalArgumentException 
     */
    public static ArrayList<Integer> checkIntersection(ArrayList<Integer> valuesListA, ArrayList<Integer> valuesListB)
            throws IllegalArgumentException {
        ArrayList<Integer> returnValues = new ArrayList<Integer>();
        if (null == valuesListA || null == valuesListB) {
            throw new IllegalArgumentException("Arralist arguments cannot be null");
        }
        if (valuesListA.size() == 0 || valuesListB.size() == 0) {
            throw new IllegalArgumentException("Arraylist arguments cannot be empty");
        }
        for (int i = 0; i < valuesListA.size(); i++) {
            for (int j = 0; j < valuesListB.size(); j++) {
                if (valuesListA.get(i) == valuesListB.get(j)) {
                    boolean addit = true;
                    for (int k = 0; k < returnValues.size(); k++) {
                        if (valuesListA.get(i) == returnValues.get(k)) {
                            addit = false;
                            break;
                        }
                    }
                    if (addit) {
                        returnValues.add(valuesListA.get(i));
                    }
                }
            }
        }

        return returnValues;
    }

    /**
     * Creates a Union Set of two separate Math Sets
     * 
     * @param valuesListA - Value Set to use
     * @param valuesListB - Value Set to use
     * @return List of Integers
     * @throws IllegalArgumentException 
     */
    public static ArrayList<Integer> createUnion(ArrayList<Integer> valuesListA, ArrayList<Integer> valuesListB)
            throws IllegalArgumentException {
        ArrayList<Integer> returnValues = new ArrayList<Integer>();
        if (null == valuesListA || null == valuesListB) {
            throw new IllegalArgumentException("Arralist arguments cannot be null");
        }
        if (valuesListA.size() == 0 || valuesListB.size() == 0) {
            throw new IllegalArgumentException("Arraylist arguments cannot be empty");
        }

        for (int i = 0; i < valuesListA.size(); i++) {
            boolean isAddable = true;
            for (int j = 0; j < returnValues.size() && isAddable; j++) {
                isAddable = valuesListA.get(i) != returnValues.get(j);
            }
            if (isAddable) {
                returnValues.add(valuesListA.get(i));
            }
        }

        for (int i = 0; i < valuesListB.size(); i++) {
            boolean isAddable = true;
            for (int j = 0; j < returnValues.size() && isAddable; j++) {
                isAddable = valuesListB.get(i) != returnValues.get(j);
            }
            if (isAddable) {
                returnValues.add(valuesListB.get(i));
            }
        }

        return returnValues;
    }

    /**
     * Check for values in a child Set if they all exist in a parent Set
     * 
     * @param parentValues - Set of values
     * @param childValues - Set of values
     * @return boolean
     */
    public static boolean checkSubset(ArrayList<Integer> parentValues, ArrayList<Integer> childValues) {
        if (null == parentValues || null == childValues) {
            throw new IllegalArgumentException("Arralist arguments cannot be null");
        }
        if (parentValues.size() == 0 || childValues.size() == 0) {
            throw new IllegalArgumentException("Arraylist arguments cannot be empty");
        }

        boolean isInList = true;
        for (int i = 0; i < parentValues.size() && isInList; i++) {
            isInList = false;
            for (int j = 0; j < childValues.size() && !isInList; j++) {
                isInList = parentValues.get(i) == childValues.get(j);
            }
        }

        return isInList;
    }

    public static void main(String args[]) {
        // Run a test case for each function
        ArrayList<Integer> A = createArray(10, 10, 20, false);
        for (int i = 0; i < A.size(); i++) {
            System.out.println("A[" + i + "] = " + A.get(i));
        }

        System.out.println("A elements are unique ? " + isListUnique(A));

        ArrayList<Integer> B = createArray(5, 10, 20, true);
        for (int i = 0; i < B.size(); i++) {
            System.out.println("B[" + i + "] = " + B.get(i));
        }

        System.out.println("B elements are unique ? " + isListUnique(B));

        ArrayList<Integer> C = checkIntersection(A, B);
        System.out.println("The common elements between a and b are \n");
        for (int i = 0; i < C.size(); i++) {
            System.out.println(" " + C.get(i));
        }

        C = createUnion(A, B);
        System.out.println("A set of all elements between a and b are \n");
        for (int i = 0; i < C.size(); i++) {
            System.out.println(" " + C.get(i));
        }

        ArrayList<Integer> f = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
        ArrayList<Integer> s = new ArrayList<Integer>(Arrays.asList(10, 20, 30));

        if (checkSubset(s, f)) {
            System.out.println("s is a sub set of f");
        } else {
            System.out.println("s is not a sub set of f");
        }

    }
}