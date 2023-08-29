public public class ReplaceLargestOdd {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 4, 9, 6, 11, 15, 10};
        int replacement = 17;

        int largestOddIndex = findLargestOddIndex(numbers);

        if (largestOddIndex != -1) {
            numbers[largestOddIndex] = replacement;
            System.out.println("Largest odd number replaced.");
        } else {
            System.out.println("No odd numbers found in the array.");
        }

        // Print the updated array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static int findLargestOddIndex(int[] arr) {
        int largestOddIndex = -1;
        int largestOdd = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > largestOdd) {
                largestOdd = arr[i];
                largestOddIndex = i;
            }
        }

        return largestOddIndex;
    }
}
 {
    
}
