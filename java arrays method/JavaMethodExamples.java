import java.util.Arrays;
import java.util.Comparator;

public class JavaMethodExamples {

    public static void main(String[] args) {
        // 1. sort Method
        System.out.println("\n1. sort Method:");
        Integer[] numbersToSort = {5, 2, 8, 1, 9, 4};
        String[] stringsToSort = {"banana", "apple", "orange", "grape"};

        // Sort primitive array (ascending order)
        int[] primitiveIntArray = {5, 2, 8, 1, 9, 4};
        Arrays.sort(primitiveIntArray);
        System.out.println("Sorted primitive int array: " + Arrays.toString(primitiveIntArray));

        // Sort Integer array (ascending order) - uses natural ordering
        Arrays.sort(numbersToSort);
        System.out.println("Sorted Integer array: " + Arrays.toString(numbersToSort));

        // Sort String array (lexicographical order)
        Arrays.sort(stringsToSort);
        System.out.println("Sorted String array: " + Arrays.toString(stringsToSort));

        // Sort in descending order using a Comparator (for objects, like Integer)
        Arrays.sort(numbersToSort, Comparator.reverseOrder());
        System.out.println("Sorted Integer array (descending): " + Arrays.toString(numbersToSort));

        // 2. binarySearch Method
        System.out.println("\n2. binarySearch Method:");
        int[] sortedNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        int index = Arrays.binarySearch(sortedNumbers, key);
        if (index >= 0) {
            System.out.println("Found " + key + " at index " + index);
        } else {
            System.out.println(key + " not found (returned " + index + ")");
        }

        int keyNotFound = 10;
        int notFoundIndex = Arrays.binarySearch(sortedNumbers, keyNotFound);
        System.out.println(keyNotFound + " not found (returned " + notFoundIndex + ")"); //Illustrates the negative return value

        // Binary search in a String array
        String[] sortedStrings = {"apple", "banana", "grape", "orange"};
        int stringIndex = Arrays.binarySearch(sortedStrings, "banana");
        if (stringIndex >= 0) {
            System.out.println("Found 'banana' at index " + stringIndex);
        } else {
            System.out.println("'banana' not found");
        }
        //Example with a range
        int[] sortedNumbersRange = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int fromIndex = 2;
        int toIndex = 6;
        int searchKey = 5;
        int foundIndex = Arrays.binarySearch(sortedNumbersRange, fromIndex, toIndex, searchKey);
        System.out.println("Found " + searchKey + " in range [" + fromIndex + ", " + toIndex + "): " + foundIndex);

        // 3. equals Method
        System.out.println("\n3. equals Method:");
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {4, 5, 6};
        int[] array4 = {1, 2, 3, 4}; // Different length

        System.out.println("array1 equals array2: " + Arrays.equals(array1, array2)); // true
        System.out.println("array1 equals array3: " + Arrays.equals(array1, array3)); // false
        System.out.println("array1 equals array4: " + Arrays.equals(array1, array4)); // false

        //Demonstrate equals with Object Arrays
        Integer[] integerArray1 = {1, 2, 3};
        Integer[] integerArray2 = {1, 2, 3};
        System.out.println("integerArray1 equals integerArray2: " + Arrays.equals(integerArray1, integerArray2));

        // 4. compare Method
        System.out.println("\n4. compare Method:");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        int[] arr4 = {1, 2};

        System.out.println("arr1 compare arr2: " + Arrays.compare(arr1, arr2)); // 0 (equal)
        System.out.println("arr1 compare arr3: " + Arrays.compare(arr1, arr3)); // -1 (arr1 < arr3)
        System.out.println("arr3 compare arr1: " + Arrays.compare(arr3, arr1)); // 1 (arr3 > arr1)
        System.out.println("arr1 compare arr4: " + Arrays.compare(arr1, arr4)); // 1 (arr1 > arr4)

        // Example with Comparable objects (using String)
        String[] strArr1 = {"apple", "banana", "cherry"};
        String[] strArr2 = {"apple", "banana", "cherry"};
        String[] strArr3 = {"apple", "banana", "date"};
        System.out.println("strArr1 compare strArr2: " + Arrays.compare(strArr1, strArr2));
        System.out.println("strArr1 compare strArr3: " + Arrays.compare(strArr1, strArr3));

        // 5. fill Method
        System.out.println("\n5. fill Method:");
        int[] arrayToFill = new int[5];
        Arrays.fill(arrayToFill, 10);
        System.out.println("Filled array: " + Arrays.toString(arrayToFill));

        String[] stringArrayToFill = new String[3];
        Arrays.fill(stringArrayToFill, "Hello");
        System.out.println("Filled string array: " + Arrays.toString(stringArrayToFill));

        // 6. copyOf Method
        System.out.println("\n6. copyOf Method:");
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copy1 = Arrays.copyOf(originalArray, originalArray.length); // Copy the whole array
        System.out.println("Copy of original array: " + Arrays.toString(copy1));

        int[] copy2 = Arrays.copyOf(originalArray, 3); // Copy only the first 3 elements
        System.out.println("Copy with length 3: " + Arrays.toString(copy2));

        int[] copy3 = Arrays.copyOf(originalArray, 7); // Copy with length greater than original
        System.out.println("Copy with length 7: " + Arrays.toString(copy3)); //Fills with default values

        // 7. deepToString Method
        System.out.println("\n7. deepToString Method:");
        int[][] multiDimensionalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Deep string representation: " + Arrays.deepToString(multiDimensionalArray));

        String[][] string2DArray = {
                {"a", "b"},
                {"c", "d", "e"},
                {"f"}
        };
        System.out.println("Deep string for 2D String array: " + Arrays.deepToString(string2DArray));

        //Example with a 3D array
        int[][][] threeDArray = {
                { {1, 2}, {3, 4} },
                { {5, 6}, {7, 8} }
        };
        System.out.println("Deep string for 3D int array: " + Arrays.deepToString(threeDArray));
    }
}