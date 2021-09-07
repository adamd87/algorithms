package pl.adamd.absolut_difference_split_array;

import java.util.Arrays;

interface AbsoluteDifference {
    /**
     * @param A array of integers
     * @return Absolute difference between to parts of split array
     */
    static int absoluteDifferenceOfSplitArray(int[] A) {
        int sumX = 0;
        int sumY = 0;

        int[] x = new int[(A.length + 1) / 2];
        int[] y = new int[A.length - x.length];

        for (int i = 0; i < A.length; i++) {
            if (i < x.length)
                x[i] = A[i];
            else y[i - x.length] = A[i];
        }
        for (int element : x) {
            sumX = sumX + element;
        }
        for (int element : y) {
            sumY = sumY + element;
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        System.out.println("Absolute difference: ");

        return Math.abs(sumX - sumY);
    }
}
