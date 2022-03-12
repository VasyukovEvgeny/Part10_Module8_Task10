public class StringException extends Exception{
    private char Letter;
    public char getLetter() {
        return Letter;
    }
    public StringException (char Letter){
        this.Letter = Letter;
    }

}
