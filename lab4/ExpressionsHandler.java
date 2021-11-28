package lab4;

import java.util.Stack;

public class ExpressionsHandler {
    public static int parenthesisChecker(String expression) {
        Stack<String> stack = new Stack<>();
        String[] chArray = expression.split("(?!^)");
        int wrong = 0;

        OUTER:
        for (String character : chArray) {
            switch (character) {
                case "(":
                case "[":
                    stack.push(character);
                    break;
                case ")":
                    if (!stack.empty() && stack.peek().equals("("))
                        stack.pop();
                    else {
                        wrong = 1;
                        break OUTER;
                    }
                    break;
                case "]":
                    if (!stack.empty() && stack.peek().equals("["))
                        stack.pop();
                    else {
                        wrong = 1;
                        break OUTER;
                    }
                    break;
            }
        }

        if (!stack.empty())
            wrong = 1;
        return wrong;
    }
}
