package pl.adamd.odd_occurrences_in_array;

import static pl.adamd.odd_occurrences_in_array.OddOccurrences.oddOccurrences;

class Main {
    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 4, 3, 6, 7, 12, 6, 5, 7, 12};

        System.out.println(oddOccurrences(a));

    }
}
