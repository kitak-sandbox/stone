package info.kitak.stone;

import stone.ast.ASTree;

/**
 * Created by kitak on 6/8/16.
 */
public class StoneException extends RuntimeException {
    public StoneException(String m) { super(m); }
    public StoneException(String m, ASTree t) {
        super(m + " " + t.location());
    }

    /**
     * Created by kitak on 6/8/16.
     */
    public static class Token {
    }
}
