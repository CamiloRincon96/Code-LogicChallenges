import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {


    }

    class Solution {


        public boolean isValid(String s) {

            if (s.length()%2 != 0) {
                return false;
            }

            Stack<Character> element = new Stack<>();

            for (char c: s.toCharArray()) {

                if (c == '(' || c == '[' || c == '{') {
                    element.push(c);
                } else {
                    if (element.isEmpty()) {
                        return false;
                    }
                    char top = element.pop();
                    return respectiveCouple(top, c);
                }
            }
            return element.isEmpty();
    }

    public boolean respectiveCouple(char open, char close) {
        return (open == '(' && close == ')' ||
                open == '[' && close == ']' ||
                open == '{' && close == '}');
        }
    }
}