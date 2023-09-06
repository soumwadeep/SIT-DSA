public class MajorElement {
    public static int findMajorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majorityElement = nums[i];
                    count = 1;
                }
            }
        }

        // At this point, majorityElement may be the majority element, but we should verify.
        count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return majorityElement;
        } else {
            // No majority element found
            return -1; // or any other appropriate value
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4, 2, 2, 5};
        int majority = findMajorityElement(nums);

        if (majority != -1) {
            System.out.println("The majority element is: " + majority);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
