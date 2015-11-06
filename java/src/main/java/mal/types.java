package mal;

import java.util.ArrayList;

/**
 * Created by EspressoDan on 11/5/15.
 */
public class types {

    public static class MalType {
        // TODO What goes here?
    }

    public static class MalList extends MalType {
        ArrayList<MalType> list;
    }

    public static class MalInt extends MalType {

        @Override
        public String toString() {
            return "MalInt{}";
        }

        // TODO What goes here?
    }

    public static class MalSymbol extends MalType {
        // TODO What goes here?
    }
}
