import java.util.*;
import java.io.*;

public class Main {

    static class Pair {
        int min;
        int max;
    }

    public static void main(String[] args) {

        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arraySize = arr.length;

        System.out.println("Sum of maximum and minimum number of an array is :: " + FindSum(arr, arraySize));

    }

    // This Searching Technique was Sorting using the in-built method
//    static int FindSum(int[] array, int Length) {
//        Arrays.sort(array);
//        return array[0] + array[Length - 1];
//    }

    // The below method uses the Linear Search Approach
    static int FindSum(int a[], int length) {
        if (length < 1)
            return 0;

        if (length == 1)
            return a[0] + a[0];

        Pair pair = new Pair();

        if (a[0] > a[1]) {
            pair.min = a[1];
            pair.max = a[0];
        } else {
            pair.min = a[0];
            pair.max = a[1];
        }

        for (int i = 2; i < length; i++) {
            if (a[i] > pair.max) {
                pair.max = a[i];
            } else if (a[i] < pair.min) {
                pair.min = a[i];
            }
        }

        return pair.max + pair.min;
    }
}

/*

Arrays Question 1 -
Find Sum of Minimum and Maximum element in an array

My Solution :
class Solution
{
    public static int findSum(int A[],int N)
    {
        int _biggestNumber = A[0];
        int _smallestNumber = A[0];

        for (int index = 0; index < N; index++) {
            if (A[index] > _biggestNumber)
                _biggestNumber = A[index];

            if (A[index] < _smallestNumber)
                _smallestNumber = A[index];
        }

        return _biggestNumber + _smallestNumber;
    }
}



 */