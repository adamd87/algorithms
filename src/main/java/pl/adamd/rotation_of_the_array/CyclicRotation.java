package pl.adamd.rotation_of_the_array;

import java.util.Arrays;

interface CyclicRotation {
    /**
     * @param A given an array A consisting of N integers
     * @param K each element of A will be shifted to the right K times
     * @return the array A rotated K times
     */
    static int[] cyclingRotation(int[] A, int K) {
        int[] result = new int[A.length];

        // each loop returns index A[i] in the result array
        for (int i = 0; i <= A.length - 1; i++) {
            result[(i + K) % A.length] = A[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }


}
