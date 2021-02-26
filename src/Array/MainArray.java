package Array;

public class MainArray {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        for(int counter =1; counter <  myArray.length; counter++){
            myArray[counter] = counter * 10;
            System.out.println(myArray[counter]);
        }
    }
}