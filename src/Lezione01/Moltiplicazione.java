package Lezione01;

import java.util.Scanner;

/**
 * Created by admin on 12-Apr-17.
 */
public class Moltiplicazione {
        public static void main(String[] args) {
            //Calcola la moltiplicazione con l'algoritmo degli antichi egizi
            Scanner reader = new Scanner(System.in);
            System.out.println("Inserire due numeri:");
            int M = reader.nextInt(), m = reader.nextInt(), p = 0;
            //int M = 174, m = 35, p = 0;  //moltiplicando e moltiplicatore e prodotto
            while (M != 1) {
                M = M / 2;
                m = m * 2;
                if (M % 2 != 0) {
                    p += m;
                }
            }
            System.out.println(p);
        }
}
