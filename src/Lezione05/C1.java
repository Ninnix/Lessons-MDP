package Lezione05;

/**
 * Created by nikyw on 06/03/2017.
 */
public class C1 {
    //una classe

    public int a = 1;
    public int b = 2;

    public void ciao (String s) {
        System.out.println("ciao " + s);
    }

    public void blah() {
        System.out.println(a + b);
    }
}

//se creo in C2 un metodo con lo stesso nome ma che prende un intero in input java li vede come due diversi
//metodi completamente diversi ma con lo stesso nome questo è un overloading cioè sovracarico del nome di quel metodo, mentre un override è quando ridefinisco lo stesso
//metodo con stessi parametri di input
//in una sottoclasse posso fare l'overriding sia di metodi che di attributi, nell override non posso ridefinire il tipo dell' output
