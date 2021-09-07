package pl.adamd.missing_array_element;



interface Searching {
    /**
     * Search for the missing element
     * @param A an array of integers
     * @return the value of the missing element
     */
    static int findMissingElement(int[] A){
        int sum = 0;
        int max = 0;

        for (int element : A){
            sum += element;
            if(element > max)
                max = element;
        }

        return (max * (max + 1) / 2) - sum;
    }

}
