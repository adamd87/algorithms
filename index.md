>### Array of unique numbers
>Array of random unique numbers of length N, the sum of the numbers equal to 0.

```java
  public static void arrayOfRandomUniqueNumbers(int N) {
      int[] array = new int[N];

      do {
          for (int i = 0; i < N; i++) {
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

>### Absolute difference
>The absolute difference between the parts of split array.

```java
  public static int absoluteDifferenceOfSplitArray(int[] A) {
      int sumX = 0;
      int sumY = 0;

      int[] x = new int[(A.length + 1) / 2];
      int[] y = new int[A.length - x.length];

      for (int i = 0; i < A.length; i++) {
          if (i < x.length)
              x[i] = A[i];
          else 
              y[i - x.length] = A[i];
      }
      for (int element : x) {
          sumX = sumX + element;
      }
      for (int element : y) {
          sumY = sumY + element;
      }
      System.out.println(Arrays.toString(x));
      System.out.println(Arrays.toString(y));
      System.out.println("Absolute difference: ");

      return Math.abs(sumX - sumY);
  }
```

>### Minimal difference
>The minimal difference between the parts of split array.

```java
  public static int minimalDifference(int[] A) {
      int result = 0;
      for (int i = 1; i < A.length; i++) {
          int iNum = 0;
          int sumX = 0;
          int sumY = 0;
          int diff = Integer.MAX_VALUE;

          iNum += i;
          int[] x = new int[A.length - iNum];
          int[] y = new int[A.length - x.length];

          for (int j = 0; j < A.length; j++) {
              if (j < x.length)
                  x[j] = A[j];
              else y[j - x.length] = A[j];
            }

          for (int k = 0; k < x.length-1; k++) {
              sumX = sumX + x[k];
              for (int z = k+1; z < y.length; z++) {
                  sumY = sumY + y[z];
                  if (Math.abs(sumX - sumY) < diff)
                      diff = Math.abs(sumX - sumY);
              }
              result = diff;
          }
      }
      System.out.println("Minimal difference: ");
      return result;
  }
```
  
>### Rotation
>Rotation of the array. Given an array A consisting of N integers, each element of A will be shifted to the right K times, return the array A rotated K times.  
  
```java
  public static int[] cyclingRotation(int[] A, int K) {
      int[] result = new int[A.length];
        
      for (int i = 0; i <= A.length - 1; i++) {
          result[(i + K) % A.length] = A[i];
      }       
      return result;
  }
```

>### Finds a missing element
>Finds a missing element in a given array.
    
```java
  public static int findMissingElement(int[] A){
      int sum = 0;
      int max = 0;

      for (int element : A){
          sum += element;
          if(element > max)
              max = element;
      }
      return (max * (max + 1) / 2) - sum;
  }
``` 
 
>### Odd occurrences
>Value that occurs in a odd number of elements.
  
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
>### Binary
>Binary representation of an integer.
 
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
 
>### Binary gap 
>A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
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

>### Count of moves
>Calculates the minimum number of moves from position X to Y.
  
```java
  public static int move(int X, int Y, int D) {
      int distance = X + D;
      int numOfMoves = 1;

      if (X == Y) {
          return 0;
      }
      while (distance < Y) {
          distance = distance + D;
          numOfMoves += 1;
      }
      return numOfMoves;
  }
```

>### Max counters
>Calculates the values of the counters after all alternating operations: increments the counter by 1 or sets the value of all counters to the current maximum.

```java
  public static int[] maxCount(int N, int[] A){
      int[] counter = new int[N];
      int max = -1;
      int min = 0;

      for (int element : A) {
          if (element >= 1 && element <= N) {
              if (counter[element - 1] < min)
                  counter[element - 1] = min;
              counter[element - 1] = counter[element - 1] + 1;
              if (counter[element - 1] > max)
                  max = counter[element - 1];
          } else if (element == N + 1) {
              min = max;
          }
      }
      
      for (int i = 0; i < N; i++) {
          if (counter[i] < min)
              counter[i] = min;
      }
      
      return counter;
  }
```

>### Possibility of movement
>The move can be made when the array element equals X and returns the index of the array element, otherwise returns -1. 

```java
  public static int earliestPossibilityToMove(int X, int[] A) {
      int result = 0;
      for (int i = 0; i < A.length; i++) {
          if (A[i] > X) {
              result = -1;
              break;
          }
          if (A[i] == X) {
              result = i;
          }
      }
      return result;
  }
```

>### Permutations
>Checks if array A is a permutation, returns "1" if it is, or "0" if it isn't.

```java
  public static int permutation(int[] A){
      Set<Integer> integerSet = new HashSet<>();
      int max = 0;
      int result = 0;

      for (int element : A) {
          integerSet.add(element);
          max = Math.max(max, element);
      }
      if (max != A.length) return result;
      if (integerSet.size() == A.length) result = 1;

      return result;
    }
```

>### Smallest positive integer
>Finds smallest positive integer not in the given sequence.

```java
  public static int findMissingInt(int[] A) {
      int result = 1;
      Arrays.sort(A);

      for (int element : A) {
          if (element == result) {
              result++;
          }
      }
      return result;
  }
```

