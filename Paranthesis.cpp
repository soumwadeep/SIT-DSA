#include <iostream>
#include <stack>
#include <string>
using namespace std;

bool isValidParentheses(const string& s) {
    stack<char> stack;
    
    for (char c : s) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else if (c == ')' || c == '}' || c == ']') {
            if (stack.empty()) {
                return false; // There is no corresponding opening parenthesis
            }
            
            char top = stack.top();
            stack.pop();
            
            // Check if the current closing parenthesis matches the last opening one
            if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                return false;
            }
        }
    }
    
    // If the stack is not empty, there are unmatched opening parentheses
    return stack.empty();
}

int main() {
    string input;
    cout << "Enter a string with parentheses: ";
    cin >> input;

    if (isValidParentheses(input)) {
        cout << "Parentheses are valid.\n";
    } else {
        cout << "Parentheses are not valid.\n";
    }

    return 0;
}
