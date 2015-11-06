package mal;

import java.util.Scanner;
import mal.types.*;

public class step1_read_print {

    public static MalType READ(String input) {
        MalType in = reader.read_str(input);
        return in;
    }

    public static MalType EVAL(MalType input) {
        return input;
    }

    public static String PRINT(MalType input) {
        return printer.pr_str(input);
    }

    public static String repl(String input) {
        return PRINT(EVAL(READ(input)));
    }

    @SuppressWarnings("Duplicates")
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
