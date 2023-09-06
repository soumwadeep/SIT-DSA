import java.util.Scanner;

class ReverseWord {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close(); // Close the scanner when done

        String reversedString = reverseWords(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}
