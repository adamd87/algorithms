##   Algorithms solutions


###   Array of unique numbers

  Array of random unique numbers of length N, the sum of the numbers equal to 0.

```java
public static void arrayOfRandomUniqueNumbers(int n) {
        int[] array = new int[n];

        do {
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * 100);
                for (int j = 0; j < i; j++) {
                    while (array[i] == array[j]) {
                        array[i] = (int) (Math.random() * -100);
                        j = 0;
                    }
                }
            }
        } while (!isEqualZero(array));

        System.out.println(Arrays.toString(array));
        System.out.println("Sum = " + findSum(array));
        System.out.println(isEqualZero(array));
    }

    public static boolean isEqualZero(int[] array) {
        return  (findSum(array) == 0);
    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
```
 
  
###   Rotation
  Rotation of the array.
  Given an array A consisting of N integers, each element of A will be shifted to the right K times, return the array A rotated K times.  
  
```java
public static int[] cyclingRotation(int[] A, int K) {
        int[] result = new int[A.length];
        
        for (int i = 0; i <= A.length - 1; i++) {
            result[(i + K) % A.length] = A[i];
        }       
        return result;
    }
```
 
 
###   Odd occurrences
  Value that occurs in a odd number of elements.
  
```java
public static int oddOccurrences(int[] A) {
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
```
###   Binary
  Binary representation of an integer.
 
```java
public static void binaryRepresentation(int N) {
        System.out.println("Binary representation of " + N + ":");
        for (int i = 15; i >= 0; i--) {
            if ((N & 0b1 << i) != 0b0)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
```
 
###   Binary gap 
  A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
    Returns the sum of the zeros of the greater binary gap.
 
```java
public static int binaryGap(int N) {
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
```


 

