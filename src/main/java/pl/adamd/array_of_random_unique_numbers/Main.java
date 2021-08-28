package pl.adamd.array_of_random_unique_numbers;

import java.util.Arrays;

/**
 * Array of random unique numbers of length N, the sum of the numbers equal to 0.
 */
class Main {
    public static void main(String[] args) {
        arrayOfRandomUniqueNumbers(5);

    }

    public static int[] arrayOfRandomUniqueNumbers(int n) {
        int[] array = new int[n];

        do {
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * 10);
                for (int j = 0; j < i; j++) {
                    while (array[i] == array[j]) {
                        array[i] = (int) (Math.random() * -10);
                        j = 0;
                    }
                }
            }
        } while (!isEqualZero(array));
        System.out.println(Arrays.toString(array));
        System.out.println(findSum(array));
        System.out.println(isEqualZero(array));

        return array;
    }

    public static boolean isEqualZero(int[] array) {
        if (findSum(array) == 0) return true;
        return false;
    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
