import java.util.Scanner;

public class ArrayUsage {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        n = takeInput.nextInt();
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = takeInput.nextInt();
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(arr[j]);
        }
    }
}
