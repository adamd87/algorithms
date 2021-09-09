package pl.adamd.difference_between_parts_of_split_array;

import static pl.adamd.difference_between_parts_of_split_array.Difference.absoluteDifferenceOfSplitArray;
import static pl.adamd.difference_between_parts_of_split_array.Difference.minimalDifference;

class Main {
    public static void main(String[] args) {
        int[] n = {3,1,15,4,3};
        System.out.println(absoluteDifferenceOfSplitArray(n));
        System.out.println(minimalDifference(n));
    }
}
