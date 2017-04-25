package Lezione2;

/**
 * Created by nikyw on 27/02/2017.
 */
public class Pile {

    public static void main (String[] args) {

        ArrayStack S = new ArrayStack();
        //giochiamo con le pile
        System.out.println("Ho creato uno stack di lunghezza "+ S.lunghezza());
        S.push(5);
        S.push(8);
        System.out.println(S.pop());
        System.out.println(S.pop());
        // System.out.println(S.pop()); // okkio!!

        S = new ArrayStack(2);
        System.out.println("Ho creato uno stack di lunghezza "+ S.lunghezza());
        S.push(6);
        S.push(3);
        //S.push(1); // okkio!!

    }
}
