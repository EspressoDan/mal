package mal;

import mal.types.*;

/**
 * Created by EspressoDan on 11/5/15.
 */
public class printer {

    public static String pr_str(MalType in) {
        if (in instanceof MalInt) {
            return in.toString();
        } else if (in instanceof MalList) {
            // iterate through list
            // foreach element, pr_str it
            // surround with parens, add spaces between
            return in.toString();
        } else if (in instanceof MalSymbol) {
            return in.toString();
        } else {
            // probably shouldn't have gotten here
            return null;
        }
    }
}
