public class SecondLastUsingLinSearch {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50, 60, 70 };

        int secondToLast = findSecondToLastElement(array);

        if (secondToLast != -1) {
            System.out.println("The second-to-last element is: " + secondToLast);
        } else {
            System.out.println("The array doesn't have a second-to-last element.");
        }
    }

    public static int findSecondToLastElement(int[] arr) {
        if (arr.length < 2) {
            return -1; // Array doesn't have a second-to-last element
        }

        int secondToLast = arr[0];
        int last = arr[1];

        for (int i = 2; i < arr.length; i++) {
            secondToLast = last;
            last = arr[i];
        }

        return secondToLast;
    }
}
