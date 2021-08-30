package pl.adamd.a_binary_gap_within_a_positive_integer;


interface Binary {
    /**
     * Binary representation of an integer N.
     */
    static void binaryRepresentation(int N) {
        System.out.println("Binary representation of " + N + ":");
        for (int i = 15; i >= 0; i--) {
            if ((N & 0b1 << i) != 0b0)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }

    /**
     * A binary gap within a positive integer N
     * is any maximal sequence of consecutive zeros
     * that is surrounded by ones at both ends
     * in the binary representation of N.
     *
     * @return The sum of the zeros of the greater binary gap.
     */
    static int binaryGap(int N) {
        String binary = Integer.toBinaryString(N);
        int count = 0;
        int tempCount = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                if (i > 0 && binary.charAt(i - 1) == '1') {
                    tempCount++;
                } else {
                    if (tempCount > 0) tempCount++;
                }
            } else if (binary.charAt(i) == '1') {
                if (tempCount > 0 && tempCount > count) {
                    count = tempCount;
                }
                tempCount = 0;
            }
        }
        System.out.println("\nThe largest binary gap of " + N + ":\n" + count);
        return count;
    }

}
