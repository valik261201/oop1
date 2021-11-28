package lab4.task2;

import lab4.ExpressionsHandler;
import lab4.InputHandler;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> expressionsList = InputHandler.readFile("D:\\IntelliProjects\\Projects\\Lab1\\src\\lab4\\three_expressions.txt");

        while (expressionsList.size() > 0) {
            String expression = expressionsList.remove(0);
            System.out.println("Expression: " + expression);

            if (ExpressionsHandler.parenthesisChecker(expression) == 0) {
                System.out.println("Parenthesis put in CORRECT order.\n");
            } else System.out.println("Parenthesis put in INCORRECT order!\n");
        }
    }
}
