import java.util.*;
public class ArrayStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a list of strings separated by spaces: ");
        String input = scanner.nextLine();
        
        String[] elements = input.split(" ");
        ArrayList<String> arrayList = new ArrayList<>();
        
        for (String element : elements) {
            arrayList.add(element);
        }
        
        Collections.reverse(arrayList);
        
        System.out.println("Reversed ArrayList: " + arrayList);
    }
}
