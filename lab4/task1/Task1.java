package lab4.task1;

import lab4.InputHandler;
import lab4.ExpressionsHandler;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> expressionsList = InputHandler.readFile("D:\\IntelliProjects\\Projects\\Lab1\\src\\lab4\\one_expression.txt");

        String expression = expressionsList.get(0);
        System.out.println("Expression: " + expression);

        if (ExpressionsHandler.parenthesisChecker(expression) == 0) {
            System.out.println("Parenthesis put in CORRECT order.");
        } else System.out.println("Parenthesis put in INCORRECT order!");
    }

}
