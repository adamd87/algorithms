package pl.adamd.missing_array_element;

import static pl.adamd.missing_array_element.Searching.findMissingElement;

class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7};
        System.out.println(findMissingElement(a));
    }
}
