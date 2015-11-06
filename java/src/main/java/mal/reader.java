package mal;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mal.types.*;

/**
 * Created by EspressoDan on 11/5/15.
 */
public class reader {

    public static class Reader {
        private ArrayList<String> tokens;
        private int position;

        public Reader(ArrayList<String> tokens) {
            this.tokens = tokens;
            position = 0;
        }

        public String peek() {
            return tokens.get(position);
        }

        public String next() {
            return tokens.get(position++);
        }

    }

    public static MalType read_str(String input) {
        ArrayList<String> tokens = tokenizer(input);
        Reader myReader = new Reader(tokens);
        read_form(myReader);
        // make new Reader object with tokens
        // read_form()

        return null;
    }

    public static ArrayList<String> tokenizer(String input) {
        String regex = "[\\s ,]*(~@|[\\[\\]{}()'`~@]|\"(?:[\\\\].|[^\\\\\"])*\"|;.*|[^\\s \\[\\]{}()'\"`~@,;]*)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        ArrayList<String> tokens = new ArrayList<String>();
        while (m.find()) {
            String token = m.group();
            // TODO error checking
            tokens.add(token);
        }
        return tokens;
    }

    public static MalType read_form(Reader r) {
        String next = r.peek();
        switch (next) {
            case "(":
                read_list(r);
                break;
            default:
                read_atom(r);
        }
        return new MalType();
    }

    private static void read_atom(Reader r) {

    }

    private static void read_list(Reader r) {
        ArrayList<MalType> list = new ArrayList<>();

        list.add(read_form(r));

    }
}