package pl.adamd.rotation_of_the_array;

import static pl.adamd.rotation_of_the_array.CyclicRotation.cyclingRotation;

class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 8, 9};
        int k = 7;

        cyclingRotation(a, k);
    }
}
