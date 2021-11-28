package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputHandler {
    public static ArrayList<String> readFile(String pathname) throws FileNotFoundException {
        ArrayList<String> expressions = new ArrayList<>();

        File file = new File(pathname);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine())
            expressions.add(scanner.nextLine());
        return expressions;
    }
}
