package pl.adamd.counting_elements;

import static pl.adamd.counting_elements.CountingElements.earliestPossibilityToMove;
import static pl.adamd.counting_elements.CountingElements.permutation;

class Main {
    public static void main(String[] args) {
        int[] a = {1,3,1,5,3,4,4};
        int[] b = {4,1,3,2};
        int[] c = {4,1,3};
        int x = 5;

        System.out.println(earliestPossibilityToMove(x, a));
        System.out.println(permutation(a));
        System.out.println(permutation(b));
        System.out.println(permutation(c));
    }
}
