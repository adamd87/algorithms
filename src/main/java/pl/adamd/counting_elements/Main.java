package pl.adamd.counting_elements;

import java.util.Arrays;

import static pl.adamd.counting_elements.CountingElements.*;

class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 1, 5, 3, 4, 4};
        int[] b = {4, 1, 3, 2};
        int[] c = {4, 1, 3};
        int[] d = {1, 3};
        int[] e = {2, 3};
        int x = 5;

        System.out.println("Earliest possibility to move: \n" + earliestPossibilityToMove(x, a));
        System.out.println("Permutation: \n" + permutation(a));
        System.out.println(permutation(b));
        System.out.println(permutation(c));
        System.out.println(permutation(d));
        System.out.println(permutation(e));
        System.out.println("Max count: \n" + Arrays.toString(maxCount(x, a)));
        System.out.println("Find missing integer: \n" + findMissingInt(a));
        System.out.println(findMissingInt(b));
        System.out.println(findMissingInt(c));
        System.out.println(findMissingInt(d));
        System.out.println(findMissingInt(e));
    }
}
