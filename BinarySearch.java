/*
Daniel Herbowy
Chaparral Star Academy
Mr. Davis 
4/21/2016
+searches an array02
 */


package main;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        while (beginning <= end) {
            int middle=beginning+(end-beginning)/2;
            if (searchedValue<array[middle]) {
                end = middle - 1;
            } else 
            if (searchedValue>array[middle]) { 
                beginning = middle + 1;
            } else 
            return true;
        }
        return false;
    }
}

