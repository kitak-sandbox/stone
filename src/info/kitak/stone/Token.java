package info.kitak.stone;

/**
 * Created by kitak on 6/8/16.
 */
public class Token {
    public static final info.kitak.stone.Token EOF = new info.kitak.stone.Token(-1){};
    public static final String EOL = "\\n";
    private int lineNumber;

    protected Token(int line) {
        lineNumber = line;
    }

    public int getLineNumber() { return lineNumber; }
    public boolean isIdentifier() { return false; }
    public boolean isNumber() { return false; }
    public boolean isString() { return false; }
    public int getNumber() { throw new StoneException("not number token"); }
    public String getText() { return ""; }
}
