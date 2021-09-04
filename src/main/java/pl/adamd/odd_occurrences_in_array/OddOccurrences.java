package pl.adamd.odd_occurrences_in_array;

interface OddOccurrences {
    /**
     * @param A - array of integers.
     * @return Value that occurs in an odd number of elements.
     */
    static int oddOccurrences(int[] A) {
        int result = 0;
        for (final int j : A) {
            int count = 0;
            for (final int k : A) {
                if (j == k) {
                    count++;
                }
            }
            if (count == 1) {
                result = j;
                break;
            }
        }
        return result;
    }
}
