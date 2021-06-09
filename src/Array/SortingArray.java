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
import java.util.Collections;
import java.util.Scanner;



public class SortingArray {

    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        
        Integer [] myArray = getElements(5);

        System.out.println();


        printArray(myArray);
        sortArray(myArray);
    
    }

    private static void sortArray(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());

        System.out.printf("Sorted Array is : %s",
                Arrays.toString(array));


    }


    private static void printArray(Integer[] array) {
        for(int i=0; i < array.length; i++ ){
            System.out.println("Element " + i + " value was " + array[i]);
        }
        System.out.printf("Elements in the array is : %s",
                Arrays.toString(array));
        System.out.println();

    }

    private static Integer[] getElements(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        Integer[] values = new Integer[number];

        for(int i=0; i< values.length; i++){
            values[i] = input.nextInt();
        }
        return values;
    }



}




