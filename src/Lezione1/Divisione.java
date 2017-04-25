package Lezione1;

/**
 * Created by admin on 12-Apr-17.
 */
public class Divisione {
    public static void main (String[] args) {
        //divisone fra due numeri con resto
        int D = 100, d = 7; //Dividendo e divisore
        int Q = 0, r = D;   //Quoziente  e resto
        while (r >= d) {
            Q = Q + 1;
            r = r - d;
        }
        System.out.println("Quoziente " +Q);
        System.out.println("Resto " +r);

    }
}
