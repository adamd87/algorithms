##   My algorithms solutions


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
  Rotation of the array

```java
    public static int[] cyclingRotation(int[] A, int K) {
        int[] result = new int[A.length];

        // each loop returns index A[i] in the result array
        for (int i = 0; i <= A.length - 1; i++) {
            result[(i + K) % A.length] = A[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
```
 
 
###   Odd occurrences
  Value that occurs in a odd number of elements
  
  ![image](https://user-images.githubusercontent.com/76003029/132076172-1c64c1ef-5a3b-4e09-8fca-b0d7665f98b5.png)
  

###   Binary
  Binary representation of an integer
 
 ![image](https://user-images.githubusercontent.com/76003029/131583130-200b8a4d-7de5-4a19-a40e-8210dd7e908f.png)
 
 
###   Binary gap 
  A binary gap within a positive integer
 
 ![image](https://user-images.githubusercontent.com/76003029/131582293-ec604123-a672-4364-9732-0c4004265a21.png)


 

