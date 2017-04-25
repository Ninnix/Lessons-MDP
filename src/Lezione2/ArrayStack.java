package Lezione2;

/**
 * Created by nikyw on 27/02/2017.
 */
public class ArrayStack {

    private final static int SIZE = 10; //campo
    private int[] stk;
    private int top = -1;

    public ArrayStack() {
        stk = new int[SIZE];
    }

    ArrayStack(int l) {
        stk = new int[l];
    }

    public int lunghezza() {
        return stk.length;
    }

    public void push(int v) {
        //inserisce un intero in cima alla pila
        top = top + 1;
        stk[top] = v;
    }

    public int pop() {
        //estrae l'elemento in cima alla pila (e lo restituisce)
        top = top - 1;
        return stk[top + 1];
    }
}
