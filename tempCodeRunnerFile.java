import java.util.*;

public class ArrayStringDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> inputList = new ArrayList<>();

        System.out.print("Enter words separated by spaces: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        
        for (String word : words) {
            inputList.add(word);
        }

        ArrayList<String> duplicates = findDuplicates(inputList);

        System.out.println("Duplicate words in the list: " + duplicates);
    }

    public static ArrayList<String> findDuplicates(ArrayList<String> list) {
        ArrayList<String> duplicates = new ArrayList<>();
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String word : list) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        for (String word : frequencyMap.keySet()) {
            if (frequencyMap.get(word) > 1) {
                duplicates.add(word);
            }
        }

        return duplicates;
    }
}
