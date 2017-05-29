package Lezione20;

//Argomenti: Assert. Il metodo delle invarianti. Throwable: errori vs. eccezioni.

public class Aegyptian {
    // Moltiplicazione egiziana con asserzioni. Metodo delle invarianti.
    // Moltiplicazione egiziana (a * b). Attraverso le asserzioni possiamo intercettare
    // errori "untrapped": l'algoritmo non funziona se b<0, ma potremmo non accorgercene.

    public static void main(String[] args) {

        int a = 172;
        int b = 37;
        // int b = -37;

        int x = a, y = b, res = 0;

        assert (y >= 0 && x * y + res == a * b): "invariant = " + (x * y + res == a * b);
        // assert (x * y + res == a * b): "invariant = " + (x * y + res == a * b);

        while (y >= 1) {
            if (y % 2 == 0) {
                x = x + x;
                y = y/2;
            }
            else {
                res = res + x;
                y = y - 1;
            }
            assert (y >= 0 && x * y + res == a * b); // loop invariant
        }
        assert (res == a * b): "senza quest'asserzione: 172 * -37 = 0!";
        System.out.println(a + " * " + b + " = " + res);
    }
}
