import java.util.*;

public class ValidParenthesis {
    Map<Character, Character> parenthesisMap;

    public ValidParenthesis() {
        parenthesisMap = Map.of('(', ')', '[', ']', '{', '}');
    }

    public boolean isValid(String s) {
        if (s.trim().isEmpty()) {
            return true;
        }

        Stack<Character> parenthesis = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            if (parenthesisMap.containsKey(character)) {
                parenthesis.push(character);
            } else {
                if (parenthesis.empty()) {
                    return false;
                }
                char prevOpening = parenthesis.pop();
                char correspondingClosing = parenthesisMap.get(prevOpening);
                if (correspondingClosing != character) {
                    return false;
                }
            }
        }

        return parenthesis.empty();
    }

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();

        assert validParenthesis.isValid("");
        assert validParenthesis.isValid("()");
        assert validParenthesis.isValid("()[]{}");
        assert !validParenthesis.isValid("(]");
        assert !validParenthesis.isValid("([)]");
        assert validParenthesis.isValid("()((()))[[]][{}]{{[]}}");
        assert !validParenthesis.isValid("([](");
        assert !validParenthesis.isValid("((((((");
        assert !validParenthesis.isValid("))))))");

        System.out.println("All tests passed");
    }
}
