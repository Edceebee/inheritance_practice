package Array;
/*
1. write a method called reverse() with an int array as a parameter
2. the method should not return any value, in other words the method is allowed to modify the parameter.
3. in the main() test the reverse() method, and print the array both reversed and non reversed.
4. to reverse the array,you have to swap the elements , so that the first element is swapped with the last element and so on.

 */


import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int [] array = {3,9,12,15,18};

        reverse(array);
        System.out.println();
        max(array);

        min(array);

    }

    public static void reverse(int[] array) {
        System.out.println("Array as it is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print( + array[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");

        }
    }

    public static void max(int[] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("the maximum value in array is :" + max);

    }

    public static void min(int[] array) {
        int min = array[0];

        for(int i = 0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }

        }
        System.out.println("the minimum value in array is: " + min);
    }
}

