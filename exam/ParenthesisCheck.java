package exam;   
import java.util.*;

public class ParenthesisCheck {
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing parenthesis
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched pair of parentheses
                }
            }
        }

        // If the stack is empty, all parentheses are matched
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        String expression1 = "{{{(}) [(\"Hello World\")]}";
        String expression2 = "{[()]}";
        
        boolean balanced1 = areParenthesesBalanced(expression1);
        boolean balanced2 = areParenthesesBalanced(expression2);
        
        System.out.println("Expression 1 is balanced: " + balanced1);
        System.out.println("Expression 2 is balanced: " + balanced2);
    }
}