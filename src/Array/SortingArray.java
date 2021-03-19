package Array;

/* -create a program using array that sorts a list of integers in descending order
   -descending order is highest value to lowest value
   -set the program so that numbers are read and sorted from the key board
   -implement the following methods - get integer, print array, and sort integer
   -get integers returns an array of entered integers from the keyboard
   -sort integers should sort the array and return a new array containing the sorted number
   - you'll have to figure a way to copy the array elements from the passed array into
   - array and sort them and return the new sorted array
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

    private static Scanner input = new Scanner(System.in);
    private static int capacity;


    public static void main(String[] args) {

        int myIntegers[] = new int[capacity];
        System.out.println("Enter capacity of array");
        capacity = input.nextInt();

        printArray(myIntegers);
    }

    private static void printArray(int[] newArray) {
        newArray = new int[5];
        int i;
        for (i = 0; i <= newArray.length; i++) {
            System.out.println("Elements" + i + "contents" + newArray[i]);
            newArray[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(newArray));
    }


}




