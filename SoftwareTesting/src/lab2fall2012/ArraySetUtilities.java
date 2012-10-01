/**
 * <p><strong>Statement of Authorship</strong><br />
 * <strong style="color: red">
 * I Christopher Hair, 000243034 certify that this material is my 
 * original work. No other person's work has been used without suitable
 * acknowledgment and I have not made my work available to anyone else.
 * </strong></p>
 * 
 * <pre>
 * File: ArraySetUtilities.java
 * Date: 09/24/12
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

/**
 *
 * @author Christopher
 */
public final class ArraySetUtilities {
    /**
     * Method will generate a set of integers between the minimum and maximum of the requested size.
     * 
     * @param size - the number of elements for the array
     * @param minimum - the lower value of the range of integers to generate
     * @param maximum - the upper value of the range of integers to generate
     * @param uniqueElements - flag for unique values 
     * @return 
     */
    public static ArrayList<Integer> createSet(int size, int minimum, int maximum, boolean uniqueElements) {
        boolean isDone = false;
        int i = 0;
        ArrayList<Integer> ReturnList = null;
        if (size > 0) {
            ReturnList = new ArrayList<Integer>();
            boolean isUnique = false;
            while (!isDone) {
                int randomValue = (int) (Math.random() * (maximum - minimum)) + minimum;
                isUnique = true;
                for (int j = 0; j < i && isUnique; j++) {
                    isUnique = randomValue != ReturnList.get(j);
                }

                if (isUnique || !uniqueElements) {
                    ReturnList.add(randomValue);
                    i++;
                }

                isDone = (i == size);
            }
        }
        return ReturnList;
    }

    /**
     * Method will determine if all elements in the input set are all unique 
     * 
     * @param arraySet - the input array to check 
     * @return true if there are no duplicates, false if duplicates exists
     */
    public static boolean isUnique(ArrayList<Integer> arraySet) {
        boolean isUnique = true;
        if (arraySet == null) {
            isUnique = false;
        } else {
            for (int i = 0; i < arraySet.size() && isUnique; i++) {
                for (int j = i + 1; j < arraySet.size() && isUnique; j++) {
                    isUnique = arraySet.get(i) != arraySet.get(j);
                }
            }
        }
        return isUnique;
    }

    /**
     * Determines the common elements (intersection) between setA and setB 
     * 
     * @param setA - The first of the two Sets
     * @param setB - The second of the two sets 
     * @return a new set that consists of the common elements between A and B
     * @throws java.lang.IllegalArgumentException - when one of setA or setB is null or empty 
     */
    public static ArrayList<Integer> intersection(ArrayList<Integer> setA, ArrayList<Integer> setB)
            throws IllegalArgumentException {
        ArrayList<Integer> returnValues = new ArrayList<Integer>();
        if (null == setA || null == setB) {
            throw new IllegalArgumentException("Arralist arguments cannot be null");
        }
        if (setA.size() == 0 || setB.size() == 0) {
            throw new IllegalArgumentException("Arraylist arguments cannot be empty");
        }
        for (int i = 0; i < setA.size(); i++) {
            for (int j = 0; j < setB.size(); j++) {
                if (setA.get(i) == setB.get(j)) {
                    boolean addit = true;
                    for (int k = 0; k < returnValues.size(); k++) {
                        if (setA.get(i) == returnValues.get(k)) {
                            addit = false;
                            break;
                        }
                    }
                    if (addit) {
                        returnValues.add(setA.get(i));
                    }
                }
            }
        }

        return returnValues;
    }

    /**
     * Determine the union of two sets 
     * 
     * @param setA - the first of the two sets for the union
     * @param setB - the second of the two sets for the union 
     * @return a union between setA and setB
     * @throws java.lang.IllegalArgumentException - when one of setA or setB is null or empty 
     */
    public static ArrayList<Integer> union(ArrayList<Integer> setA, ArrayList<Integer> setB)
            throws IllegalArgumentException {
        ArrayList<Integer> returnValues = new ArrayList<Integer>();
        if (null == setA || null == setB) {
            throw new IllegalArgumentException("Arralist arguments cannot be null");
        }
        if (setA.size() == 0 || setB.size() == 0) {
            throw new IllegalArgumentException("Arraylist arguments cannot be empty");
        }

        for (int i = 0; i < setA.size(); i++) {
            boolean isAddable = true;
            for (int j = 0; j < returnValues.size() && isAddable; j++) {
                isAddable = setA.get(i) != returnValues.get(j);
            }
            if (isAddable) {
                returnValues.add(setA.get(i));
            }
        }

        for (int i = 0; i < setB.size(); i++) {
            boolean isAddable = true;
            for (int j = 0; j < returnValues.size() && isAddable; j++) {
                isAddable = setB.get(i) != returnValues.get(j);
            }
            if (isAddable) {
                returnValues.add(setB.get(i));
            }
        }

        return returnValues;
    }

    /**
     * Determines if setB is a subSet of setA
     * 
     * @param setA - the full set for the comparison
     * @param setB - the sub set to be tested 
     * @return true if setB is a subSet of setA 
     * @throws java.lang.IllegalArgumentException - when one of setA or setB is null or empty
     */
    public static boolean subSet(ArrayList<Integer> setA, ArrayList<Integer> setB) {
        if (null == setA || null == setB) {
            throw new IllegalArgumentException("Arralist arguments cannot be null");
        }
        if (setA.size() == 0 || setB.size() == 0) {
            throw new IllegalArgumentException("Arraylist arguments cannot be empty");
        }

        boolean isInList = true;
        for (int i = 0; i < setA.size() && isInList; i++) {
            isInList = false;
            for (int j = 0; j < setB.size() && !isInList; j++) {
                isInList = setA.get(i) == setB.get(j);
            }
        }

        return isInList;
    }
}