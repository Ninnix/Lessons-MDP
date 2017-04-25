package Lezione4;

/**
 * Created by nikyw on 03/03/2017.
 */
public class TestListe {
    public static void main (String[] args) {
    //gioca con le liste
        IntList l1 = new IntList(1, new IntList(9, new IntList(5,
                null)));
        IntList l2 = new IntList(3, new IntList(7, null));
        l2.concat(l1); // concatena l2 con l1; ora l2 ha 5 elementi
        l2.stampalista(4); // stampa i primo 4 elemento di l2
        l2.stampalista(10); // stampa tutta l2 (dato che ha meno di 10 elementi)
        l2.luppa(); // concatena l2 con se stessa: si crea un loop!
        l2.stampalista(50); // esegue 50 stampe degli elementi di l2, percorrendola in cerchio
    }
}
