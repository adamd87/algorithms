package pl.adamd.difference_between_parts_of_split_array;

import java.util.Arrays;

interface Difference {
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

    /**
     * @param A array of integers
     * @return Minimal difference between to parts of split array
     */
    static int minimalDifference(int[] A) {
        int result = 0;
        for (int i = 1; i < A.length; i++) {
            int iNum = 0;
            int sumX = 0;
            int sumY = 0;
            int diff = Integer.MAX_VALUE;

            iNum += i;
            int[] x = new int[A.length - iNum];
            int[] y = new int[A.length - x.length];

            for (int j = 0; j < A.length; j++) {
                if (j < x.length)
                    x[j] = A[j];
                else y[j - x.length] = A[j];
            }

            for (int k = 0; k < x.length-1; k++) {
                sumX = sumX + x[k];
                for (int z = k+1; z < y.length; z++) {
                    sumY = sumY + y[z];
                    if (Math.abs(sumX - sumY) < diff)
                        diff = Math.abs(sumX - sumY);
                }
                result = diff;
            }
        }
        System.out.println("Minimal difference: ");
        return result;
    }
}
