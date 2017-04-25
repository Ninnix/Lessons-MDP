package Lezione4;

/**
 * Created by nikyw on 03/03/2017.
 */
public class IntList {
    //Liste di Interi
    public int head;
    public IntList tail;

    IntList(int h, IntList t) { //costruttore
        head = h;
        tail = t;
    }

    public void stampalista (int n) {
        //stampa la lista, ma non oltre l'n-esimo elemento
        if (n <= 0) {
            System.out.println();
            return;
        }
        System.out.print(head + " ");
        if (tail == null)
            System.out.println();
        else {
            tail.stampalista(n-1);
        }
    }

    public void concat (IntList l) {
        //concatena this con l, gli passo una lista in input, e la attacca in fondo a un altra
        if (tail == null) tail = l; //caso base
        else { tail.concat(l); //ricorsivamente chiama concat di tail, l --> diventa la tail
        }
    }

    public void luppa () {
        //concatena this a se stesso. Si crea un loop!
        concat(this); //pseudo variabile this --> rappresenta l'oggetto stesso dentro cui sto vivendo STUDIALA!!!
    }
}
