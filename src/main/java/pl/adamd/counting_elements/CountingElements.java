package pl.adamd.counting_elements;

import java.util.HashSet;
import java.util.Set;

interface CountingElements {
    /**
     * The move can be made when the array element equals X.
     * @param X an integer representing the first possible chance for the move to be executed.
     * @param A an array of integers.
     * @return "-1" if any element of an array is bigger then X, else return index of element equals X.
     */
    static int earliestPossibilityToMove(int X, int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > X) {
                result = -1;
                break;
            }
            if (A[i] == X) {
                result = i;
            }
        }
        return result;
    }

    /**
     * Check whether array A is a permutation.
     * @param A an array of integers
     * @return "1" if array A is a permutation, return "0" if it's not a permutation.
     */
    static int permutation(int[] A){
        Set<Integer> integerSet = new HashSet<>();
        int max = 0;
        int result = 0;

        //element of an array inserts in the set and calculates max element
        for (int element : A) {
            integerSet.add(element);
            max = Math.max(max, element);
        }

        if (max != A.length) return result;
        if (integerSet.size() == A.length) result = 1;

        return result;
    }
}
