package Lezione07;

/**
 * Created by nikyw on 17/03/2017.
 */
public class Echo {
    public static void main(String[] args) {
        // Stampa i parametri che vengono passati al main (args[])

        for (int i = 0; i < args.length; ++i)
            System.out.print(args[i] + " ");
        System.out.println();
        System.out.print("la lunghezza è: " + args.length);
    }
}
