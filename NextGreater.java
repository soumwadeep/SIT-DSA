import java.util.*;

public class NextGreater {
    public static int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1); // Initialize the result array with -1

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;

        // Iterate through the array in a circular manner
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                int index = stack.pop();
                result[index] = num;
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int[] nextGreater = nextGreaterElements(nums);

        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Next Greater Elements: " + Arrays.toString(nextGreater));
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
