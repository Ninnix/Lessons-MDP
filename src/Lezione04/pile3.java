package Lezione04;

/**
 * Created by nikyw on 03/03/2017.
 */
public class pile3 {

    public static void main(String[] args) {
        // gioca con le pile fatte a lista
        ListStack l = new ListStack();
        System.out.println(l.is_empty());
        l.push(6);
        l.push(3);
        try {
            l.pop();
            System.out.println(l.pop());
        } catch (EmptyStackException e) {
                System.out.println("stack è vuoto!");
        }
    }
}
