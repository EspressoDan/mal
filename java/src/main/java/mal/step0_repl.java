package mal;

import java.util.Scanner;

public class step0_repl {

    public static String READ(String input) {
        return input;
    }

    public static String EVAL(String input) {
        return input;
    }

    public static String PRINT(String input) {
        return input;
    }

    public static String repl(String input) {
        return PRINT(EVAL(READ(input)));
    }

    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("user> ");
            input = scan.nextLine();
            if (input.equals("\n") || input.equals("\n\r")) {
                return;
            } else {
                System.out.println(repl(input));
            }
        }
    }
}
