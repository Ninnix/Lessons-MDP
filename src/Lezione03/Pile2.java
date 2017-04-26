package Lezione03;

/**
 * Created by nikyw on 02/03/2017.
 */
public class Pile2 {

    public static void main(String[] args) {
        //gioca con le pile con le eccezioni
        ArrayStack2 S = new ArrayStack2(4);
        ArrayStack3 SSS = new ArrayStack3(2);

        try {
            S.push(5);
            System.out.println(S.pop());
            //System.out.println(S.pop()); //lancia l'eccezione stack vuoto
            S.push(6);
            S.push(7);
            S.push(8);
            S.push(9);
            //S.push(10);
        } catch (FullStackException f) {
            System.out.println("Lo stack è pieno"); //handler
        } catch (EmptyStackException e) {
            System.out.println("Lo stack è vuoto");
        }

        try { //qui si usa l'identificatore dell'eccezione
            SSS.push(5);
            SSS.push(6);
            SSS.push(7);
        } catch (FullMaxStackException m) { //m è un oggetto di tipo FullMaxStackException
            System.out.println("lo stack ha solo " + m.lung + " posti!");
        }
        System.out.println("that's all, folks!");
    }
}