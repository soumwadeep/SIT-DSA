import java.util.Scanner;

public class CountTheIndexOfMid {
    public static void main(String[] args) {
        Scanner takeInputs = new Scanner(System.in);
        System.out.println("Give Me The Size Of Your Array:");
        int arraySize = takeInputs.nextInt();
        int arr[] = new int[arraySize];
        System.out.println("Enter All Your Elements:");
        for(int i = 0; i < arraySize; i++)
        {
            arr[i] = takeInputs.nextInt();//0,1,2,3,4
        }
        System.out.println("Array:");
        for(int i = 0; i < arraySize; i++)
        {
            System.out.println(arr[i]);
        }
        int FirstValue = arr[0];
        int LastValue = arr[arraySize-1];
        int MidValue = (FirstValue+LastValue)/2;
        System.out.println("Mid Value:");
        System.out.println(MidValue);
    }
}
