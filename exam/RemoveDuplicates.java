package exam;
import java.util.*;

public class RemoveDuplicates {
    public static List<String> removeDuplicates(List<String> emails) {
        Set<String> uniqueEmails = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (String email : emails) {
            // Normalize the email addresses (e.g., convert to lowercase)
            String normalizedEmail = email.toLowerCase();

            if (!uniqueEmails.contains(normalizedEmail)) {
                uniqueEmails.add(normalizedEmail);
                result.add(email); // Add the original email to the result list
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> emailList = new ArrayList<>();
        emailList.add("john.doe@example.com");
        emailList.add("jane.smith@example.com");
        emailList.add("jOhN.dOe@example.com"); // Duplicate
        emailList.add("jane.smith@example.com"); // Duplicate
        emailList.add("alice@example.com");

        List<String> uniqueEmails = removeDuplicates(emailList);

        System.out.println("Original List:");
        for (String email : emailList) {
            System.out.println(email);
        }

        System.out.println("\nList with Duplicate Emails Removed:");
        for (String email : uniqueEmails) {
            System.out.println(email);
        }
    }
}
