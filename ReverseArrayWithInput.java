import java.util.Scanner;

public class ReverseArrayWithInput 
{
    public static void main(String[] args) {
        Scanner takeInputs = new Scanner(System.in);
        System.out.println("Give Me The Size Of Your Array:");
        int arraySize = takeInputs.nextInt();
        int arr[] = new int[arraySize];
        System.out.println("Enter All Your Elements:");
        for(int i = 0; i < arraySize; i++)
        {
            arr[i] = takeInputs.nextInt();
        }
        System.out.println("Your Entered Array:");
        for(int i=0;i<arraySize;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Array In Reverse:");
        for(int i=arraySize-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

    }
}
