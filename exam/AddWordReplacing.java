package exam;
public class AddWordReplacing {
    public static void main(String[] args) {
        String inputString = "Hello world this is wonderful thought";
        String replacedString = inputString.replaceAll("\\bthought\\b", "Word");

        System.out.println("Original String: " + inputString);
        System.out.println("Replaced String: " + replacedString);
    }
}
