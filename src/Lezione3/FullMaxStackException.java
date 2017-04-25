package Lezione3;

/**
 * Created by nikyw on 02/03/2017.
 */
public class FullMaxStackException extends Exception {
    public int lung;

    FullMaxStackException (int n) {
        lung = n;
    }
}
