package Day6;

import java.util.Arrays;

public class ArrayFunctions {
    public static void main(String[] args) {
        int arr1[]={1,2,5,4,3};
        int arr2[]={1,2,3,4,5};

        // check if two arrays are equal
        boolean isEqual= Arrays.equals(arr1,arr2);
        System.out.println(isEqual);

        //search for an element in an array using binary search
        int index=Arrays.binarySearch(arr1,2);
        System.out.println(index);

        //to sort array in ascending order
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //fill an array with specific value
        int [] arr3=new int[5];
        Arrays.fill(arr3,1);
        System.out.println(Arrays.toString(arr3));

        //create new array that is copy of original array
        int [] arr4=Arrays.copyOf(arr1,3);
        System.out.println(Arrays.toString(arr4));

        //return hashcode of an array
        int hashcode=Arrays.hashCode(arr1);
        System.out.println(hashcode);

        //comparing multi-dimensional array
        int [][]a={{1,2},{3,4}};
        int [][]b={{1,2},{3,4}};
        boolean equal=Arrays.deepEquals(a,b);
        System.out.println(equal);

        //Sorting using parallelSort()
        //dividing the array into smaller sub-arrays and sorting them independently in parallel threads
        //uses the Fork/Join framework to execute the sorting algorithm in parallel.
        //is intended for use with large arrays, where the cost of dividing the array into sub-arrays and executing the sort algorithm in parallel is justified
        int []c={1,2,5,8,9,4,7,6,3};
        Arrays.parallelSort(c);
        System.out.println(Arrays.toString(c));
    }
}

